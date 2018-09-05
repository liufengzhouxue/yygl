package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Gysypml;
import yycg.base.pojo.GysypmlExample;

public interface GysypmlMapper {
    int countByExample(GysypmlExample example);

    int deleteByExample(GysypmlExample example);

    int deleteByPrimaryKey(String id);

    int insert(Gysypml record);

    int insertSelective(Gysypml record);

    List<Gysypml> selectByExample(GysypmlExample example);

    Gysypml selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Gysypml record, @Param("example") GysypmlExample example);

    int updateByExample(@Param("record") Gysypml record, @Param("example") GysypmlExample example);

    int updateByPrimaryKeySelective(Gysypml record);

    int updateByPrimaryKey(Gysypml record);
}