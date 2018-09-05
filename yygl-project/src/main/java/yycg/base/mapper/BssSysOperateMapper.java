package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysOperate;
import yycg.base.pojo.BssSysOperateExample;

public interface BssSysOperateMapper {
    int countByExample(BssSysOperateExample example);

    int deleteByExample(BssSysOperateExample example);

    int deleteByPrimaryKey(String operateid);

    int insert(BssSysOperate record);

    int insertSelective(BssSysOperate record);

    List<BssSysOperate> selectByExample(BssSysOperateExample example);

    BssSysOperate selectByPrimaryKey(String operateid);

    int updateByExampleSelective(@Param("record") BssSysOperate record, @Param("example") BssSysOperateExample example);

    int updateByExample(@Param("record") BssSysOperate record, @Param("example") BssSysOperateExample example);

    int updateByPrimaryKeySelective(BssSysOperate record);

    int updateByPrimaryKey(BssSysOperate record);
}