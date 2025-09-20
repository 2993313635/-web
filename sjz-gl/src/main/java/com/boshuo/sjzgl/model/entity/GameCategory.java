package com.boshuo.sjzgl.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GameCategory {
    private Integer id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
