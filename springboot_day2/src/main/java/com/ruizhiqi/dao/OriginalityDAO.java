package com.ruizhiqi.dao;

import com.ruizhiqi.entity.Originality;

import java.util.List;

public interface OriginalityDAO {
    void insert(Originality originality);

    List<Originality> select();
}
