package com.ltc.student.client;

import com.ltc.student.dto.telegram.TelegramRequestDto;
import com.ltc.student.dto.telegram.TelegramRoot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "telegram", url = "https://api.telegram.org/bot7171840616:AAGSekxYdMx_IU74eL2rr0lVm86ltvV0sNg")
public interface TelegramFeignClient {
    @GetMapping("/getUpdates?offset={value}")
    TelegramRoot getUpdates(@PathVariable Integer value);

    @PostMapping("/sendMessage")
    void sendMessage(TelegramRequestDto telegramRequestDto);
}