package java_26_shujujiegou.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {

    // 实现学生对象按照成绩总分从高到低排序存储（主要条件），学生类实现Comparable接口，重写compareTo方法实现需求。
    public static void testStudents() {

        TreeSet<Students> set = new TreeSet<Students>();

        Students s1 = new Students("令狐冲", 100, 98);
        Students s2 = new Students("张无忌", 97, 99);
        Students s3 = new Students("乔峰", 97, 98);
        Students s4 = new Students("虚竹", 100, 100);

        Students s5 = new Students("孙悟空", 96, 99); // 总分和乔峰一样，compareTo中实现次要条件
        Students s6 = new Students("猪八戒", 97, 98); // 总分和乔峰一样，英语也一样，compareTo中实现次要条件
        Students s7 = new Students("猪八戒", 97, 98); // 所有属性都一样，则判定为同一个对象


        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);

        for (Students s : set) {
            System.out.println(s);
        }
    }


    // 实现老师年龄按照从小到大排序存储,Comparator
    public static void testTeachers() {

        TreeSet<Teachers> set = new TreeSet<Teachers>(new Comparator<Teachers>() {
            @Override
            public int compare(Teachers t1, Teachers t2) {
                int num = t1.getAge()-t2.getAge();
                return num==0?t1.getName().compareTo(t2.getName()):num;
            }

        });


        Teachers t1 = new Teachers("风清扬", 110);
        Teachers t2 = new Teachers("张三丰", 100);
        Teachers t3 = new Teachers("无崖子", 100); // 年龄一样，按照次要条件比价
        Teachers t4 = new Teachers("唐僧", 45);
        Teachers t5 = new Teachers("菩提祖师", 100000);

        Teachers t6 = new Teachers("无崖子", 100); // 所有属性都一样，则判定为同一个对象,去重



        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);

        for(Teachers s: set) {
            System.out.println(s);
        }






    }


    public static void main(String[] args) {
        testStudents();
        System.out.println("========");
        testTeachers();
    }
}
