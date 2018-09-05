package yycg.base.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.BssSysDeploynode;
import yycg.base.pojo.BssSysDeploynodeExample;

public interface BssSysDeploynodeMapper {
    int countByExample(BssSysDeploynodeExample example);

    int deleteByExample(BssSysDeploynodeExample example);

    int deleteByPrimaryKey(String nodeid);

    int insert(BssSysDeploynode record);

    int insertSelective(BssSysDeploynode record);

    List<BssSysDeploynode> selectByExample(BssSysDeploynodeExample example);

    BssSysDeploynode selectByPrimaryKey(String nodeid);

    int updateByExampleSelective(@Param("record") BssSysDeploynode record, @Param("example") BssSysDeploynodeExample example);

    int updateByExample(@Param("record") BssSysDeploynode record, @Param("example") BssSysDeploynodeExample example);

    int updateByPrimaryKeySelective(BssSysDeploynode record);

    int updateByPrimaryKey(BssSysDeploynode record);
}