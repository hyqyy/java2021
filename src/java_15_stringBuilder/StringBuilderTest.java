package java_15_stringBuilder;

public class StringBuilderTest {

    // StringBuilder定义
    public static void stringDefine(){
        StringBuilder sb = new StringBuilder("hello world!"); //构造方法
        System.out.println(sb);

        // String内容不可变，StringBuilder内容是可变的；
        StringBuilder sb1 = sb.append("hello Java!");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb==sb1); //地址相同

        // StringBuilder遍历
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }
    }

    // StringBuilder添加append,反转reverse方法
    public static void stringMethod(){
        StringBuilder sb = new StringBuilder();
        sb.append("ABC").append(123).append('a').append(1.23f); //添加 append
        System.out.println(sb);


        StringBuilder sb1 = sb.reverse(); //反转 reverse
        System.out.println("字符串:"+sb+"反转后是"+sb1);




    }

    // String转化为StringBuilder
    public static void strToSB(){

        String st = "ABC";
        StringBuilder sb = new StringBuilder(st);
        System.out.println(sb.append(11));

    }

    // StringBuilder转化为String
    public static void sbToStr(){
        StringBuilder sb = new StringBuilder("ABC");
        String st = sb.toString();
        System.out.println(st);

    }


    public static void main(String[] args) {
//        stringDefine();
//        stringMethod();
//        strToSB();
//        sbToStr();
    }

}
