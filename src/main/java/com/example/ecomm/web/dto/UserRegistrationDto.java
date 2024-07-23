package com.example.ecomm.web.dto;

public class UserRegistrationDto {
    private String fristName;
    private String lastName;
    private String email;
    private String password;

    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String fristName, String lastName, String email, String password) {
        super();
        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
