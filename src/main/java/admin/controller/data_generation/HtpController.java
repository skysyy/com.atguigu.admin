package admin.controller.data_generation;


import admin.service.FakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtpController {
    @Autowired
    public FakerService fakerService;
    @GetMapping("/generated_data_select")
    public String getmethod(@RequestParam("count") int count){
         return fakerService.getmethod(count);
    }
}
