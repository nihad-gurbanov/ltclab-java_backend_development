package com.ltc.student.dto.telegram;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message{
    public int message_id;
    public From from;
    public Chat chat;
    public int date;
    public String text;
}