package java_11_method;

public class MethodParams {

    // 参数为基本类型,形参的改变不影响实参
    public static void changeInt(int num){
        num = 111;
    }

    // 参数为引用类型，形参改变，实参也会改变。
    public static void changeArray(int[] arr){
        arr[0]=111;
    }


    public static void main(String[] args) {
        int num = 100;
        int[] arr = {100,200,300};

        System.out.println("调用前num="+num);
        changeInt(num); // 调用方法改变形参的值
        System.out.println("调用前num="+num);

        System.out.println("调用前arr[0]="+arr[0]);
        changeArray(arr); // 调用方法改变形参的值
        System.out.println("调用后arr[0]="+arr[0]);

    }


}
