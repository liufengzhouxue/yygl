package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Sysmodule;
import yycg.base.pojo.SysmoduleExample;

public interface SysmoduleMapper {
    int countByExample(SysmoduleExample example);

    int deleteByExample(SysmoduleExample example);

    int deleteByPrimaryKey(String moduleid);

    int insert(Sysmodule record);

    int insertSelective(Sysmodule record);

    List<Sysmodule> selectByExample(SysmoduleExample example);

    Sysmodule selectByPrimaryKey(String moduleid);

    int updateByExampleSelective(@Param("record") Sysmodule record, @Param("example") SysmoduleExample example);

    int updateByExample(@Param("record") Sysmodule record, @Param("example") SysmoduleExample example);

    int updateByPrimaryKeySelective(Sysmodule record);

    int updateByPrimaryKey(Sysmodule record);
}