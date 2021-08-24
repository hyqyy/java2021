package java_26_shujujiegou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();

        // add()
        collection.add("hello");
        collection.add("world");
        collection.add("python");
        collection.add("world");
        System.out.println("添加元素:"+collection);

        //size()
        int num = collection.size();
        System.out.println("集合元素个数:"+num);

        // remove()
        collection.remove("world");
        System.out.println("删除world:"+collection);

        // isEmpty()
        boolean bool = collection.isEmpty();
        System.out.println("判断集合是否为空："+bool);

        //contains()
        boolean bool2 = collection.contains("world");
        System.out.println("判断集合是否包含元素world:"+bool2);

//         //clear()
//        collection.clear();
//        System.out.println("清空元素:"+collection);


        //集合遍历
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 集合遍历
        for (String s : collection) {
            System.out.println(s);
        }



    }

}
