package java_26_shujujiegou;

import java.util.HashSet;
import java.util.Set;

/**
 *set无序，不可重复 ；因为无序，没有索引，所以不能使用普通的for循环遍历
 * hashcode(),equals()保证唯一*/
public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("黄");
        set.add("运");
        set.add("强");
        set.add("强");

        System.out.println(set);
        for(String s :set){
            System.out.println(s);
        }
    }

}
