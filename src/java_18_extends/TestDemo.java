package java_18_extends;
/**
 * 子类可以继承父类的方法和属性，并可以改写
 * 子类访问属性的顺序是本类局部变量-->本类成员变量-->父类成员变量
 * 子类访问方法，本类有优先使用本类，本类无继承使用父类，父类也没有就报错*/
public class TestDemo {

    public static void main(String[] args) {
        Fu f = new Fu();
        f.show();
        System.out.println("======方法继承和重写======");

        Zi z = new Zi();
        z.method(); //继承父类方法
        z.show();  //重写父类方法

        System.out.println("======属性访问顺序======");
        z.attribute();

        System.out.println("======本类中访问父类同名方法======");
        z.funSuper();






    }
}
