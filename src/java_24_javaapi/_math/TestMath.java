package java_24_javaapi._math;

public class TestMath {

    public static void main(String[] args) {
        // 绝对值,
        System.out.println(Math.abs(88.0));
        System.out.println(Math.abs(-88));
        System.out.println("===============");
        //取大于参数的最小整数，duble类型
        System.out.println(Math.ceil(12.31));
        System.out.println(Math.ceil(12.76));
        System.out.println("===============");
        // 取小于参数的最小整数，duble类型
        System.out.println(Math.floor(12.31));
        System.out.println(Math.floor(12.76));
        System.out.println("===============");
        // 取参数四舍五入,int类型
        System.out.println(Math.round(12.31));
        System.out.println(Math.round(12.76));
        System.out.println("===============");
        // 取参数较大者
        System.out.println(Math.max(12.1,15));
        System.out.println(Math.max(12,15));
        System.out.println("===============");
        //取参数较小者
        System.out.println(Math.min(12,15.1));
        System.out.println(Math.min(12,15));
        System.out.println("===============");
        // 取参数的幂.例2的3次幂
        System.out.println(Math.pow(2,3));
        System.out.println("===============");
        // 取随机数[0,1.0)
        System.out.println((int)(Math.random()*100));

    }
}
