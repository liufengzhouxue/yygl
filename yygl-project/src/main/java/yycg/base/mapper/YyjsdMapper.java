package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yyjsd;
import yycg.base.pojo.YyjsdExample;

public interface YyjsdMapper {
    int countByExample(YyjsdExample example);

    int deleteByExample(YyjsdExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yyjsd record);

    int insertSelective(Yyjsd record);

    List<Yyjsd> selectByExample(YyjsdExample example);

    Yyjsd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yyjsd record, @Param("example") YyjsdExample example);

    int updateByExample(@Param("record") Yyjsd record, @Param("example") YyjsdExample example);

    int updateByPrimaryKeySelective(Yyjsd record);

    int updateByPrimaryKey(Yyjsd record);
}