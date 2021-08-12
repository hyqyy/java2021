package java_24_javaapi._arrays;

import java.util.Arrays;
/**
 * Arrays.toString();
 * Arrays.sort();
 * */
public class TestArrary{

    public static void main(String[] args) {

//        String[] arr = {"A24","D69","B80","G57","R13"};
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前：" + Arrays.toString(arr));

        // 数组排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
