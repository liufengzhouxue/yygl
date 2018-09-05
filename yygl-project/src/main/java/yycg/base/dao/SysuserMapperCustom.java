package yycg.base.dao;

import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

import java.util.List;

public interface SysuserMapperCustom {
    public List<SysuserCustom> findSysuserList(SysuserQueryVo queryVo);
    public int findSysuserCount(SysuserQueryVo sysuserQueryVo);
}
