package java_10_array;
import java.util.Arrays;
public class ArrayTest {
    // 数组定义
    static void arraytest(){
        // 数组定义(动态)
        int[] arr = new int[5];
        System.out.println("数组长度:"+arr.length);
        System.out.println(arr[0]);

        // 数组定义(静态)
        int[] arr1 = {11,22,33,44,55};
        System.out.println(arr[0]);
    }

    // 数组遍历
    static void loopArray(){

        int[] arr = {1,2,3,4,5,6};

        // 数组遍历1
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("--------");


        // 数组遍历2
        for(int i:arr){
            System.out.println(i);
        }

    }

    // 数组排序
    static void arraysort(){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }

    // 输出数组的最大值
    static void printMax(){

        int[] arr = {1,213,45,2,78,6,14,21,51,};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }

        }

        System.out.println("数组中最大值是："+max);

    }


    public static void main(String[] args) {
//        arraytest();
//        loopArray();
//        arraysort();
        printMax();

    }
}

