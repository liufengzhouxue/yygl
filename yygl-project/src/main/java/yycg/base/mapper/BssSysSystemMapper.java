package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysSystem;
import yycg.base.pojo.BssSysSystemExample;

public interface BssSysSystemMapper {
    int countByExample(BssSysSystemExample example);

    int deleteByExample(BssSysSystemExample example);

    int deleteByPrimaryKey(String sysid);

    int insert(BssSysSystem record);

    int insertSelective(BssSysSystem record);

    List<BssSysSystem> selectByExample(BssSysSystemExample example);

    BssSysSystem selectByPrimaryKey(String sysid);

    int updateByExampleSelective(@Param("record") BssSysSystem record, @Param("example") BssSysSystemExample example);

    int updateByExample(@Param("record") BssSysSystem record, @Param("example") BssSysSystemExample example);

    int updateByPrimaryKeySelective(BssSysSystem record);

    int updateByPrimaryKey(BssSysSystem record);
}