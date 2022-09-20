package admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupportMapper {
    @Select("select support from data_table order by support")
    public List support();
}
