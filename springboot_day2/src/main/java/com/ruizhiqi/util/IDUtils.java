package com.ruizhiqi.util;


import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.UUID;

public class IDUtils {

    private static int id = 0;
    private static long time;
    private static String hostCode;//主机编号
/*static{
        //读取配置文件
        ResourceBundle conf = ResourceBundle.getBundle("host");
        hostCode=conf.getString("hostCode");

        }*/

    /**
     * 图片名生成
     */
    public static String genImageName() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);

        return str;
    }

    /**
     * id生成
     */
    public static long getId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上两位随机数
        long end3 = getRand(millis);
        //如果不足两位前面补0
//		String str = millis + String.format("%03d", end3);
//		long id = new Long(str);
        return end3;
    }


    private synchronized static long getRand(long l) {
        if (l > time) {
            time = l;
            id = 0;
        } else {
            id++;
        }

        if (id > 99) {
            id = 0;
            time = time + 1;
        }
        String str = time + hostCode + String.format("%02d", id);
        long ids = new Long(str);
        //System.out.println(ids);
        return ids;
    }


    //public static void main(String[] args) {


    @Test
    public void t4() {
        int m = 0;
        System.out.println(System.currentTimeMillis());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 99999; i++) {
//
//			if(getId()==getId()){
//				m++;
//				System.out.println("重复了"+m+"ci");
//			}
            hashSet.add(getId());
        }
        System.out.println(hashSet.size());
        System.out.println(getId());
        System.out.println(System.currentTimeMillis());
        System.out.println(UUID.randomUUID().toString());
        if (UUID.randomUUID().toString().equals(UUID.randomUUID().toString())) {
            m++;
            System.out.println("重复了" + m + "ci");
        }
    }
}