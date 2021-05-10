package java_13_class._this;


public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        // age=age 局部变量
        this.age = age; // this访问同名的成员变量
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("姓名:"+name+","+"年龄:"+age);
    }
}
