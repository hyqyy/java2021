package java_22_interface;

public class TestDemo {

    public static void main(String[] args) {

       Jump j = new Cat();
       j.jump();

       Animal a = new Cat();
       String text = a.show();
       System.out.println(text);

       System.out.println("===========");

       Cat cat = new Cat();
       cat.jump();
       String text2 = cat.show();
       System.out.println(text2);






    }
}
