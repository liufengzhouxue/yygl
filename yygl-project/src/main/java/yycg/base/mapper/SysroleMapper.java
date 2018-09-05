package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Sysrole;
import yycg.base.pojo.SysroleExample;

public interface SysroleMapper {
    int countByExample(SysroleExample example);

    int deleteByExample(SysroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    List<Sysrole> selectByExample(SysroleExample example);

    Sysrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExample(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}