package java_07_dataInput;

import java.util.Scanner;  // 导包

public class DataInput {

    static void datainput(){
        Scanner sc = new Scanner(System.in); // 创建对象
        int i = sc.nextInt(); // 接收键盘输入
        String s = sc.next(); // 接收键盘输入
        System.out.println("键盘录入int为："+i);
        System.out.println("键盘录入为："+s);

    }

    public static void main(String[] args) {
        datainput();
    }
}
