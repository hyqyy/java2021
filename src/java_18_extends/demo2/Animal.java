package java_18_extends.demo2;

public class Animal {

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

    public void eat(){
        System.out.println(this.name+"出生"+this.age+"个月了。可以吃东西了...");
    }

}
