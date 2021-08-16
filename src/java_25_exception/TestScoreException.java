package java_25_exception;

import java.util.Scanner;

public class TestScoreException {

    public static void method() throws ScoreException {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 100 || i < 0) {
            Throwable th = new Throwable("录入错误");
            throw new ScoreException("分数应该介于0-100之间", th); // 抛出自定义异常
        } else {
            System.out.println("分数正常");
        }

    }


    public static void main(String[] args) throws ScoreException {

        try {
            method();
        } catch (Exception e){
            System.out.println(e);
        }

    }


}
