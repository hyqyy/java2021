package java_26_shujujiegou;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "周芷若"); // 新增
        System.out.println("添加元素后："+map);
        System.out.println("=========");

        map.put("张无忌","赵敏"); // 更新
        System.out.println("修改元素后："+map);
        System.out.println("=========");

        map.remove("张无忌"); // 删除
        System.out.println("删除元素后："+map);
        System.out.println("=========");

        int num = map.size();
        System.out.println("map键值对个数：" + num);
        System.out.println("=========");

        System.out.println("map是否为空"+map.isEmpty());
        System.out.println("=========");

        System.out.println("键包含郭靖：" +map.containsKey("郭靖"));
        System.out.println("=========");

        System.out.println("值包含周芷若："+map.containsValue("周芷若"));
        System.out.println("=========");

        map.clear();
        System.out.println("map是否为空"+map.isEmpty());
        System.out.println(map);







    }




}
