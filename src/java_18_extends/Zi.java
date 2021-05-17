package java_18_extends;

public class Zi extends Fu{

    public int height = 175;
    public int age = 30; // 本类成员变量



    public void show() {
        System.out.println("父类show方法被子类重写了，功能改变了");
    }

    public void attribute(){
        int age = 20; // 本类局部变量
        System.out.println("子类自有身高属性:"+height);
        System.out.println("访问age:"+age); // 类局部变量-->本类成员变量-->父类成员变量
        System.out.println("this关键字访问本类成员变量age:"+this.age); //本类中有同名属性名，访问成员变量用this
        System.out.println("super关键字访问父类成员变量age:"+super.age);

    }


    public void funSuper(){
        show(); // 使用本类show方法
        super.show(); //调用父类show方法
    }
}



