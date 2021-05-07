package java_07_dataInput;

import java.util.Scanner;

public class Demo_01 {

    static void threePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个人的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个人的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个人的身高：");
        int height3 = sc.nextInt();

        int tempheight = height1 > height2 ? height1 : height2;
        int maxHeight = tempheight > height3 ? tempheight : height3;

        System.out.println("这三个人中身高最高的是：" + maxHeight);
    }


    public static void main(String[] args) {
        threePerson();
    }
}
