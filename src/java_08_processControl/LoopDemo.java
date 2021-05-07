package java_08_processControl;

public class LoopDemo {

    // for循环：求1-100之间偶数和
    static void loopForSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1-100之间的偶数和是：" + sum);
    }

    // while循环：求1-100之间偶数和
    static void loopWhileSum(){
        int sum=0;
        int i=1;
        while (i<=100){
            if(i%2==0){
                sum +=i;
            }
            i++;
        }

        System.out.println("1-100之间的偶数和是：" + sum);
    }

    // for循环：求100-999之间的水仙花数并输出 (各个位上的数字立方和是它本身)
    static void loopForFind() {
        int sum =0;
        for (int i = 100; i <= 999; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i + "是水仙花数");
                sum++;

            }
        }

        System.out.println("100-999之间的水仙花数个数是" + sum);
    }


    // while循环：求100-999之间的水仙花数并输出 (各个位上的数字立方和是它本身)
    static void loopWhileFind(){
        int sum=0;
        int i=100;
        while (i<=999){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i + "是水仙花数");
                sum++;}
            i++;
        }
        System.out.println("100-999之间的水仙花数个数是" + sum);
    }

    // 循环嵌套
    static void doubleLoop(){
        for(int hour=0;hour<=23;hour++){
            for(int minute=0;minute<60;minute++){
                System.out.println(hour+"时"+minute+"秒");
            }
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {
//        loopForSum();
//        loopWhileSum();
//
//        System.out.println("===============");
//
//        loopForFind();
//        loopWhileFind();

        doubleLoop();



    }
}
