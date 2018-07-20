package com.ruizhiqi.service;

import com.ruizhiqi.dao.DityDAO;
import com.ruizhiqi.entity.Dity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class DityServiceImpl implements DityService {


    @Resource
    private DityDAO dityDAO;

    @Override
    public List<Dity> selectByUser(Dity dity) {
        return dityDAO.selectByUser(dity);
        //return dityService.selectByUser(dity);
    }

    @Override
    public List<Dity> select() {
        //return dityService.select();
        return dityDAO.select();
    }

    @Override
    public void add(Dity dity) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        dity.setId(id);
        dityDAO.add(dity);
    }
}
