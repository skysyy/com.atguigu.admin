package admin.controller.bdym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BdymController {
    @GetMapping("/cxb")
    public String Generated(){
        return "bdym/cxb";
    }
    @GetMapping("/djlb")
    public String Generated1(){
        return "bdym/djlb";
    }
    @GetMapping("/xsb")
    public String Generated2(){
        return "bdym/xsb";
    }
    @GetMapping("/ypb")
    public String Generated3(){
        return "bdym/ypb";
    }
    @GetMapping("/zzsb")
    public String Generated4(){
        return "bdym/zzsb";
    }

}
