package com.bootcamp.post.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_post")
public class Posts {

    @Id
    @GeneratedValue
    @Column(name = "pst_id")
    private Long id;

    @Column(name = "pst_message")
    private String message;

    @Column(name = "pst_timestamp")
    private LocalDate timeStamp;
}
