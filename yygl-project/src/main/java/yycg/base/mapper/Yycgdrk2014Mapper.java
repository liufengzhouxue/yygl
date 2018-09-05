package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yycgdrk2014;
import yycg.base.pojo.Yycgdrk2014Example;

public interface Yycgdrk2014Mapper {
    int countByExample(Yycgdrk2014Example example);

    int deleteByExample(Yycgdrk2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yycgdrk2014 record);

    int insertSelective(Yycgdrk2014 record);

    List<Yycgdrk2014> selectByExample(Yycgdrk2014Example example);

    Yycgdrk2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yycgdrk2014 record, @Param("example") Yycgdrk2014Example example);

    int updateByExample(@Param("record") Yycgdrk2014 record, @Param("example") Yycgdrk2014Example example);

    int updateByPrimaryKeySelective(Yycgdrk2014 record);

    int updateByPrimaryKey(Yycgdrk2014 record);
}