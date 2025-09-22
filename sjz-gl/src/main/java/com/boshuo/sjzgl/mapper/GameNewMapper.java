package com.boshuo.sjzgl.mapper;

import com.boshuo.sjzgl.model.entity.GameNew;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GameNewMapper {
    GameNew getGameNewById(int id);
    List<GameNew> findAllAll();
    List<GameNew> findLatesNews(@Param("limit") int limit);
    int insertGameNew(GameNew gameNew);
    int updateGameNew(GameNew gameNew);
    int deleteGameNewById(int id);
    int countAll();

}
