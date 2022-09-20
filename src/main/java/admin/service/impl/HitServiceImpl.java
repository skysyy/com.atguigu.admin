package admin.service.impl;

import admin.mapper.HitMapper;
import admin.service.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HitServiceImpl implements HitService {
    @Autowired
    public HitMapper hitMapper;
    @Override
    public List hit() {
        return hitMapper.hit();
    }
}
