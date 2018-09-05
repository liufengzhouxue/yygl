package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysModule;
import yycg.base.pojo.BssSysModuleExample;

public interface BssSysModuleMapper {
    int countByExample(BssSysModuleExample example);

    int deleteByExample(BssSysModuleExample example);

    int deleteByPrimaryKey(String moduleid);

    int insert(BssSysModule record);

    int insertSelective(BssSysModule record);

    List<BssSysModule> selectByExample(BssSysModuleExample example);

    BssSysModule selectByPrimaryKey(String moduleid);

    int updateByExampleSelective(@Param("record") BssSysModule record, @Param("example") BssSysModuleExample example);

    int updateByExample(@Param("record") BssSysModule record, @Param("example") BssSysModuleExample example);

    int updateByPrimaryKeySelective(BssSysModule record);

    int updateByPrimaryKey(BssSysModule record);
}