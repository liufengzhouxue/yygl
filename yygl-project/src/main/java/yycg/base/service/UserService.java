package yycg.base.service;

import yycg.base.pojo.Sysuser;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

import java.util.List;

public interface UserService {
    //根据用户id查询用户信息
    public Sysuser findUserById(String id);
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo);
    public int findSysuserCount(SysuserQueryVo sysuserQueryVo);
}