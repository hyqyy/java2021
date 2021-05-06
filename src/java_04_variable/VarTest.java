/*
* 变量名不能重复
* 变量赋值后才能使用
* 定义long类型要+L
* 定义float类型+F*/

package java_04_variable;
public class VarTest {
    public static void main(String[] args) {

        byte b = 11; // 定义byte类型变量
        System.out.println("byte类型:"+b);

        char c = 'c'; // 定义char类型变量
        System.out.println("char类型:"+c);

        short s = 10; // 定义short类型变量
        System.out.println("short类型:"+s);

        int i = 10000; // 定义int类型变量
        System.out.println("int类型:"+i);

        long l = 100000000000L; // 定义long类型变量
        System.out.println("long类型:"+l);

        float f = 1.13F; // 定义float类型变量
        System.out.println("float类型:"+f);

        double d = 13.14; // 定义double类型变量
        System.out.println("double类型:"+d);

        boolean bol = false; // 定义boolean类型变量
        System.out.println("boolean类型:" + bol);

    }
}
