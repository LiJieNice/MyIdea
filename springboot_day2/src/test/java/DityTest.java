import com.ruizhiqi.entity.Dity;
import com.ruizhiqi.service.DityList;
import org.junit.Test;

import java.util.ArrayList;

public class DityTest {


    @Test
    public void t1() {
        Dity dity1 = new Dity();
        Dity dity2 = new Dity();
        Dity dity3 = new Dity();
        Dity dity4 = new Dity();

        dity1.setId("23");
        dity2.setId("23");
        dity3.setId("23");
        dity4.setId("23");

        ArrayList<Dity> list = new ArrayList<>();

        list.add(dity1);
        list.add(dity2);
        list.add(dity3);
        list.add(dity4);

        DityList dityList = new DityList();

        dityList.testDity(list);
    }


    @Test
    public void t2() {
        String str = "123,w234,234234,23423";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

}
