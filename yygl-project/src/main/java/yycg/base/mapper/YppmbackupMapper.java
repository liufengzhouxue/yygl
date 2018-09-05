package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yppmbackup;
import yycg.base.pojo.YppmbackupExample;

public interface YppmbackupMapper {
    int countByExample(YppmbackupExample example);

    int deleteByExample(YppmbackupExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yppmbackup record);

    int insertSelective(Yppmbackup record);

    List<Yppmbackup> selectByExample(YppmbackupExample example);

    Yppmbackup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yppmbackup record, @Param("example") YppmbackupExample example);

    int updateByExample(@Param("record") Yppmbackup record, @Param("example") YppmbackupExample example);

    int updateByPrimaryKeySelective(Yppmbackup record);

    int updateByPrimaryKey(Yppmbackup record);
}