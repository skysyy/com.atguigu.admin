package admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "src.main.java.admin.mapper")
@SpringBootApplication
public class Boot03WebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(Boot03WebAdminApplication.class,args);
    }
}
