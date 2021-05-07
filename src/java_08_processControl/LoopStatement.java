package java_08_processControl;

public class LoopStatement {

    // for循环语句
    static void loopFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("第"+i+"次输出：hello world");
        }
    }

    // while循环语句
    static void loopWhile(){
        int i=1;
        while (i<=5){
            System.out.println("第"+i+"次输出：hello world");
            i++;
        }
    }

    public static void main(String[] args) {
        loopFor();
        System.out.println("==============");
        loopWhile();

    }
}
