package java_22_chouxianglei;

/**
 抽象类，抽象方法 abstract修饰*/
public abstract class Animal {

    private String name;
    private int age;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public abstract void run();

    public void sleep(){
        System.out.println("睡觉");
    }
}
