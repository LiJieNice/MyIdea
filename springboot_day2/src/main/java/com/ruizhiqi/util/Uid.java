package com.ruizhiqi.util;

import java.util.UUID;

public class Uid {


    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
