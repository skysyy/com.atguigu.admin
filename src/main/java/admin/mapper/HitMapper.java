package admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HitMapper {
    @Select("select hits from data_table order by hits")
    public List hit();
}
