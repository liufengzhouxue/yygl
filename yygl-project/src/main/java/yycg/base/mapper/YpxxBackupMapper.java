package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.YpxxBackup;
import yycg.base.pojo.YpxxBackupExample;

public interface YpxxBackupMapper {
    int countByExample(YpxxBackupExample example);

    int deleteByExample(YpxxBackupExample example);

    int insert(YpxxBackup record);

    int insertSelective(YpxxBackup record);

    List<YpxxBackup> selectByExample(YpxxBackupExample example);

    int updateByExampleSelective(@Param("record") YpxxBackup record, @Param("example") YpxxBackupExample example);

    int updateByExample(@Param("record") YpxxBackup record, @Param("example") YpxxBackupExample example);
}