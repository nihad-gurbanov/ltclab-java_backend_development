package com.ltc.espiritspringboot.dto;


import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter
//@Builder
public class CarDto {
    private Long id;
    private String carName;
    private Integer carYear;


}
