package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Userrole;
import yycg.base.pojo.UserroleExample;
import yycg.base.pojo.UserroleKey;

public interface UserroleMapper {
    int countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int deleteByPrimaryKey(UserroleKey key);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    Userrole selectByPrimaryKey(UserroleKey key);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}