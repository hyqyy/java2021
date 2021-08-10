package java_20_duotai;


public class TestDemo {
    public static void main(String[] args) {

        AnimalOperate ao = new AnimalOperate();

        Animal cat = new Cat(); // 多态
        ao.useAnimal(cat);

        Animal dog = new Dog(); // 多态
        ao.useAnimal(dog);


    }
}
