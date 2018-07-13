import com.ruizhiqi.entity.User;
import com.ruizhiqi.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

public class demo {

    @Test
    public void t1() {
        String[] strs = {"铜川", "安康", "商洛", "延安", "宝鸡", "汉中", "榆林", "咸阳", "西安"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append("'" + strs[i] + "'");//拼接单引号,到数据库后台用in查询.
            if (i != strs.length - 1) {//前面的元素后面全拼上",",最后一个元素后不拼
                sb.append(",");
            }
        }
        System.out.println(sb);
    }


    @Resource
    private UserService userService;

    @Test
    public void test2() {


        if (userService.showAll() != null) {
            for (User user : userService.showAll()) {
                System.out.println(user);
            }
        }
        System.out.println("user为空");
    }


    @Test
    public void t3() {
        String str = "sd,";
        System.out.println(str.length());
        //str.substring(0, str.length()-1)   从下标0开始截取到str.length()-1个字符
        String substring = str.substring(0, str.length() - 1);
        System.out.println(substring);

        //从下标第几个字符串开始截取
        System.out.println(str.substring(1));
    }

/*
    @Test
    public void t3(){
        String picPath =  "C:\\cc\\download.jpg";
        fileItem fileItem = createFileItem(picPath);

        MultipartFile mfile = new CommonsMultipartFile(fileItem);
    }


    private static MultipartFile getMulFileByPath(String picPath) {

        FileItem fileItem = createFileItem(picPath);

        MultipartFile mfile = new CommonsMultipartFile(fileItem);

        return mfile;

    }*/



   /* @Test
    public void t2(){

        User user1 = new User(null, "lijie", 21);
        User user2 = new User(null, "lijie", 21);
        User user3 = new User(null, "lijie", 21);

        User[] users = {user1,user2,user3};

        userService.inserts(users);

    }

    @Test
    public void t3(){

        String[] names = {"lijie","zhangsan","zhaosi"};
        StringBuilder sb = new  StringBuilder();
        for (int i = 0; i < names.length; i++) {
            sb.append("'"+names[i]+"'");//拼接单引号,到数据库后台用in查询.
            if(i!=names.length-1){//前面的元素后面全拼上",",最后一个元素后不拼
                sb.append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
        userService.insert1(s);

    }

    @Test
    public void t4(){

        userService.insert1("666");

    }

    @Test
    public void t5(){
       String[] str = {"1","2"};


        List<User> users = userService.slectByIds(str);
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("hello");
        System.out.println("hello");

    }*/

/*    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        List<User> users = userService.showAll();
        if (users != null) {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }*/




 /*  @Test
    public void r1(){
        List<User> users = userService.showAll();
        if(users != null){
            for (User user : users) {
                System.out.println(user);
            }
        }

    }*/


}
