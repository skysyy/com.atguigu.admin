package admin.service.impl;

import admin.mapper.WebangMapper;
import admin.service.WebangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebangServiceImpl implements WebangService {
    @Autowired
    public WebangMapper webangMapper;
    @Override
    public List webang() {
        return webangMapper.webang();
    }
}
