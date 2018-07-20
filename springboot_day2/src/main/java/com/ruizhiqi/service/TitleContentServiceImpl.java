package com.ruizhiqi.service;

import com.ruizhiqi.dao.TitleContentDAO;
import com.ruizhiqi.entity.TitleContent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class TitleContentServiceImpl implements TitleContentService {


    @Resource
    private TitleContentDAO titleContentDAO;

    @Override
    public void insert(TitleContent titleContent) {
        titleContentDAO.insert(titleContent);
    }
}
