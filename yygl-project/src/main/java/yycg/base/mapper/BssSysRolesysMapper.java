package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysRolesys;
import yycg.base.pojo.BssSysRolesysExample;

public interface BssSysRolesysMapper {
    int countByExample(BssSysRolesysExample example);

    int deleteByExample(BssSysRolesysExample example);

    int deleteByPrimaryKey(String rsid);

    int insert(BssSysRolesys record);

    int insertSelective(BssSysRolesys record);

    List<BssSysRolesys> selectByExample(BssSysRolesysExample example);

    BssSysRolesys selectByPrimaryKey(String rsid);

    int updateByExampleSelective(@Param("record") BssSysRolesys record, @Param("example") BssSysRolesysExample example);

    int updateByExample(@Param("record") BssSysRolesys record, @Param("example") BssSysRolesysExample example);

    int updateByPrimaryKeySelective(BssSysRolesys record);

    int updateByPrimaryKey(BssSysRolesys record);
}