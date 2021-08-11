package java_22_interface;

public class Cat extends Animal implements Jump{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String show() {
        return "猫可以跳120" + unit;
    }

    @Override
    public void jump() {
        System.out.println("猫跳跃能力很强");
    }
}
