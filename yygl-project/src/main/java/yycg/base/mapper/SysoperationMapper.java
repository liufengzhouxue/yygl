package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Sysoperation;
import yycg.base.pojo.SysoperationExample;

public interface SysoperationMapper {
    int countByExample(SysoperationExample example);

    int deleteByExample(SysoperationExample example);

    int deleteByPrimaryKey(String operateid);

    int insert(Sysoperation record);

    int insertSelective(Sysoperation record);

    List<Sysoperation> selectByExample(SysoperationExample example);

    Sysoperation selectByPrimaryKey(String operateid);

    int updateByExampleSelective(@Param("record") Sysoperation record, @Param("example") SysoperationExample example);

    int updateByExample(@Param("record") Sysoperation record, @Param("example") SysoperationExample example);

    int updateByPrimaryKeySelective(Sysoperation record);

    int updateByPrimaryKey(Sysoperation record);
}