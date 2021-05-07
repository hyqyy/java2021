package java_08_processControl;

import java.util.Scanner;

public class BranchStatement {

    // if条件语句
    static void ifFunc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("程序开始...");
        System.out.println("请输入一个整数:");
        int score = sc.nextInt();
        if (score>=0 && score<=100){
            if (score >=90) {
                System.out.println(score+"分优秀" );
            }else if(score>=80){
                System.out.println(score+"分良好");
            }else if(score>=70){
                System.out.println(score+"分较好");
            }else if(score>=60){
                System.out.println(score+"分及格");
            }else {
                System.out.println(score+"分不及格");
            }
        }else {
            System.out.println("输入分数有误");
        }


        System.out.println("程序结束...");
    }

    // switch条件语句
    static void switchFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("程序开始...");
        System.out.println("请输入一个1-7的整数：");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("今天是星期一");
                break; // case如果没有break,后续case不做比较,直接继续向下执行，直到遇到break或者程序结束为止。 case穿透
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("输入数字有误");
                break; //可以省略
        }

        System.out.println("程序结束...");

    }

    public static void main(String[] args) {
//        ifFunc();
        switchFunc();
    }
}
