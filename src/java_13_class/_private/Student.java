package java_13_class._private;

public class Student {
    String name;
//    int age;

    private int age;  // 定义私有成员变量，起到基本数据保护功能。

    public void setAge(int a) {
        if (a>=120 || a<=0){
            System.out.println("年龄赋值有误！");
        }else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }


    public void show(){
        System.out.println("姓名:"+name+","+"年龄:"+age);
    }
}
