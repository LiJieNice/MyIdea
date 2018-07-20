package com.ruizhiqi.service;

import com.ruizhiqi.dao.FinDAO;
import com.ruizhiqi.entity.Fin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;


@Service
@Transactional
public class FinServiceImpl implements FinService {


    @Resource
    private FinDAO finDAO;

    @Override
    public void add(Fin fin) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        fin.setId(id);

        finDAO.add(fin);


    }
}
