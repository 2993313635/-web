package com.boshuo.sjzgl.model.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class GameNew {
    private Integer id;
    private String title;
    private String summary;
    private String content;
    private String cover_image;
    private LocalDateTime create_time;
}
