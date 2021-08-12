package java_24_javaapi._integer;

public class TestInteger {

    public static void show(){
        // 获取Integer对象
        Integer i = Integer.valueOf(100);
        Integer iii = 300; // 自动装箱
        Integer ii = Integer.valueOf("200");
        System.out.println(i);
        System.out.println(ii);
        System.out.println(iii);
        System.out.println(iii + 100); // Integer + int 过程中Integer自动拆箱
    }


    public static void transform(){
        // int 转 string
        int number = 100;
        String s = String.valueOf(number);
        System.out.println("int number转化为String类型：" + s);

        // string 转 int
        String s1 = "100";

        int num = Integer.parseInt(s1);
        System.out.println("string类型转int类型"+ (num+1));


    }



    public static void main(String[] args) {
        show();
        System.out.println("=====");
        transform();

    }
}
