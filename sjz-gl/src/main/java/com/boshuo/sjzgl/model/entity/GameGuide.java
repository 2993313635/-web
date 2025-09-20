package com.boshuo.sjzgl.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GameGuide {
    private Integer id;
    private String title;
    private String content;
    private Integer categoryId;
    private String coverImage;
    private String videoUrl;
    private String attachmentUrl;
    private Integer viewCount;
    private Integer likeCount;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //业务方法
    public boolean isPublished(){
        return "A".equals(status);
    }

    public void incrementViewCount(){
        if(viewCount == null){
            viewCount = 0;
        }
        viewCount++;
    }
}
