package java_22_interface;

public class Dog extends Animal implements Jump{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("狗跳跃能力差一点");
    }


    @Override
    public String show() {

        return "狗可以跳70" + unit;
    }
}
