package admin.controller.user_page;

import admin.bean.User;
import admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jnlp.UnavailableServiceException;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    public UserService userService;
    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
//        List<User> users = Arrays.asList(new User("张三", "123456"),
//                new User("李四", "123456789"),
//                new User("王二", "5654"),
//                new User("麻子", "564652"));
//        model.addAttribute("users",users);
//        List<User> list = userService.list();
//        model.addAttribute("users",list);
        Page<User> userPage = new Page<>(pn, 2);
        Page<User> page = userService.page(userPage, null);
        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<User> records = page.getRecords();
        model.addAttribute("page",page);

        return "table/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
