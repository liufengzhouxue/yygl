package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.AreaBackup;
import yycg.base.pojo.AreaBackupExample;

public interface AreaBackupMapper {
    int countByExample(AreaBackupExample example);

    int deleteByExample(AreaBackupExample example);

    int deleteByPrimaryKey(String areaid);

    int insert(AreaBackup record);

    int insertSelective(AreaBackup record);

    List<AreaBackup> selectByExample(AreaBackupExample example);

    AreaBackup selectByPrimaryKey(String areaid);

    int updateByExampleSelective(@Param("record") AreaBackup record, @Param("example") AreaBackupExample example);

    int updateByExample(@Param("record") AreaBackup record, @Param("example") AreaBackupExample example);

    int updateByPrimaryKeySelective(AreaBackup record);

    int updateByPrimaryKey(AreaBackup record);
}