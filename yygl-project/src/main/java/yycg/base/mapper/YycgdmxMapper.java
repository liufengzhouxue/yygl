package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yycgdmx;
import yycg.base.pojo.YycgdmxExample;

public interface YycgdmxMapper {
    int countByExample(YycgdmxExample example);

    int deleteByExample(YycgdmxExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yycgdmx record);

    int insertSelective(Yycgdmx record);

    List<Yycgdmx> selectByExample(YycgdmxExample example);

    Yycgdmx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yycgdmx record, @Param("example") YycgdmxExample example);

    int updateByExample(@Param("record") Yycgdmx record, @Param("example") YycgdmxExample example);

    int updateByPrimaryKeySelective(Yycgdmx record);

    int updateByPrimaryKey(Yycgdmx record);
}