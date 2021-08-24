package java_26_shujujiegou.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap<String, Students> hm = new HashMap<>();

        Students s1 = new Students("孙悟空", 500);
        Students s2 = new Students("猪八戒", 1500);
        Students s3 = new Students("沙悟净", 1300);

        hm.put("XT0001", s1);
        hm.put("XT0002", s2);
        hm.put("XT0003", s3);

        System.out.println(hm);
        System.out.println("====遍历如下1====");
        for (String key : hm.keySet()) {
            Students st = hm.get(key);
            System.out.println(key +","+ st.getName() +","+ st.getAge() + "岁");

        }

        System.out.println("====遍历如下2====");
        for (Map.Entry<String,Students> entry : hm.entrySet()) {
            System.out.println(entry.getKey() +","+ entry.getValue().getName() +","+ entry.getValue().getAge() + "岁");

        }

    }
}
