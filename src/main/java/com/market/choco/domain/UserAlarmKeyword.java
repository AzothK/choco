package com.market.choco.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "choco_user_alarm_keyword")
public class UserAlarmKeyword {

    @Id@GeneratedValue
    @Column(name = "alarm_keyword_id")
    private Long alarmKeywordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(length = 32)
    private String alarmKeyword;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
