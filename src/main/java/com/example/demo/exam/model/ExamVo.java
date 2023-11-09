package com.example.demo.exam.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class ExamVo {
    private int personId;
    private String fname;
    private String lname;
    private String eyeColor;
    private String birthDate;
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
