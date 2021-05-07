package java_09_random;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    static void randomtest(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(101);

        while (true) {
            System.out.println("请猜一个数字：");
            int guess_num = sc.nextInt();
            if (guess_num == num) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (guess_num > num) {
                System.out.println("很遗憾，猜大了");
            } else {
                System.out.println("很遗憾，猜小了");

            }
        }
    }

    public static void main(String[] args) {

        randomtest();

    }
}
