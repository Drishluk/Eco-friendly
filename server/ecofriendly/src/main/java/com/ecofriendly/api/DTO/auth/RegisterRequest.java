package com.ecofriendly.api.DTO.auth;


import lombok.Data;

@Data
public class RegisterRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String confirmPassword;

    private String phoneNumber;

}