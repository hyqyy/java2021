package java_18_extends.demo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        /**super.setAge(age);
         super.setName(name);*/
        super(name,age);
    }

    @Override //注解，辅助检查重写格式
    public void eat(){
        super.eat();
        System.out.println(super.getName()+"爱啃骨头");
    }
}
