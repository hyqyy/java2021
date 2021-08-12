package java_24_javaapi._stringSort;

import org.omg.CORBA.ARG_OUT;

import java.util.Arrays;

public class TestStringSort {
    // 字符串排序
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        System.out.println(s);

        // 转化为数组
        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

        // 排序
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 构造字符串对象，输出
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }

        String result = sb.toString();
        System.out.println(result);

    }
}
