package admin.service.impl;

import admin.mapper.TuijianMapper;
import admin.service.TuijianService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuijianServiceImpl implements TuijianService {
    @Autowired
    public TuijianMapper tuijianMapper;
    @Override
    public List tuijian(String status) {
        return tuijianMapper.tuijian(status);
    }
}
