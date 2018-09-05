package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yycgdmx2014;
import yycg.base.pojo.Yycgdmx2014Example;

public interface Yycgdmx2014Mapper {
    int countByExample(Yycgdmx2014Example example);

    int deleteByExample(Yycgdmx2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yycgdmx2014 record);

    int insertSelective(Yycgdmx2014 record);

    List<Yycgdmx2014> selectByExample(Yycgdmx2014Example example);

    Yycgdmx2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yycgdmx2014 record, @Param("example") Yycgdmx2014Example example);

    int updateByExample(@Param("record") Yycgdmx2014 record, @Param("example") Yycgdmx2014Example example);

    int updateByPrimaryKeySelective(Yycgdmx2014 record);

    int updateByPrimaryKey(Yycgdmx2014 record);
}