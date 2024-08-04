package com.ltc.student.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseDto {
    private String title;
    private Double price;
    private String available;
}
