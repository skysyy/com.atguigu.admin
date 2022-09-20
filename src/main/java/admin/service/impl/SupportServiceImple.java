package admin.service.impl;

import admin.mapper.SupportMapper;
import admin.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportServiceImple implements SupportService {
    @Autowired
    public SupportMapper supportMapper;
    @Override
    public List support() {
        return supportMapper.support();
    }
}
