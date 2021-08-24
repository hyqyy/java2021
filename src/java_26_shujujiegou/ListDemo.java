package java_26_shujujiegou;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList:查询快，增删慢
 * LinkedList:增删快，查询慢；有首尾元素的增加，删除，获取独有方法。
 * 都是List的子类。
*/

public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        // add()
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        System.out.println(list);

        // 指定位置插入元素
        list.add(1,"javaee");
        System.out.println(list);

        // 指定位置删除元素
        list.remove(1);
        System.out.println(list);

        // 修改指位置元素
        list.set(1,"123");
        System.out.println(list);

        // 获取指定位置元素
        System.out.println(list.get(1));

        System.out.println("--------");
       //迭代器遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------");
        // 普通for循环遍历集合
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("--------");
        // 增强for循环遍历集合
        for(String s:list){
            System.out.println(s);
        }

    }
}
