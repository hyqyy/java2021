package java_18_extends.demo1;

public class DmeoTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(25);
        s1.setName("令狐冲");
        s1.show();
        s1.study();

        System.out.println("=========");
        Student s2 = new Student("张无忌",22);
        s2.show();
        s2.study();

        System.out.println("=========");
        Teacher t1 = new Teacher();
        t1.setAge(80);
        t1.setName("风清扬");
        t1.show();
        t1.teach();

        System.out.println("=========");
        Teacher t2 = new Teacher("张三丰",100);
        t2.show();
        t2.teach();

    }
}
