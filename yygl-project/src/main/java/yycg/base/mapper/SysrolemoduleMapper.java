package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.SysrolemoduleExample;
import yycg.base.pojo.SysrolemoduleKey;

public interface SysrolemoduleMapper {
    int countByExample(SysrolemoduleExample example);

    int deleteByExample(SysrolemoduleExample example);

    int deleteByPrimaryKey(SysrolemoduleKey key);

    int insert(SysrolemoduleKey record);

    int insertSelective(SysrolemoduleKey record);

    List<SysrolemoduleKey> selectByExample(SysrolemoduleExample example);

    int updateByExampleSelective(@Param("record") SysrolemoduleKey record, @Param("example") SysrolemoduleExample example);

    int updateByExample(@Param("record") SysrolemoduleKey record, @Param("example") SysrolemoduleExample example);
}