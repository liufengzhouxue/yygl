package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Userarea;
import yycg.base.pojo.UserareaExample;
import yycg.base.pojo.UserareaKey;

public interface UserareaMapper {
    int countByExample(UserareaExample example);

    int deleteByExample(UserareaExample example);

    int deleteByPrimaryKey(UserareaKey key);

    int insert(Userarea record);

    int insertSelective(Userarea record);

    List<Userarea> selectByExample(UserareaExample example);

    Userarea selectByPrimaryKey(UserareaKey key);

    int updateByExampleSelective(@Param("record") Userarea record, @Param("example") UserareaExample example);

    int updateByExample(@Param("record") Userarea record, @Param("example") UserareaExample example);

    int updateByPrimaryKeySelective(Userarea record);

    int updateByPrimaryKey(Userarea record);
}