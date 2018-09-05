package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yyjsdmx2014;
import yycg.base.pojo.Yyjsdmx2014Example;

public interface Yyjsdmx2014Mapper {
    int countByExample(Yyjsdmx2014Example example);

    int deleteByExample(Yyjsdmx2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yyjsdmx2014 record);

    int insertSelective(Yyjsdmx2014 record);

    List<Yyjsdmx2014> selectByExample(Yyjsdmx2014Example example);

    Yyjsdmx2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yyjsdmx2014 record, @Param("example") Yyjsdmx2014Example example);

    int updateByExample(@Param("record") Yyjsdmx2014 record, @Param("example") Yyjsdmx2014Example example);

    int updateByPrimaryKeySelective(Yyjsdmx2014 record);

    int updateByPrimaryKey(Yyjsdmx2014 record);
}