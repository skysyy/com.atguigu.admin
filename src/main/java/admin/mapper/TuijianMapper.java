package admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TuijianMapper {
    @Select("select * from data_table where status=#{status};")
    public List tuijian(String status);
}
