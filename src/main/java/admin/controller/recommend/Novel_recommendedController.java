package admin.controller.recommend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Novel_recommendedController {
    @GetMapping("")
    public String novel_recommended(){
        return "";
    }
}
