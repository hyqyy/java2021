package java_08_processControl;

import java.util.ConcurrentModificationException;

public class BreakAndContinue {

    // break终止跳出循环
    static void breakTest(){
        int count = 0;
        for(int i=1;i<=10;i++){
            if(i%4==0){
                break; // i是4的倍数时，终止循环
            }
            count++;
            System.out.println(i);
        }
        System.out.println("循环了"+count+"次");
    }

    // continue跳过当前循环，继续下一次
    static void continueTest(){
        int count = 0;
        for(int i=1;i<=10;i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
            count++;
        }
        System.out.println("循环了"+count+"次");
    }


    public static void main(String[] args) {
        breakTest();
        continueTest();
    }

}
