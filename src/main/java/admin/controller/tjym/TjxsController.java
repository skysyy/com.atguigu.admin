package admin.controller.tjym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TjxsController {
    @GetMapping("/xstj")
    public String Generated(){
        return "tjym/xstj";
    }
}
