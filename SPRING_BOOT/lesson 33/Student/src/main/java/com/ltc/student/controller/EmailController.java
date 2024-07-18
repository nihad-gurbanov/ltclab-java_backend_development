package com.ltc.student.controller;

import com.ltc.student.dto.request.EmailPictureRequestDto;
import com.ltc.student.service.EmailService;
import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailPictureRequestDto emailPictureRequestDto) {
        emailService.sendSimpleMail(emailPictureRequestDto);
        return "Email sent successfully";
    }

    @PostMapping(value = "/send-picture", consumes = "multipart/form-data")
    public ResponseEntity<String> sendPicture(@ModelAttribute EmailPictureRequestDto emailPictureRequestDto) throws MessagingException {
        emailService.sendPicture(emailPictureRequestDto);
        return ResponseEntity.ok("Email with pictures sent successfully");
    }
}