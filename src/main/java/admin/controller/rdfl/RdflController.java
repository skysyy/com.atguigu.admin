package admin.controller.rdfl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RdflController {
    @GetMapping("/rdfl")
    public String Generated(){
        return "rdfl/rdfl";
    }
}
