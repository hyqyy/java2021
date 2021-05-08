package java_11_method;

public class MethodDefine {
    /**函数返回类型和定义类型要保持一致
     * 形参和实参数据类型要保持一致*/

    // 无参无返回值
    public static void getMax1() {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // 无参有返回值
    public static int getMax2() {
        int a = 10;
        int b = 30;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 有参无返回值
    public static void getMax3(int a, int b) {

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // 有参有返回值
    public static int getMax4(int a, int b){

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }


    public static void main(String[] args) {

        getMax1();

        System.out.println("-----");

        int num = getMax2();
        System.out.println(num);

        System.out.println("-----");
        getMax3(10, 40);

        System.out.println("-----");
        int number = getMax4(10, 50);
        System.out.println(number);

    }
}
