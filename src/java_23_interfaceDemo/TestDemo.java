package java_23_interfaceDemo;

/**
 * 共有属性行为抽取为抽象类，独特行为可以抽取为接口，具体类继承抽取的公共类，如有独特行为可以实现对应的行为接口*/

public class TestDemo {

    public static void main(String[] args) {

        PingpongCoach pc = new PingpongCoach();
        pc.setName("刘国梁");
        pc.setAge(42);
        System.out.println(pc.getName()+","+pc.getAge());
        pc.eat();
        pc.teach();
        pc.speak(); // 独有行为,乒乓从业者需要学习英语

        System.out.println("==================");

        BasketballCoach bc = new BasketballCoach("卡尔",54);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();


        System.out.println("==================");

        PingpongPlayer pp = new PingpongPlayer();
        pp.setName("马龙");
        pp.setAge(23);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.study();
        pp.speak(); // 独有行为,乒乓从业者需要学习英语


        System.out.println("==================");

        BasketballPlayer bp = new BasketballPlayer("姚明",35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();


    }

}
