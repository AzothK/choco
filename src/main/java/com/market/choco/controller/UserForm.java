package com.market.choco.controller;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class UserForm {

    private String userEmail;
    private String userPwd;
    private String userNickName;

    //private String userName;
    //private char userEmailAuth;
    //private LocalDateTime userEmailAuthDatetime;
    //private String userPhone;
}
