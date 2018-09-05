package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yycgd2014;
import yycg.base.pojo.Yycgd2014Example;

public interface Yycgd2014Mapper {
    int countByExample(Yycgd2014Example example);

    int deleteByExample(Yycgd2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yycgd2014 record);

    int insertSelective(Yycgd2014 record);

    List<Yycgd2014> selectByExample(Yycgd2014Example example);

    Yycgd2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yycgd2014 record, @Param("example") Yycgd2014Example example);

    int updateByExample(@Param("record") Yycgd2014 record, @Param("example") Yycgd2014Example example);

    int updateByPrimaryKeySelective(Yycgd2014 record);

    int updateByPrimaryKey(Yycgd2014 record);
}