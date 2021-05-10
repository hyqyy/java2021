package java_13_class._baseClass;

/**
 * 不定义构造方法，默认无参构造方法
 * 建议每次自定义无参构造方法，以便使用
 * */

public class Student {

    // 成员变量(私有化)
    private String name;
    private int age;

    // set方法，外部访问设置私有成员变量值

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // get方法，外部访问获取私有成员变量值


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 无参构造方法
    public Student(){
        System.out.println("无参构造方法");
    }

    // 有参构造方法
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参数构造方法");
    }

    // 成员方法
    public void show(){
        System.out.println("姓名:"+name+","+"年龄:"+age);
    }

}
