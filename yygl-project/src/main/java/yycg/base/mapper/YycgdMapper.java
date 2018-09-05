package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yycgd;
import yycg.base.pojo.YycgdExample;

public interface YycgdMapper {
    int countByExample(YycgdExample example);

    int deleteByExample(YycgdExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yycgd record);

    int insertSelective(Yycgd record);

    List<Yycgd> selectByExample(YycgdExample example);

    Yycgd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yycgd record, @Param("example") YycgdExample example);

    int updateByExample(@Param("record") Yycgd record, @Param("example") YycgdExample example);

    int updateByPrimaryKeySelective(Yycgd record);

    int updateByPrimaryKey(Yycgd record);
}