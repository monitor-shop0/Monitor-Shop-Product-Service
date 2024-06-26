package com.mshop.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private Boolean gender;
    private String address;
    private String phone;
    private String image;
    private Date registerDate;
    private Boolean status;
    private Boolean role;
}
