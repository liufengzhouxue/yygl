package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yyjsdmx;
import yycg.base.pojo.YyjsdmxExample;

public interface YyjsdmxMapper {
    int countByExample(YyjsdmxExample example);

    int deleteByExample(YyjsdmxExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yyjsdmx record);

    int insertSelective(Yyjsdmx record);

    List<Yyjsdmx> selectByExample(YyjsdmxExample example);

    Yyjsdmx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yyjsdmx record, @Param("example") YyjsdmxExample example);

    int updateByExample(@Param("record") Yyjsdmx record, @Param("example") YyjsdmxExample example);

    int updateByPrimaryKeySelective(Yyjsdmx record);

    int updateByPrimaryKey(Yyjsdmx record);
}