package admin.service;

import admin.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public interface UserService extends IService<User> {
    public String select(String a);
    public List<User> selectAll();
    public String insertToData(String username,String password);

}
