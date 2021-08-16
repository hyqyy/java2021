package java_25_exception;

/**
 * try/catch捕捉异常
 */
public class TestDemo1 {

    // 捕捉处理异常
    public static void method() {

        try {
            int[] arr = {1, 2, 3, 4};
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println(e.getMessage()); //输出异常信息
        }
    }


    // 异常捕捉并直接抛出
    public static void method2() {

        try {
            int[] arr = {1, 2, 3, 4};
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            throw e; // 直接抛出异常对象
        }
    }

    public static void main(String[] args) {

        System.out.println("start...");
//        method();
        try{
        method2();}
        catch (Exception e){
            System.out.println("直接抛出的异常，必须在引用处继续处理");
        }
        System.out.println("end...");

    }

}
