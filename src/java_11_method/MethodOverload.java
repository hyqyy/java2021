package java_11_method;

public class MethodOverload {

    /**
     * 同一个类中有多个同名方法
     * 同名方法的参数类型或者数量不同
     * 这样的一组函数就构成重载*/

    // 求两个int类型数据之和
    public static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }

    // 求两个double类型数据之和
    public static double getSum(double a,double b){
        double sum = a+b;
        return sum;
    }

    // 求三个int类型数据之和
    public static int getSum(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }


    public static void main(String[] args) {
        int x_sum = getSum(1,2);
        double y_sum = getSum(1.0,2.0) ;
        int z_sum = getSum(1,2,3) ;

        System.out.println(x_sum);
        System.out.println("-----");
        System.out.println(y_sum);
        System.out.println("-----");
        System.out.println(z_sum);

    }

}
