package admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FormTestController {
   @GetMapping("form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestPart("headerImg")MultipartFile headerImg,
                         @RequestPart("photo") MultipartFile[] photos) throws IOException {
       if (!headerImg.isEmpty()){
           String originalFilename = headerImg.getOriginalFilename();
           headerImg.transferTo(new File("E:\\"+originalFilename));
       }
       if (photos.length>0){
           for (MultipartFile photo:photos){
               if (!photo.isEmpty()){
                   String originalFilename = photo.getOriginalFilename();
                   photo.transferTo(new File("E:\\"+originalFilename));
               }
           }
       }
       return "main";
    }
}
