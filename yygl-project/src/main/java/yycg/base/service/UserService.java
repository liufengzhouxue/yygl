package yycg.base.service;

import yycg.base.pojo.Sysuser;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

import java.util.List;

public interface UserService {
    //根据用户id查询用户信息
    public SysuserCustom findUserById(String id) throws  Exception;
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo);
    public int findSysuserCount(SysuserQueryVo sysuserQueryVo);
    public void insertUser(SysuserCustom sysuserCustom) throws  Exception;
    public void deleteSysuser(String id) throws  Exception;
    public void updateSysuser(String id,SysuserCustom sysuserCustom) throws  Exception;
}
