package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yybusiness;
import yycg.base.pojo.YybusinessExample;

public interface YybusinessMapper {
    int countByExample(YybusinessExample example);

    int deleteByExample(YybusinessExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yybusiness record);

    int insertSelective(Yybusiness record);

    List<Yybusiness> selectByExample(YybusinessExample example);

    Yybusiness selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yybusiness record, @Param("example") YybusinessExample example);

    int updateByExample(@Param("record") Yybusiness record, @Param("example") YybusinessExample example);

    int updateByPrimaryKeySelective(Yybusiness record);

    int updateByPrimaryKey(Yybusiness record);
}