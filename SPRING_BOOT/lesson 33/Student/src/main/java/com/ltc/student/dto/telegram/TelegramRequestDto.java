package com.ltc.student.dto.telegram;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelegramRequestDto {
    public Integer chat_id;
    public String text;
}
