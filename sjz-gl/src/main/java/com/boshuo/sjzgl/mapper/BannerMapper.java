package com.boshuo.sjzgl.mapper;

import com.boshuo.sjzgl.model.entity.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BannerMapper {
    Banner findById(Integer id);
    List<Banner> findAll();
    List<Banner> findActiveBanner();
    int insert(Banner banner);
    int update(Banner banner);
    int deleteById(Integer id);
    int setBannerActiveStatus(@Param("id") Integer id, @Param("active") Integer active);

}
