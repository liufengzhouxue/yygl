package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yycg.base.dao.SysuserMapperCustom;
import yycg.base.mapper.SysuserMapper;
import yycg.base.mapper.UsergysMapper;
import yycg.base.mapper.UserjdMapper;
import yycg.base.mapper.UseryyMapper;
import yycg.base.pojo.*;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Autowired
    private SysuserMapperCustom sysuserMapperCustom;
    @Autowired
    private UserjdMapper userjdMapper;
    @Autowired
    private UseryyMapper useryyMapper;
    @Autowired
    private UsergysMapper usergysMapper;
    @Override
    public Sysuser findUserById(String id) {
        return sysuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo) {
        return sysuserMapperCustom.findSysuserList(sysuserQueryVo);
    }

    @Override
    public int findSysuserCount(SysuserQueryVo sysuserQueryVo) {
        return sysuserMapperCustom.findSysuserCount(sysuserQueryVo);
    }
    //根据帐号查询用户方法
    public Sysuser findSysuserByUserid(String userid){
        SysuserExample example=new SysuserExample();
        SysuserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Sysuser> sysusers = sysuserMapper.selectByExample(example);
        if(sysusers.size()>0&&sysusers!=null){
            return  sysusers.get(0);
        }
        return null;
    }
    //根据单位名称查询单位信息
    public Userjd findUserjdByMc(String mc) throws  Exception{
        UserjdExample example=new UserjdExample();
        UserjdExample.Criteria criteria = example.createCriteria();
        criteria.andMcEqualTo(mc);
        List<Userjd> userjds = userjdMapper.selectByExample(example);
        if(userjds!=null&&userjds.size()>0){
            return userjds.get(0);
        }
        return  null;
    }
    public Useryy findUseryyByMc(String mc) throws  Exception{
        UseryyExample example=new UseryyExample();
        UseryyExample.Criteria criteria = example.createCriteria();
        criteria.andMcEqualTo(mc);
        List<Useryy> useryys = useryyMapper.selectByExample(example);
        if(useryys!=null&&useryys.size()>0){
            return useryys.get(0);
        }
        return  null;
    }
    public Usergys findUsergysByMc(String mc) throws  Exception{
        UsergysExample example=new UsergysExample();
        UsergysExample.Criteria criteria = example.createCriteria();
        criteria.andMcEqualTo(mc);
        List<Usergys> usergyss = usergysMapper.selectByExample(example);
        if(usergyss!=null&&usergyss.size()>0){
            return usergyss.get(0);
        }
        return  null;
    }
    @Override
    public void insertUser(SysuserCustom sysuserCustom) throws  Exception {
        //数据校验，包括非空校验、长度校验、数据业务的合法性校验
        //帐号的唯一性校验，根据用户帐号查询表，如果查询到，说明帐号重复
        Sysuser sysuser = this.findSysuserByUserid(sysuserCustom.getUserid());
        if(sysuser!=null){
            //帐号重复，抛出一个异常
            throw new Exception("帐号重复");
        }
        //根据用户类型，输入单位名称必须存在对应的单位表
        String groupid=sysuserCustom.getGroupid();
        String sysid=null;
        if(groupid.equals("1")||groupid.equals("2")){
            //监督单位,根据单位的名称查询单位信息
            Userjd userjd=this.findUserjdByMc(sysuserCustom.getSysmc());
            if(userjd==null){
                throw  new Exception("单位不存在");
            }
            sysid=userjd.getId();
        }
        if(groupid.equals("3")){
            //监督单位,根据单位的名称查询单位信息
            Useryy useryy=this.findUseryyByMc(sysuserCustom.getSysmc());
            if(useryy==null){
                throw  new Exception("单位不存在");
            }
            sysid=useryy.getId();
        }
        if(groupid.equals("4")){
            //监督单位,根据单位的名称查询单位信息
            Usergys usergys=this.findUsergysByMc(sysuserCustom.getSysmc());
            if(usergys==null){
                throw  new Exception("单位不存在");
            }
            sysid=usergys.getId();
        }
        //设置主键
        sysuserCustom.setId(System.currentTimeMillis()+""+Math.random()*1000);
        //设置单位id，sysid
        sysuserCustom.setSysid(sysid);

        //添加
        sysuserMapper.insert(sysuserCustom);

    }

    @Override
    public void deleteSysuser(String id) throws  Exception{
        //校验约束
        //校验用户是否存在
        Sysuser sysuser = sysuserMapper.selectByPrimaryKey(id);
        if(sysuser==null){
            throw  new Exception("用户不存在");
        }
        sysuserMapper.deleteByPrimaryKey(id);
    }
}
