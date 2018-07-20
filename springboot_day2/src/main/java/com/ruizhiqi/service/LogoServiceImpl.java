package com.ruizhiqi.service;

import com.ruizhiqi.dao.LogoDAO;
import com.ruizhiqi.entity.Logo;
import com.ruizhiqi.util.Uid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class LogoServiceImpl implements LogoService {


    @Resource
    private LogoDAO logoDAO;

    @Override
    public void insert(Logo logo) {
        String uuid = Uid.getUUID();
        logo.setId(uuid);
        logoDAO.insert(logo);
    }
}
