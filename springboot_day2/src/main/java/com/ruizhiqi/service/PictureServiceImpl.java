package com.ruizhiqi.service;

import com.ruizhiqi.dao.PictureDAO;
import com.ruizhiqi.entity.Picture;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class PictureServiceImpl implements PictureService {


    @Resource
    private PictureDAO pictureDAO;

    @Override
    public void update(Picture picture) {
        pictureDAO.upload(picture);
    }
}
