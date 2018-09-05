package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysRole;
import yycg.base.pojo.BssSysRoleExample;

public interface BssSysRoleMapper {
    int countByExample(BssSysRoleExample example);

    int deleteByExample(BssSysRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(BssSysRole record);

    int insertSelective(BssSysRole record);

    List<BssSysRole> selectByExample(BssSysRoleExample example);

    BssSysRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") BssSysRole record, @Param("example") BssSysRoleExample example);

    int updateByExample(@Param("record") BssSysRole record, @Param("example") BssSysRoleExample example);

    int updateByPrimaryKeySelective(BssSysRole record);

    int updateByPrimaryKey(BssSysRole record);
}