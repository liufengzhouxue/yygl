package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.Yythd;
import yycg.base.pojo.YythdExample;

public interface YythdMapper {
    int countByExample(YythdExample example);

    int deleteByExample(YythdExample example);

    int deleteByPrimaryKey(String id);

    int insert(Yythd record);

    int insertSelective(Yythd record);

    List<Yythd> selectByExample(YythdExample example);

    Yythd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Yythd record, @Param("example") YythdExample example);

    int updateByExample(@Param("record") Yythd record, @Param("example") YythdExample example);

    int updateByPrimaryKeySelective(Yythd record);

    int updateByPrimaryKey(Yythd record);
}