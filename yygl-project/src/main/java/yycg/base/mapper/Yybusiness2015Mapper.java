package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yybusiness2015;
import yycg.base.pojo.Yybusiness2015Example;

public interface Yybusiness2015Mapper {
    int countByExample(Yybusiness2015Example example);

    int deleteByExample(Yybusiness2015Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yybusiness2015 record);

    int insertSelective(Yybusiness2015 record);

    List<Yybusiness2015> selectByExample(Yybusiness2015Example example);

    Yybusiness2015 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yybusiness2015 record, @Param("example") Yybusiness2015Example example);

    int updateByExample(@Param("record") Yybusiness2015 record, @Param("example") Yybusiness2015Example example);

    int updateByPrimaryKeySelective(Yybusiness2015 record);

    int updateByPrimaryKey(Yybusiness2015 record);
}