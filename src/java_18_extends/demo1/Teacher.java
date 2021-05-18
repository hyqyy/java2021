package java_18_extends.demo1;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    public void teach() {
        System.out.println("老师，授之以渔");
    }

}