package com.market.choco.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "choco_cate")
public class Cate {

    @Id @GeneratedValue
    @Column(name="cate_id")
    private Long cateId;

    //private Long


    //cate_id	bigint	Autoincrease 1000
    //parent_cate_id	bigint	Autoincrease 1000
    //cate_depth	int(1)	1
    //cate_name	varchar(32)	not null, unique
    //created_at	datetime	now()
    //updated_at	datetime	0000-00-00 00:00:00
}
