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

    public static void main(String[] args) {
        compareString();
        login();
    }
}
