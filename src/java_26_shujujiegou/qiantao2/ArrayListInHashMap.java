package java_26_shujujiegou.qiantao2;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建一个HashMap集合,存储三个元素，元素的键为字符串，值为ArrayList集合*/
public class ArrayListInHashMap {
    public static void main(String[] args) {
        // 创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> sanguo = new ArrayList<>();
        sanguo.add("诸葛亮");
        sanguo.add("刘备");
        hm.put("三国演义",sanguo);


        ArrayList<String> xiyouji = new ArrayList<>();
        xiyouji.add("孙悟空");
        xiyouji.add("猪八戒");
        hm.put("西游记",xiyouji);


        ArrayList<String> shuihu = new ArrayList<>();
        shuihu.add("鲁智深");
        shuihu.add("武松");
        hm.put("水浒传",shuihu);
        System.out.println(hm);
        System.out.println("====如下遍历1====");

        for(String key : hm.keySet()){
            System.out.println(key);
            for(String value :hm.get(key)){
                System.out.println("\t"+value);
            }
        }


        System.out.println("====如下遍历2====");
        for(Map.Entry<String, ArrayList<String>> entry:hm.entrySet()){

            System.out.println(entry.getKey());
            for(String value : entry.getValue()){
                System.out.println("\t" + value);
            }

        }


    }
}
