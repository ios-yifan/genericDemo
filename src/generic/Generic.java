package generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("这是一个字符串");
//        list.add(100);

        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println("打印" + i + ":" + s);
        }
    }
}
