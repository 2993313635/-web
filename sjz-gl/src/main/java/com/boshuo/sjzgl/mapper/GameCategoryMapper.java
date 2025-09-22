package com.boshuo.sjzgl.mapper;

import com.boshuo.sjzgl.model.entity.GameCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameCategoryMapper {
    GameCategory findById(Integer id);
    List<GameCategory> findAll();
    GameCategory findByName(String name);
    int insert(GameCategory gameCategory);
    int update(GameCategory gameCategory);
    int delete(Integer id);
    boolean existsByName(String name);
    int countAll();

}

