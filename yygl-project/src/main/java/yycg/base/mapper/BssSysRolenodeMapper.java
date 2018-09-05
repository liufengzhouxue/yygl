package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysRolenode;
import yycg.base.pojo.BssSysRolenodeExample;

public interface BssSysRolenodeMapper {
    int countByExample(BssSysRolenodeExample example);

    int deleteByExample(BssSysRolenodeExample example);

    int deleteByPrimaryKey(String rnid);

    int insert(BssSysRolenode record);

    int insertSelective(BssSysRolenode record);

    List<BssSysRolenode> selectByExample(BssSysRolenodeExample example);

    BssSysRolenode selectByPrimaryKey(String rnid);

    int updateByExampleSelective(@Param("record") BssSysRolenode record, @Param("example") BssSysRolenodeExample example);

    int updateByExample(@Param("record") BssSysRolenode record, @Param("example") BssSysRolenodeExample example);

    int updateByPrimaryKeySelective(BssSysRolenode record);

    int updateByPrimaryKey(BssSysRolenode record);
}