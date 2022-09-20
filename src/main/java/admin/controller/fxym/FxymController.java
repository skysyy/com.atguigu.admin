package admin.controller.fxym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FxymController {
    @GetMapping("/fxym")
    public String Generated(){
        return "fxym/fxym";
    }
}
