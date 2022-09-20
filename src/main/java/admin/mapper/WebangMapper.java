package admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WebangMapper {
    @Select("select Werecommend from data_table group by Werecommend")
    public List webang();
}
