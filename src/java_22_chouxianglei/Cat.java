package java_22_chouxianglei;

/**
 * 继承了抽象类，子类必须重写所有抽象类的抽象方法*/

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    @Override
    public void run() {
        System.out.println("pao......");
    }
}
