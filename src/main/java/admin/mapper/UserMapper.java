package admin.mapper;

import admin.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select password from user where username=#{username}")
    public String select(String a);
    @Insert("insert into user(username,password) value(#{username},#{password})")
    public String insertToData(String username,String password);
    @Select("select * from user")
    public List<User> selectAll();

}
