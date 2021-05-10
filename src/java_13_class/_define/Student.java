package java_13_class._define;

public class Student {

    // 成员变量
    String name;
    int age;

    // 成员方法
    public void study() {
        System.out.println("好好学习");
    }

    // 成员方法,带返回值，参数
    public String doHomework(String a) {

        // 局部变量
        int x;
        int y = 11;
        //        System.out.println(x);  //局部变量不赋值，不会自动初始化默认值，故：不赋值不可以使用
        System.out.println("y=" + y);


        return a + "多做练习";
    }
}
