package com.ltc.student.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Getter
@Setter
public class EmailPictureRequestDto {
    private String to;
    private String from;
    private String subject;
    private String content;
    private List<MultipartFile> files;
}