package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.Sysuser;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.pojo.vo.SubmitResultInfo;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;
    @RequestMapping("/queryuser")
    public String findSysuserList(Model model){
        return "base/user/queryuser";
    }
    @RequestMapping("/queryuser_result")
    @ResponseBody
    public DataGridResultInfo queryUser_result(SysuserQueryVo sysuserQueryVo,int page,int rows){
        //非空校验
        sysuserQueryVo = sysuserQueryVo!=null?sysuserQueryVo:new SysuserQueryVo();
        //查询列表的总数
        int total=userService.findSysuserCount(sysuserQueryVo);
        //分页查询，向包装对象中封装数据
        PageQuery pageQuery=new PageQuery();
        pageQuery.setPageParams(total,rows,page);
        sysuserQueryVo.setPageQuery(pageQuery);
        List<SysuserCustom> list=userService.findSysuserList(sysuserQueryVo);
        DataGridResultInfo info=new DataGridResultInfo();
        info.setRows(list);
        info.setTotal(total);
        return info;
    }
    //新增用户
    //进入添加页面
    @RequestMapping("/addsysuser")
    public String toInsertUser(){
        return "base/user/addsysuser";
    }
    //提交方法
    @RequestMapping("/addsysusersubmit")
    @ResponseBody
    public SubmitResultInfo addsysuersubmit(Model model, SysuserQueryVo sysuserQueryVo) throws Exception{
        //提示用户信息
        SubmitResultInfo info=new SubmitResultInfo();
        try {
            userService.insertUser(sysuserQueryVo.getSysuserCustom());
            info.setMessage("添加成功");
            info.setType(0);
        }catch (Exception e){
            e.printStackTrace();
            info.setType(1);
            info.setMessage("添加失败");
        }

        return info;
    }
    //删除用户
    @RequestMapping("/deletesysuser")
    @ResponseBody
    public SubmitResultInfo deleteSysuser(String id) throws  Exception{
        SubmitResultInfo info=new SubmitResultInfo();
        try {
          userService.deleteSysuser(id);
          info.setType(0);
          info.setMessage("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            info.setType(1);
            info.setMessage(e.getMessage());
        }
        return  info;
    }
    //修改用户
    //修改表单的回显
    @RequestMapping("/editsysuser")
    public String edituser(String id,Model model) throws  Exception{
        SysuserCustom sysuserCustom= userService.findUserById(id);
        model.addAttribute("sysuserCustom",sysuserCustom);
        return "base/user/editsysuser";
    }
    //修改表单的回显
    @RequestMapping("/editsysusersubmit")
    @ResponseBody
    public SubmitResultInfo editusersubmit(String id,SysuserQueryVo sysuserQueryVo) throws  Exception{
        SubmitResultInfo info=new SubmitResultInfo();
        try{
            userService.updateSysuser(id,sysuserQueryVo.getSysuserCustom());
           info.setType(0);
           info.setMessage("修改成功");
        }catch (Exception e){
            info.setType(1);
            info.setMessage("修改失败");
        }
        return info;
    }

}
