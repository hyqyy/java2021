package java_28_annotation;

public class Students {

    // 成员变量：一个私有，一个默认，一个公共
    private String name;
    int age;
    public String address;

    // 构造方法：一个私有，一个默认，两个公共

    private Students(String name) {
        this.name = name;
    }


    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Students() {
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 成员方法：一个私有，四个公共
    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String s) {
        System.out.println("method2:" + s);
    }

    public String method3(String s, int i) {
        return "method3:"+ s +"," + i;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
