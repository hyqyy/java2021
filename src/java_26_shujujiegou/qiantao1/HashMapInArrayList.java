package java_26_shujujiegou.qiantao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 需求:创建一个ArrayList集合，存储三个元素，每个元素都是一个HashMap,HashMap的键值都是String,并遍历
 */
public class HashMapInArrayList {

    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大桥");
        hm1.put("周瑜", "小乔");
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        array.add(hm3);

        System.out.println(array);
        System.out.println("====如下遍历1====");

        // 遍历方式1
        for (HashMap<String, String> map : array) {
            for (String key : map.keySet()) {
                System.out.println(key + "," + map.get(key));
            }
        }


        // 遍历方式2
        System.out.println("====如下遍历2====");
        for (HashMap<String, String> map : array) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "," + entry.getValue());
            }
        }

    }

}


