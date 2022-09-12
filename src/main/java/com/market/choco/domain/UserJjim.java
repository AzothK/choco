package com.market.choco.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "choco_user_jjim")
public class UserJjim {

    @Id@GeneratedValue
    @Column(name = "jjim_id")
    private Long jjimId;

    @OneToOne(mappedBy = "choco_product", fetch = FetchType.LAZY)
    private Product jjimProductId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
//jjim_user_id	bigint		찜 유저 고유번호
//jjim_product_id	bigint		찜 상품 고유번호
//created_at	datetime	now()
//updated_at	datetime	0000-00-00 00:00:00
}
