package java_16_arrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(); //定义

        // 增加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array:"+array);
        
        // 在指定索引位置增加元素
        array.add(1,"hhh");
        System.out.println("array:"+array);

        // 删除元素
//        array.remove("world");
//        System.out.println("array:"+array);

        // 修改元素
        array.set(1,"www");
        System.out.println("array"+array);


    }


    }
