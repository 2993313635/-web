package com.boshuo.sjzgl.mapper;

import com.boshuo.sjzgl.model.entity.GameGuide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface GameGuideMapper {
    //根据id查询单条攻略记录
    GameGuide findById(Integer id);
    //查询所有攻略记录
    List<GameGuide> findAll();
    //新增攻略记录，返回影响行数
    int insert(GameGuide Guide);
    //更新攻略记录
    int update(GameGuide Guide);
    //根据id删除攻略
    int deleteById(Integer id);

    //条件查询

    //根据分类id查询
    List<GameGuide> findByCategoryId(Integer categoryId);
    //根据状态查询
    List<GameGuide> findByStatus(String status);
    //组合查询（分类id+状态）
    List<GameGuide> findByCategoryIdAndStatus(@Param("categoryId")Integer categoryId,
                                              @Param("status") String status);

    //分页查询
    List<GameGuide>findPage(@Param("offset") int offset,
                            @Param("limit") int limit,
                            @Param("status") String status);

    //搜索功能
    //关键字查询
    List<GameGuide> searchByCategory(@Param("keyword")String keyword);
    //标题查询
    List<GameGuide> searchByTitle(@Param("title")String title);

    //统计功能
    //统计指定分类下的攻略数量
    int countByCategoryId(Integer categoryId);
    //统计指定状态下的攻略数量
    int countByStatus(String status);
    //统计所有攻略
    int countAll();

    //更新操作
    //增加浏览次数
    int incrementViewCount(Integer id);
    //增加点赞数量
    int incrementLikeCount(Integer id);
    //更新状态
    int updateStatus(@Param("id") Integer id,
                     @Param("status") String status,
                     @Param("publishedAt") java.util.Date publishedAt);

    //复杂查询
    List<GameGuide>findWithConditions(Map<String,Object> params);
    List<GameGuide>findPopularGuides(@Param("limit") int limit);
    List<GameGuide>findRecentGuides(@Param("limit") int limit);

    //关联查询
    List<GameGuide>findWithCategoryInfo();

}
