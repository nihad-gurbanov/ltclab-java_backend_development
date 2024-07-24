package com.ltc.student.service;

import com.ltc.student.client.TelegramFeignClient;
import com.ltc.student.dto.telegram.TelegramRequestDto;
import com.ltc.student.dto.telegram.TelegramRoot;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TelegramService {
    private final TelegramFeignClient telegramFeignClient;

    public TelegramRoot getUpdates() {
        TelegramRoot updates = telegramFeignClient.getUpdates(0);
        Integer updateId = updates.result.get(updates.getResult().size() - 1).getUpdate_id();

        return telegramFeignClient.getUpdates(updateId);
    }

    public void sendMessage(TelegramRequestDto telegramRequestDto) {
        telegramFeignClient.sendMessage(telegramRequestDto);
    }
}
