package com.market.choco.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "choco_file")
public class File {
    @Id
    @GeneratedValue
    @Column(name="file_id")
    private Long fileId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    private String fileOriginName;

    @Column(nullable = false)
    private String fileSavePath;

    private int fileWidth;
    private int fileHeight;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //file_id	bigint	Autoincrease 10000
    //user_id	bigint	not null, FK
    //file_origin_name	varchar(255)	null
    //file_save_path	varchar(255)	not null
    //file_width	int	null
    //file_height	int	null
    //created_at	datetime	now()
    //updated_at	datetime	0000-00-00 00:00:00

}
