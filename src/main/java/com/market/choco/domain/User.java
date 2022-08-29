package com.market.choco.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private String userEmail;
    private String userPwd;
    private String userName;
    private char userEmailAuth;
    private LocalDateTime userEmailAuthDatetime;
    private String userNickName;
    private String userPhone;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date userBirth;
    private char userGender;

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
