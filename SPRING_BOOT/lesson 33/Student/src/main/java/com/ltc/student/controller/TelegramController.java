package com.ltc.student.controller;

import com.ltc.student.dto.telegram.TelegramRequestDto;
import com.ltc.student.dto.telegram.TelegramRoot;
import com.ltc.student.service.TelegramService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telegram")
@AllArgsConstructor
public class TelegramController {

    private final TelegramService telegramService;
    @GetMapping("/get-updates")
    public TelegramRoot getUpdates() {
        return telegramService.getUpdates();
    }

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody TelegramRequestDto telegramRequestDto) {
        telegramService.sendMessage(telegramRequestDto);
    }
}
