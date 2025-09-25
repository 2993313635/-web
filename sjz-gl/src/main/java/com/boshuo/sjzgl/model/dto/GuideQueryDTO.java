package com.boshuo.sjzgl.model.dto;

import lombok.Data;

@Data
public class GuideQueryDTO {
    private String keyword;
    private Long category;
    private String sortBy;
    private Integer page=1;
    private Integer size=10;
    private Integer offset;
}
