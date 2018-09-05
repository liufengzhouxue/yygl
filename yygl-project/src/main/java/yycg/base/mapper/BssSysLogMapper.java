package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysLog;
import yycg.base.pojo.BssSysLogExample;

public interface BssSysLogMapper {
    int countByExample(BssSysLogExample example);

    int deleteByExample(BssSysLogExample example);

    int deleteByPrimaryKey(String logid);

    int insert(BssSysLog record);

    int insertSelective(BssSysLog record);

    List<BssSysLog> selectByExample(BssSysLogExample example);

    BssSysLog selectByPrimaryKey(String logid);

    int updateByExampleSelective(@Param("record") BssSysLog record, @Param("example") BssSysLogExample example);

    int updateByExample(@Param("record") BssSysLog record, @Param("example") BssSysLogExample example);

    int updateByPrimaryKeySelective(BssSysLog record);

    int updateByPrimaryKey(BssSysLog record);
}