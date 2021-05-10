package java_13_class._initMethod;

/**
 * 不定义构造方法，默认无参构造方法
 * 建议每次自定义无参构造方法，以便使用
 * */

public class Student {

    private String name;
    private int age;


    // 构造方法(默认)：修饰符 类名(){}
    public Student(){
        System.out.println("无参构造方法");
    }

    // 构造方法：修饰符 类名(参数){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参数构造方法");
    }


    public void show(){
        System.out.println("姓名:"+name+","+"年龄:"+age);
    }

}
