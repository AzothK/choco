package com.market.choco.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "choco_cate")
public class Cate {

    @Id @GeneratedValue
    @Column(name="cate_id")
    private Long cateId;

    @OneToOne(fetch = FetchType.LAZY)
    private Cate parentCateId;

    private int cateDepth;

    @Column(length = 32)
    private String cateName;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
