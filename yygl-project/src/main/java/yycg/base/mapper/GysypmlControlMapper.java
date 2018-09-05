package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.GysypmlControl;
import yycg.base.pojo.GysypmlControlExample;

public interface GysypmlControlMapper {
    int countByExample(GysypmlControlExample example);

    int deleteByExample(GysypmlControlExample example);

    int deleteByPrimaryKey(String id);

    int insert(GysypmlControl record);

    int insertSelective(GysypmlControl record);

    List<GysypmlControl> selectByExample(GysypmlControlExample example);

    GysypmlControl selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GysypmlControl record, @Param("example") GysypmlControlExample example);

    int updateByExample(@Param("record") GysypmlControl record, @Param("example") GysypmlControlExample example);

    int updateByPrimaryKeySelective(GysypmlControl record);

    int updateByPrimaryKey(GysypmlControl record);
}