package admin.controller.data_generation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneratedController {
    @GetMapping("/generated_data")
    public String Generated(){
        return "generated/generated_data";
    }
}
