package admin.controller;

import admin.bean.User;
import admin.service.UserService;
import com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    public UserService userService;
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @GetMapping("/register_sumit")
    public String register_sumit(User user,Model model){
        List<User>list = userService.selectAll();
        for (User user1:list){
            if (user1.getUsername().equals(user.getUsername())){
                model.addAttribute("msg","用户名重复");
               return "register";
            }
        }
        userService.insertToData(user.getUsername(),user.getPassword());
        model.addAttribute("msg","注册成功");
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        //防止表单重复提交
        String select = userService.select(user.getUsername());
        if (user.getPassword().equals(select)){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        return "main";
    }
}
