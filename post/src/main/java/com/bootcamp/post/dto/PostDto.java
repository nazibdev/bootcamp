package com.bootcamp.post.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class PostDto {

    private String message;
    private LocalDate timeStamp;

}
