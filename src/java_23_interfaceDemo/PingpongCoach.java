package java_23_interfaceDemo;

public class PingpongCoach extends Coach implements SpeakEnglish{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓教练教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练要学习英语");
    }
}
