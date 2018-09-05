package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.ErrorTaskBackup;
import yycg.base.pojo.ErrorTaskBackupExample;

public interface ErrorTaskBackupMapper {
    int countByExample(ErrorTaskBackupExample example);

    int deleteByExample(ErrorTaskBackupExample example);

    int insert(ErrorTaskBackup record);

    int insertSelective(ErrorTaskBackup record);

    List<ErrorTaskBackup> selectByExample(ErrorTaskBackupExample example);

    int updateByExampleSelective(@Param("record") ErrorTaskBackup record, @Param("example") ErrorTaskBackupExample example);

    int updateByExample(@Param("record") ErrorTaskBackup record, @Param("example") ErrorTaskBackupExample example);
}