package com.market.choco.domain;

import com.market.choco.domain.enums.ProductClass;
import com.market.choco.domain.enums.ProductNego;
import com.market.choco.domain.enums.ProductState;
import com.market.choco.domain.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="choco_product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="product_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name="cate_id")
    private Cate cateId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file1Id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file2Id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file3Id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file4Id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file5Id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private File file6Id;

    @Column(nullable = false)
    private String productTitle;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @Enumerated(EnumType.STRING)
    private ProductClass productClass;

    @Column(length = 15, nullable = false)
    private String productContents;

    @Column(columnDefinition = "default 0")
    private Long productPrice;

    @Enumerated(EnumType.STRING)
    private ProductNego productNego;

    private String productTag;

    private LocalDateTime productReloadDatetime;

    @Column(columnDefinition = "default 0")
    private int productReloadCount;

    @Enumerated(EnumType.STRING)
    private ProductState productState;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //product_id	bigint	Autoincrease 100000000
    //user_id	bigint	not null, FK
    //cate_id	int	null
    //file1_id	bigint	null, FK
    //file2_id	bigint	null, FK
    //file3_id	bigint	null, FK
    //file4_id	bigint	null, FK
    //file5_id	bigint	null, FK
    //file6_id	bigint	null, FK
    //product_title	varchar(255)	not null
    //product_type	int	10
    //product_class	varchar(15)	not null
    //product_contents	text	not null
    //product_price	bigint	0
    //product_nego	char(1)	N
    //product_tag	varchar(255)	null
    //product_reload_datetime	datetime	now()
    //product_reload_count	int	0
    //product_state	char(2)	D1
    //created_at	datetime	now()
    //updated_at	datetime	0000-00-00 00:00:00
}
