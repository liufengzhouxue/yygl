package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yybusiness2014;
import yycg.base.pojo.Yybusiness2014Example;

public interface Yybusiness2014Mapper {
    int countByExample(Yybusiness2014Example example);

    int deleteByExample(Yybusiness2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yybusiness2014 record);

    int insertSelective(Yybusiness2014 record);

    List<Yybusiness2014> selectByExample(Yybusiness2014Example example);

    Yybusiness2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yybusiness2014 record, @Param("example") Yybusiness2014Example example);

    int updateByExample(@Param("record") Yybusiness2014 record, @Param("example") Yybusiness2014Example example);

    int updateByPrimaryKeySelective(Yybusiness2014 record);

    int updateByPrimaryKey(Yybusiness2014 record);
}