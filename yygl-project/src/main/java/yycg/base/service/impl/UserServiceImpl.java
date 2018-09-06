package yycg.base.service.impl;

import org.springframework.beans.BeanUtils;
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
import yycg.util.MD5;

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
    public SysuserCustom findUserById(String id) throws  Exception{
        //查询用户
        Sysuser sysuser = sysuserMapper.selectByPrimaryKey(id);
        //根据sysid查询单位名称
        String groupid=sysuser.getGroupid();
        String sysid=sysuser.getSysid();
        String mc=null;
        if(groupid.equals("1")||groupid.equals("2")){
            //监督单位,根据单位的名称查询单位信息
            Userjd userjd=userjdMapper.selectByPrimaryKey(sysid);
            if(userjd==null){
                throw  new Exception("单位不存在");
            }
            mc=userjd.getMc();
        }
        if(groupid.equals("3")){
            //监督单位,根据单位的名称查询单位信息
            Useryy useryy=useryyMapper.selectByPrimaryKey(sysid);
            if(useryy==null){
                throw  new Exception("单位不存在");
            }
            mc=useryy.getMc();
        }
        if(groupid.equals("4")){
            //监督单位,根据单位的名称查询单位信息
            Usergys usergys=usergysMapper.selectByPrimaryKey(sysid);
            if(usergys==null){
                throw  new Exception("单位不存在");
            }
            mc=usergys.getMc();
        }
        SysuserCustom sysuserCustom=new SysuserCustom();
        sysuserCustom.setSysmc(mc);
        BeanUtils.copyProperties(sysuser,sysuserCustom);
        return sysuserCustom;
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

    @Override
    public void updateSysuser(String id, SysuserCustom sysuserCustom) throws Exception {
        //校验数据
        //修改的账号是否是原来的账号，是否是别人的账号
        String  userid_page=sysuserCustom.getUserid();
        //通过id查询数据库
        Sysuser sysuser=sysuserMapper.selectByPrimaryKey(id);
        if(sysuser==null){
            throw  new Exception("找不到要修改的用户信息");
        }
        //用户的原始账号
        String userid=sysuser.getUserid();
        if(!userid.equals(userid_page)){
            //通过页面提交的账号查询数据库，如果查到就说明占用了别人的账号
            Sysuser sysuser1 = this.findSysuserByUserid(userid_page);
            if(sysuser1!=null){
                throw  new Exception("占用别人的账号");
            }
        }
        //根据页面提交的单位名称查询单位sysid
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
        //密码修改，如果从页面提交的密码为空就说明不修改密码，否则就对密码加密
        String pwd_page=sysuserCustom.getPwd();
        String pwd_md5=null;
        if(pwd_page!=null&&pwd_page!=""){
            pwd_md5=new MD5().getMD5ofStr(pwd_page);
        }
        //设置更新的用户信息
        Sysuser sysuser_update=sysuserMapper.selectByPrimaryKey(id);
        sysuser_update.setUserid(sysuserCustom.getUserid());
        sysuser_update.setUsername(sysuserCustom.getUsername());
        sysuser_update.setSysid(sysuserCustom.getSysid());
        sysuser_update.setUserstate(sysuserCustom.getUserstate());
        if(pwd_md5!=null){
            sysuser_update.setPwd(pwd_md5);
        }
        sysuser_update.setGroupid(sysuserCustom.getGroupid());
        sysuser_update.setSysid(sysid);
        sysuserMapper.updateByPrimaryKey(sysuser_update);

    }
}
