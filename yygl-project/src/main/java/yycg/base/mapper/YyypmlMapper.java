package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yyypml;
import yycg.base.pojo.YyypmlExample;

public interface YyypmlMapper {
    int countByExample(YyypmlExample example);

    int deleteByExample(YyypmlExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yyypml record);

    int insertSelective(Yyypml record);

    List<Yyypml> selectByExample(YyypmlExample example);

    Yyypml selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yyypml record, @Param("example") YyypmlExample example);

    int updateByExample(@Param("record") Yyypml record, @Param("example") YyypmlExample example);

    int updateByPrimaryKeySelective(Yyypml record);

    int updateByPrimaryKey(Yyypml record);
}