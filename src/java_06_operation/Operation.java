package java_06_operation;

import java.sql.SQLOutput;

public class Operation {

    // 算术运算符
    static void fun1() {
        int a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 除法得到的是商，要得到小数必须有小数参与
        System.out.println(a % b);  // %获得余数
    }

    // 字符的 “+” 操作
    static void fun2() {

        char a = 'A';
        char b = 'B';
        int i = 10;

//        char ch = a + i;    多种数据类型参与计算，结果自动提升到最高等级，也就需要最高等级的数据接收。
        int j = a + i;
        System.out.println(a + b);
        System.out.println(a + i);
        System.out.println(j);

    }

    // 字符串的 “+” 操作
    static void fun3() {
        // 从左到右,+两边有字符串就拼接为字符串，没有就算术运算，然后继续向右

        String a = "h";
        String b = "x";
        int i = 222;
        int j = 333;

        System.out.println(a + b + i + j);
        System.out.println(i + j + a + b); //先运算，再拼接
    }

    // 赋值运算符
    static void fun4() {
        int i = 10;
        System.out.println("i=" + i);

        // +=
        i += 20;
        System.out.println("i=" + i);
    }

    // 自增自减运算符
    static void fun5() {
        int i = 10;
        System.out.println("i=" + i);
        //单独使用，效果一样
        i++;
        ++i;
        System.out.println("i=" + i);

        // 参与赋值
//        int j=++i; // 先自增再赋值
        int j = i++; // 先赋值再自增
        System.out.println("i=" + i);
        System.out.println("j=" + j);

    }

    // 关系运算符
    static void fun6() {
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("===============");
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("===============");
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println("===============");
        System.out.println(a <= b);
        System.out.println(a <= c);
        System.out.println("===============");
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("===============");
        System.out.println(a < b);
        System.out.println(a < c);


    }

    // 逻辑运算符
    static void fun7() {

        int i = 10;
        int j = 20;
        int k = 30;
        // & 逻辑与 有false则false
        System.out.println(j > i & k > j);
        System.out.println(j > i & k < j);
        System.out.println("===============");

        // | 逻辑或 有true则true
        System.out.println(j > i | k > j);
        System.out.println(j < i | k > j);
        System.out.println("===============");

        // ^ 逻辑异或  相同false,不同true
        System.out.println(j > i ^ k > j);
        System.out.println(j < i ^ k > j);
        System.out.println("===============");

        // ！ 逻辑非 布尔值取反
        System.out.println(!(j > i));
        System.out.println(!(i > j));
        System.out.println("===============");

    }

    // 短路逻辑运算符
    static void fun8() {
        int i = 10;
        int j = 20;
        int k = 30;
        // && 短路与,有false则flase,如果左边为假，右边不继续执行

        System.out.println(j > i && k > j);
        System.out.println(j > i && k < j);
        System.out.println("---------------");
        System.out.println(i++ > 100 && k++ > 100);
        System.out.println("自增i=" + i);
        System.out.println("k的值不会自增运算k=" + k); // k的值不会自增运算

        System.out.println("===============");


        // || 短路或 如果左边为真，右边不继续执行
        System.out.println(j > i || k > j);
        System.out.println(j < i || k > j);
        System.out.println("---------------");
        System.out.println(i++ > 10 || k++ > 10);
        System.out.println("自增i=" + i);
        System.out.println("k的值不会自增运算k=" + k); // k的值不会自增运算

    }

    // 三元运算符
    static void fun9() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("max="+max);
    }

    public static void main(String[] args) {
//        fun1();
//        fun2();
//        fun3();
//        fun4();
//        fun5();
//        fun6();
//        fun7();
//        fun8();
        fun9();
    }
}
