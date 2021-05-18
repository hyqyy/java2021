package java_18_extends.demo2;

public class DemoTest {
    public static void main(String[] args) {
        Dog dg = new Dog();// 无参构造
        //通过继承方法，设置属性值
        dg.setAge(2);
        dg.setName("小黑");
        dg.eat(); //调用重写后的方法，增加个体区别功能

        System.out.println("========");

        Cat ct = new Cat("小花",1); //有参构造
        ct.eat();
    }
}
