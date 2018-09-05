package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.service.UserService;

import java.util.List;

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
        info.setTotal(list.size());
        return info;
    }

}
