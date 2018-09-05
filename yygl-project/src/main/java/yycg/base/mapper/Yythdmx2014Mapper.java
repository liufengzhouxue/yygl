package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yythdmx2014;
import yycg.base.pojo.Yythdmx2014Example;

public interface Yythdmx2014Mapper {
    int countByExample(Yythdmx2014Example example);

    int deleteByExample(Yythdmx2014Example example);

    int deleteByPrimaryKey(String id);

    int insert(Yythdmx2014 record);

    int insertSelective(Yythdmx2014 record);

    List<Yythdmx2014> selectByExample(Yythdmx2014Example example);

    Yythdmx2014 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yythdmx2014 record, @Param("example") Yythdmx2014Example example);

    int updateByExample(@Param("record") Yythdmx2014 record, @Param("example") Yythdmx2014Example example);

    int updateByPrimaryKeySelective(Yythdmx2014 record);

    int updateByPrimaryKey(Yythdmx2014 record);
}