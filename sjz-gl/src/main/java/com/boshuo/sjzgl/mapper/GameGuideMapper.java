package com.boshuo.sjzgl.mapper;

import com.boshuo.sjzgl.model.dto.GuideQueryDTO;
import com.boshuo.sjzgl.model.entity.GameGuide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface GameGuideMapper {
    // 基础CRUD操作
    int insert(GameGuide gameGuide);
    int update(GameGuide gameGuide);
    int deleteById(Long id);
    GameGuide selectById(Integer id);

    // 条件查询
    List<GameGuide> selectByCondition(GuideQueryDTO queryDTO);
    long countByCondition(GuideQueryDTO queryDTO);

    // 统计操作
    int incrementViewCount(Long id);
    int incrementLikeCount(Long id);

    // 首页推荐查询
    List<GameGuide> selectHotGuides(int limit);      // 热门攻略（按浏览量）
    List<GameGuide> selectLatestGuides(int limit);   // 最新攻略
}
