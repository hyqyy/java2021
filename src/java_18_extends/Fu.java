package java_18_extends;

public class Fu {
    public int age = 40; // 父类成员变量

    public Fu() {
        System.out.println("父类无参构造方法被调用");
    }

    public Fu(int age) {
        System.out.println("父类有参构造方法被调用");
        this.age = age;
    }

    public void show() {
        System.out.println("父类show方法被调用");
    }

    public void method(){
        System.out.println("父类method方法");
    }
}
