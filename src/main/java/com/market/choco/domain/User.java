package com.market.choco.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.market.choco.domain.enums.UserEmailAuth;
import com.market.choco.domain.enums.UserGender;
import com.market.choco.domain.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name="choco_user")
public class User {

    @Id @GeneratedValue
    @Column(name="user_id")
    private Long Id;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(length = 63)
    private String userEmail;
    @Column(length = 63)
    private String userPwd;
    @Column(length = 10)
    private String userName;

    @Enumerated(EnumType.STRING)
    private UserEmailAuth userEmailAuth;

    private LocalDateTime userEmailAuthDatetime;

    @Column(length = 15)
    private String userNickName;
    @Column(length = 11)
    private String userPhone;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(length = 10)
    private Date userBirth;

    @Enumerated(EnumType.STRING)
    private UserGender userGender;

    private float userEvaluation;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


//user_id	bigint
//user_type	char(1)
//user_email	varchar(63)
//user_pwd	varchar(63)
//user_name	varchar(10)
//user_email_auth	char(1)
//user_email_auth_datetime	datetime
//user_nick_name	varchar(15)
//user_phone	varchar(11)
//user_birth	varchar(10)
//user_gender	char(1)
//insert_datetime	datetime
//update_datetime	datetime
}
