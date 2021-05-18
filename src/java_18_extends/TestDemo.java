package java_18_extends;
/**
 * 子类可以继承父类的方法和属性，并可以改写
 * 子类访问属性的顺序是本类局部变量-->本类成员变量-->父类成员变量
 * 子类访问方法，优先使用本类，本类无,继承使用父类，父类也没有就报错
 * 父类的私有方法不能被继承，因此也不能被重写
 * 重写父类方法，必须满足方法名一致，子类重写方法的权限不低于父类（public>默认>私有）
 * @Override注解可以帮助检查重写基本规则
 * java类不支持多继承，支持多层继承
 * 子类中所有构造方法会默认调用父类无参构造方法*/
public class TestDemo {

    public static void main(String[] args) {
//        Fu f = new Fu();
//        f.show();
//        System.out.println("======方法继承和重写======");
//
//        Zi z = new Zi();
//        z.method(); //继承父类方法
//        z.show();  //重写父类方法
//
//        System.out.println("======属性访问顺序======");
//        z.attribute();
//
//        System.out.println("======本类中访问父类同名方法======");
//        z.funSuper();

        System.out.println("======子类中所有构造方法默认调用父类无参构造方法======");
        Zi z1 = new Zi();

        Zi z2 = new Zi(30);






    }
}
