package java_12_demo;

import java.util.Arrays;
import java.util.Scanner;

public class DemoTest {
    // 减肥计划if分支练习
    public static void ifTest() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-7数字:");
            int weekday = sc.nextInt();
            if (weekday > 7 || weekday < 1) {
                System.out.println("您输入的数字有误，请重新输入！");
            } else if (weekday == 1) {
                System.out.println("跑步");
            } else if (weekday == 2) {
                System.out.println("游泳");
            } else if (weekday == 3) {
                System.out.println("慢走");
            } else if (weekday == 4) {
                System.out.println("动感单车");
            } else if (weekday == 5) {
                System.out.println("拳击");
            } else if (weekday == 6) {
                System.out.println("爬山");
            } else {
                System.out.println("好好吃一顿");
            }
        }
    }

    // 减肥计划switch分支练习
    public static void switchTest() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-7数字:");
            int weekday = sc.nextInt();
            switch (weekday) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                default:
                    System.out.println("您输入的数字有误，请重新输入！");
            }

        }
    }

    // 逢7过，for循环练习。(找出1-100之间的包含7或者是7的倍数的数字)
    public static void printSeven() {

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println(i);
            }
        }

    }

    // 斐波那契数列，for循环
    public static void printFib(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[num - 1]);
    }

    // 百钱百鸡，for循环嵌套 5x+3y+z/3=100,x+y+z=100
    public static void printXyz() {

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = (100 - x - y);
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("公鸡:" + x + "只 " + "母鸡:" + y + "只 " + "鸡雏:" + z + "只");
                }
            }
        }


    }

    // 数组求和 (个位，十位不等于7的偶数和)
    public static void printArraySum() {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7) {
                sum += arr[i];
            }
        }

        System.out.println("数组中个位，十位不等于7的偶数和为：" + sum);

    }

    // 数组比较
    public static void compareArray() {
        int[] arr1 = {11, 22, 33, 44};
        int[] arr2 = {11, 22, 33, 45};
        if (arr1.length != arr2.length) {
            System.out.println("false:长度不等");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("false:长度相等，但有值不等");
                    return;
                }
            }
            System.out.println("true:arr1和arr2相同");
        }


    }

    // 数组反转
    public static void arrayReversal() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // 评委打分
    public static void printScore() {
        int[] scoreArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scoreArray.length; i++) {
            int j = i + 1;
            System.out.println("请第" + j + "个评委打分");
            int score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("打分无效，请重新打分");
                score = sc.nextInt();
            }
            scoreArray[i] = score;

        }
        System.out.println("评委打分：" + Arrays.toString(scoreArray));

        int min = getMin(scoreArray); //最高分
        int max = getMax(scoreArray); //最低分
        int sum = getSum(scoreArray); //总分

        int avgscore = (sum - max- min)/(scoreArray.length-2); // 按照规则计算最后得分。
        System.out.println("选手最终得分是:" + avgscore);


    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
//        ifTest();
//        switchTest();
//        printSeven();
//        printFib(20);
//        printXyz();
//        printArraySum();
//        compareArray();
//        arrayReversal();
        printScore();
    }


}