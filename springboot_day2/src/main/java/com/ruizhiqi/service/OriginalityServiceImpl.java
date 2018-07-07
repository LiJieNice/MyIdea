package com.ruizhiqi.service;

import com.ruizhiqi.dao.OriginalityDAO;
import com.ruizhiqi.entity.Originality;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class OriginalityServiceImpl implements OriginalityService {


    @Resource
    private OriginalityDAO originalityDAO;

    @Override
    public void insert(Originality originality) {

        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        originality.setId(uuid);
        originalityDAO.insert(originality);
    }

    @Override
    public List<Originality> select() {
        List<Originality> originalitys = originalityDAO.select();
        return originalitys;
    }
}
