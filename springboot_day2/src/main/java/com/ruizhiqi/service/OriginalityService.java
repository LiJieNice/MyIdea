package com.ruizhiqi.service;

import com.ruizhiqi.entity.Originality;

import java.util.List;

public interface OriginalityService {
    void insert(Originality originality);

    List<Originality> select();
}
