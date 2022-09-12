package com.market.choco.domain;

import com.market.choco.domain.enums.UnreadState;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "choco_user_alarm")
public class UserAlarm {

    @Id@GeneratedValue
    @Column(name = "alarm_id")
    private Long alarmId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToOne(mappedBy = "choco_user_alarm_keyword",fetch = FetchType.LAZY)
    private UserAlarmKeyword alarmKeywordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product productId;

    @Enumerated(EnumType.STRING)
    private UnreadState unreadState;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
