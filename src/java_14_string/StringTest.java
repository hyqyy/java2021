package java_14_string;

import java.util.Scanner;

public class StringTest {

    // 字符串比较
    public static void compareString() {

        char[] ch = {'a', 'b', 'c'};
        String s1 = new String(ch);  // 利用构造方法定义字符串
        String s2 = new String(ch);
        String s3 = "abc";  // 直接赋值定义字符串，推荐方法
        String s4 = "abc";

        // ==比较地址
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("--------");

        // equals比较字符串的值
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }

    // 应用demo：用户登录
    public static void login() {
        String username = "huangyunqiang";
        String password = "Aa123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (2 - i > 0) {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会！");
                } else {
                    System.out.println("账户被锁定，请联系管理员");
                }
            }
        }
    }

    // 字符串遍历
    public static void printChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s1 = sc.nextLine();
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
    }

    // 统计字符串中大小写子母和数字的个数
    public static void countChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>='A'&&ch<='Z'){
                bigcount++;
            } else if(ch>='a'&&ch<='z'){
                smallcount++;
            }else if(ch>='0'&&ch<='9'){
                numbercount++;
            }
        }

        System.out.println("字符串"+ s+"中数字个数有:"+numbercount+"个");
        System.out.println("字符串"+ s+"中大写字母个数有:"+bigcount+"个");
        System.out.println("字符串"+ s+"中小写字母个数有:"+smallcount+"个");

    }

    //字符串反转
    public static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        String rs = "";
        for (int i = s.length()-1;i>=0;i--){
            rs = rs+s.charAt(i);
        }

        System.out.println(s+"经过反转后的结果是:" + rs);
    }

    public static void main(String[] args) {
//        compareString();
//        login();
//        printChar();
//        countChar();
        reverseString();
    }
}
