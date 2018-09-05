package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yythd2014;
import yycg.base.pojo.Yythd2014Example;

public interface Yythd2014Mapper {
    int countByExample(Yythd2014Example example);

    int deleteByExample(Yythd2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yythd2014 record);

    int insertSelective(Yythd2014 record);

    List<Yythd2014> selectByExample(Yythd2014Example example);

    Yythd2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yythd2014 record, @Param("example") Yythd2014Example example);

    int updateByExample(@Param("record") Yythd2014 record, @Param("example") Yythd2014Example example);

    int updateByPrimaryKeySelective(Yythd2014 record);

    int updateByPrimaryKey(Yythd2014 record);
}