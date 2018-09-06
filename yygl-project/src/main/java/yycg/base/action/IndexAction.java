package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.Sysuser;
import yycg.base.service.UserService;

@Controller
public class IndexAction {
    @Autowired
    private UserService userService;
    @RequestMapping("/first")
    public String toIndex(Model model) throws  Exception{
        Sysuser sysuser=userService.findUserById("189");
        model.addAttribute("sysuser",sysuser);
        return  "base/first";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "base/welcome";
    }
}
