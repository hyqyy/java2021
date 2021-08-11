package java_23_interfaceDemo;

public class PingpongPlayer extends Player implements SpeakEnglish{

    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员需要学习英语");
    }
}

