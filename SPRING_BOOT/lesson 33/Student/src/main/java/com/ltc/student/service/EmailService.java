package com.ltc.student.service;

import com.ltc.student.dto.request.EmailPictureRequestDto;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
@Slf4j
public class EmailService {
    private final JavaMailSender javaMailSender;

    public void sendSimpleMail(EmailPictureRequestDto emailPictureRequestDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailPictureRequestDto.getTo());
        message.setFrom(emailPictureRequestDto.getFrom());
        message.setSubject(emailPictureRequestDto.getSubject());
        message.setText(emailPictureRequestDto.getContent());

        javaMailSender.send(message);
    }

    public void sendPicture(EmailPictureRequestDto emailPictureRequestDto) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);

        messageHelper.setTo(emailPictureRequestDto.getTo());
        messageHelper.setFrom(emailPictureRequestDto.getFrom());
        messageHelper.setSubject(emailPictureRequestDto.getSubject());
        messageHelper.setText(emailPictureRequestDto.getContent(), true);

        for (MultipartFile multipartFile : emailPictureRequestDto.getFiles()) {
            String originalFilename = multipartFile.getOriginalFilename();
            if (originalFilename != null) {
                messageHelper.addAttachment(originalFilename, multipartFile);
            }
        }

        javaMailSender.send(message);
    }


    @Scheduled(fixedRate = 5000)
    public void checkIncomingEmails() {
        log.info("Checking incoming emails");
    }

    @Scheduled(cron = "0 0 12 ? * MON-FRI")
    public void sendProgressReport() {
        log.info("Report sent");
    }
}