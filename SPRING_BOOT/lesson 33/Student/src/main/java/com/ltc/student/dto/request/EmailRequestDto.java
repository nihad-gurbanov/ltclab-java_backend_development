package com.ltc.student.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequestDto {
    private String to;
    private String from;
    private String subject;
    private String content;
}
