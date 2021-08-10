package java_22_chouxianglei;


public class TestDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() +"猫,"+a.getAge());
        a.eat();
        a.sleep();
        System.out.println("--------------------------");


        a = new Cat("Tom",5);
        System.out.println(a.getName() +"猫,"+a.getAge());
        a.eat();
        a.sleep();

        System.out.println("===============================");

        a = new Dog("哈士奇",3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a.sleep();

    }
}
