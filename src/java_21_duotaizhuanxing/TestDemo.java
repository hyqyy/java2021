package java_21_duotaizhuanxing;


public class TestDemo {

    public static void main(String[] args) {

        // 向上转型 ，多态
        Animal an = new Cat();
        an.eat();
        // an.playGame();


        Cat c = (Cat)an;  //向下转型
        c.eat();
        c.playGame();


    }

}
