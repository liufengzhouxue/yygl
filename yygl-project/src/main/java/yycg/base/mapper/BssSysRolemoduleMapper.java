package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysRolemodule;
import yycg.base.pojo.BssSysRolemoduleExample;

public interface BssSysRolemoduleMapper {
    int countByExample(BssSysRolemoduleExample example);

    int deleteByExample(BssSysRolemoduleExample example);

    int deleteByPrimaryKey(String rmid);

    int insert(BssSysRolemodule record);

    int insertSelective(BssSysRolemodule record);

    List<BssSysRolemodule> selectByExample(BssSysRolemoduleExample example);

    BssSysRolemodule selectByPrimaryKey(String rmid);

    int updateByExampleSelective(@Param("record") BssSysRolemodule record, @Param("example") BssSysRolemoduleExample example);

    int updateByExample(@Param("record") BssSysRolemodule record, @Param("example") BssSysRolemoduleExample example);

    int updateByPrimaryKeySelective(BssSysRolemodule record);

    int updateByPrimaryKey(BssSysRolemodule record);
}