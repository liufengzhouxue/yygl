package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yyjsd2014;
import yycg.base.pojo.Yyjsd2014Example;

public interface Yyjsd2014Mapper {
    int countByExample(Yyjsd2014Example example);

    int deleteByExample(Yyjsd2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yyjsd2014 record);

    int insertSelective(Yyjsd2014 record);

    List<Yyjsd2014> selectByExample(Yyjsd2014Example example);

    Yyjsd2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yyjsd2014 record, @Param("example") Yyjsd2014Example example);

    int updateByExample(@Param("record") Yyjsd2014 record, @Param("example") Yyjsd2014Example example);

    int updateByPrimaryKeySelective(Yyjsd2014 record);

    int updateByPrimaryKey(Yyjsd2014 record);
}