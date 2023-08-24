package com.zerobase.cafebom.member.service.dto;

import com.zerobase.cafebom.member.security.Role;
import com.zerobase.cafebom.member.controller.form.SigninForm;
import lombok.Builder;
import lombok.Getter;

public class SigninDto {

    @Getter
    @Builder
    public static class Request {

        private String email;

        private String password;

        public static SigninDto.Request from(SigninForm.Request signinForm) {
            return Request.builder()
                .email(signinForm.getEmail())
                .password(signinForm.getPassword())
                .build();
        }
    }

    @Getter
    @Builder
    public static class Response {

      private Long memberId;

      private String email;

      private Role role;
    }
}