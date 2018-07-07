import com.ruizhiqi.entity.Jp;
import com.ruizhiqi.entity.Jpg;
import com.ruizhiqi.entity.User;
import com.ruizhiqi.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class TestUser {


    @Resource
    private UserService userService;

    @Test
    public void t1() {
        List<User> users = userService.showAll();
        for (User user : users) {

            System.out.println(user);
        }
    }

    @Test
    public void t2() {
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(s);
    }

/*    @Test
    public void t3() {
        User user = new User(null, "小黑", 22);

        userService.insert(user);
    }*/

    //将String类型转化为Long类型
    @Test
    public void t4() {
        //uuid不能转换，因为uuid中有英文字母
        String s = UUID.randomUUID().toString().replaceAll("-", "");

        String suv = "123456";
        long l = Long.parseLong(suv);
        System.out.println(l);

        String str = "石头人";
        System.out.println(str.length());

        /*
        * long l  = Long.parseLong([String],[int radix]);
          long l = Long.valueOf("123").longValue();*/
    }


    //获取图片的宽和高
    @Test
    public void t5() {
        File file = new File("C:\\Users\\EDZ\\Desktop\\新建文件夹\\u=302701032,2300144492&fm=27&gp=0.jpg");
        /*try {
            FileInputStream in = new FileInputStream(file);
            BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
            int height = bi.getHeight();//获取高度
            int width = bi.getWidth();//获取宽度
            System.out.println("高：" + height);
            System.out.println("宽：" + width);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


    @Test
    public void s6() {
        String[] titles = new String[]{"标题1", "标题2"};
        String[] contents = new String[]{"标题内容1", "标题内容2"};
        String[] myfiles = new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"};
        String[] imgContents = new String[]{"这是图片内容one", "这是图片内容two", "这在图片内容san"};


        System.out.println("==================");
        ArrayList<String> list = new ArrayList<>();


        //这是将标题和字段组合在一起
       /* if(titles != null && titles.length>0 && contents != null && contents.length>0){
            for (int i = 0; i < titles.length; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                for(int j = 0; j<contents.length; j++){
                    if(i==j){
                        stringBuffer = stringBuffer.append(titles[i]+","+contents[j]);
                        String s = stringBuffer.toString();
                        list.add(s);
                        //System.out.println(stringBuffer);
                    }
                }
            }
        }


        //这是将图片和内容组合在一起
        ArrayList<String> list2 = new ArrayList<>();

        if(myfiles != null && myfiles.length>0 && imgContents != null && imgContents.length>0){
            for (int i = 0; i < myfiles.length; i++) {


                StringBuffer stu = new StringBuffer();
                for(int j = 0; j<imgContents.length; j++){
                    if(i==j){
                        stu.append(myfiles[i]+","+imgContents[j]);
                        //System.out.println(stu);
                        String s = stu.toString();
                        list2.add(s);
                    }
                }
            }
        }

        for (String str : list2) {

            System.out.println(str+"==============");
        }


        for(int i = 0;i <list.size();i++){
            for(int j = 0;j<list2.size();j++){
                String[] title = list.get(i).split(",");
                //计算出标题的长度
                int titleLength = title[i].length();
                System.out.println("标题的长度："+titleLength);

                String[] imgs = list2.get(j).split(",");

                //System.out.println(imgs+"++++++++++++++++++++++图片的路径");
                System.out.println(imgs[j]+"++++++++++++++++++++++图片的路径");
                *//*try {
                    FileInputStream in = new FileInputStream(imgs[j]);
                    BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                    //int height = bi.getHeight();//获取高度
                    int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                    //System.out.println("高：" + height);
                    //System.out.println("宽：" + width);
                    if(width==370){
                        System.out.println(list.get(i)+""+list2.get(j));
                    }
                    if(width==1040 && titleLength<=40){
                        System.out.println(list.get(i)+""+list2.get(j));
                    }



                } catch (IOException e) {
                    e.printStackTrace();
                }*//*




            }
        }*/

    }


    @Test
    public void t7() {
        String str = "我是谁";
        System.out.println(str.length());
    }

    @Test
    public void t8() {
        String str = "我是,李杰";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

    @Test
    public void t9() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hehe");
        map.put(2, "yaya");
        map.put(3, "haha");
        map.put(4, "xixi");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

    }

    /*@Test
    public void t10(){
        Jpg imgPath = new Jpg("1",new String[]{"C:\\cc\\download.jpg","C:\\cc\\2.jpg","C:\\cc\\3.jpg"});
        String[] imgPath1 = imgPath.getImgPath();
        for (String s : imgPath1) {
            System.out.println(s);
        }
        System.out.println(imgPath);
    }*/


    @Test
    public void s9() {
        String[] titles = new String[]{"标题1", "标题2", "标题3"};
        String[] contents = new String[]{"标题内容1", "标题内容2", "标题内容3"};


        String id = UUID.randomUUID().toString().replaceAll("-", "");
        //这是图片  把图片放入一个对象中，因为上传的图片不仅仅是一张，把三张小图放在一块归为一类

        Jpg jpg3 = new Jpg(id, "这是图片内容one", new String[]{"C:\\cc\\3.jpg"});
        Jpg jpg2 = new Jpg(id, "这是图片内容two", new String[]{"C:\\cc\\2.jpg"});
        Jpg jpg1 = new Jpg(id, "这在图片内容three", new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"});


        Jpg[] jpgs = new Jpg[]{jpg1, jpg2, jpg3};


        ArrayList<String> list = new ArrayList<>();


        //这是将标题和字段组合在一起
        if (titles != null && titles.length > 0 && contents != null && contents.length > 0) {
            for (int i = 0; i < titles.length; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0; j < contents.length; j++) {
                    if (i == j) {
                        stringBuffer = stringBuffer.append(titles[i] + "," + contents[j]);
                        String s = stringBuffer.toString();
                        list.add(s);
                    }
                }
            }
        }


        //是标题和标题信息一一对应
        for (int i = 0; i < list.size(); i++) {
            //遍历图片对象和图片信息集合

            String[] title = list.get(i).split(",");

            //[标题，标题内容] 截取下标为0的数获取到标题
            //计算出标题的长度
            int titleLength = title[0].length();

            //得到标题的长度
            System.out.println("标题的长度：" + titleLength);


            //计算图图片的路径
            for (int j = 0; j < jpgs.length; j++) {
                //一个数组为一种
                String[] imgPaths = jpgs[j].getImgPath();
                //如果大于0为3图   否则为大图或单图
                if (imgPaths.length == 1) {
                    try {
                        FileInputStream in = new FileInputStream(imgPaths[0]);
                        BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                        //int height = bi.getHeight();//获取高度
                        int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                        //System.out.println("宽：" + width);
                        if (width == 370 && titleLength <= 44) {
                            System.out.println(list.get(i) + jpgs[j] + "单图=============");
                        }

                        if (width == 1040 && titleLength <= 40) {
                            System.out.println(list.get(i) + jpgs[j] + "大图=============");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (imgPaths.length > 1) {

                    try {
                        String img = "";
                        //获取到照片的路径，赋值给Img
                        for (String imgPath : imgPaths) {
                            img = imgPath;
                        }
                        FileInputStream in = new FileInputStream(img);
                        BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                        //int height = bi.getHeight();//获取高度
                        int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                        //System.out.println("高：" + height);
                        //System.out.println("宽：" + width);
                        System.out.println(list.get(i) + jpgs[j] + "三图=============");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    //System.out.println(imgPath);

                }

            }
        }
    }


    @Test
    public void s10() throws IOException {

        String id = UUID.randomUUID().toString().replaceAll("-", "");

        Jp jp1 = new Jp(id, "标题1", "标题内容1", "这是图片内容one", new String[]{"C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp2 = new Jp(id, "标题2", "标题内容2", "这是图片内容two", new String[]{"C:\\cc\\2.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp3 = new Jp(id, "标题3", "标题内容3", "这是图片内容three", new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");

        ArrayList<Jp> list = new ArrayList<>();

        list.add(jp1);
        list.add(jp2);
        list.add(jp3);


        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contentss = new ArrayList<>();

        for (Jp jp : list) {
            String title = jp.getTitle();
            String contents = jp.getContents();
            titles.add(title);
            contentss.add(contents);
        }
        //这是图片  把图片放入一个对象中，因为上传的图片不仅仅是一张，把三张小图放在一块归为一类


        for (int i = 0; i < list.size(); i++) {

            //是标题和标题信息一一对应
            for (Jp jp : list) {
                //遍历图片对象和图片信息集合

                //[标题，标题内容] 截取下标为0的数获取到标题
                //计算出标题的长度

                int titleLength = jp.getTitle().length();


                //得到标题的长度
                System.out.println("标题的长度：" + titleLength);


                //计算图图片的路径
                //for (Jp jp : list) {
                //一个数组为一种

                if (jp.getImgPath() != null) {
                    String[] imgPaths = jp.getImgPath();

                    //String[] imgPaths = list.get(i).getImgPath();
                    //System.out.println(i+"========================================================");
                    //如果大于0为3图   否则为大图或单图
                    if (imgPaths.length == 1) {
                        try {
                            FileInputStream in = new FileInputStream(imgPaths[0]);
                            BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                            //int height = bi.getHeight();//获取高度
                            int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                            //System.out.println("宽：" + width);
                            if (width == 370 && titleLength <= 44) {

                                System.out.println(jp.getTitle() + jp.getContents() + imgPaths[0] + jp.getImgContents() + "单图=============");
                            }

                            if (width == 1040 && titleLength <= 40) {
                                System.out.println(jp.getTitle() + jp.getContents() + imgPaths[0] + jp.getImgContents() + "大图=============");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (imgPaths.length > 1) {

                        // try {
                        String img = "";
                        //获取到照片的路径，赋值给Img

                        for (int j = 0; j < imgPaths.length; j++) {
                            if (imgPaths.length > j) {
                                img += imgPaths[j] + ",";
                            }
                        }



                        /*
                        这个方法去除最后一个字符串
                        * img.substring(0,img.length()-1) + jp.getImgContents()
                        *
                        * */
                            /*for (String imgPath : imgPaths) {
                                img += imgPath;
                            }*/
                        //FileInputStream in = new FileInputStream(img);
                        //BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                        //int height = bi.getHeight();//获取高度
                        //int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                        //System.out.println("高：" + height);
                        //System.out.println("宽：" + width);
                        System.out.println(jp.getTitle() + jp.getContents() + img.substring(0, img.length() - 1) + jp.getImgContents() + "三图=============");
                    }
                }

            }
        }
    }


}