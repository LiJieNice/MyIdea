package com.ruizhiqi.service;

import com.ruizhiqi.dao.TitlePictureDAO;
import com.ruizhiqi.entity.TitlePicture;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class TitlePictureServiceImpl implements TitlePictureService {

    @Resource
    private TitlePictureDAO titlePictureDAO;

    @Override
    public List<TitlePicture> showAll() {
        return titlePictureDAO.showAll();
    }
}
