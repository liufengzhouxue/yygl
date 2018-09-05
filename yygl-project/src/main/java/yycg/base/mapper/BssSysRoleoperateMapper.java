package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysRoleoperate;
import yycg.base.pojo.BssSysRoleoperateExample;

public interface BssSysRoleoperateMapper {
    int countByExample(BssSysRoleoperateExample example);

    int deleteByExample(BssSysRoleoperateExample example);

    int deleteByPrimaryKey(String roid);

    int insert(BssSysRoleoperate record);

    int insertSelective(BssSysRoleoperate record);

    List<BssSysRoleoperate> selectByExample(BssSysRoleoperateExample example);

    BssSysRoleoperate selectByPrimaryKey(String roid);

    int updateByExampleSelective(@Param("record") BssSysRoleoperate record, @Param("example") BssSysRoleoperateExample example);

    int updateByExample(@Param("record") BssSysRoleoperate record, @Param("example") BssSysRoleoperateExample example);

    int updateByPrimaryKeySelective(BssSysRoleoperate record);

    int updateByPrimaryKey(BssSysRoleoperate record);
}