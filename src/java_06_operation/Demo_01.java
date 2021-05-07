package java_06_operation;

public class Demo_01 {

    static void twoTiger(){
        int x = 10;
        int y = 20;
        boolean result = x==y?true:false;
        System.out.println("两只老虎的体重相同: "+ result);
    }

    static void threePerson(){
        int height1 = 165;
        int height2 = 190;
        int height3 = 172;

        int tempHeight = height1>height2 ? height1:height2;

        int maxHeight = tempHeight>height3 ? tempHeight:height3;

        System.out.println("三个人中身高最高的是:"+maxHeight);

    }


    public static void main(String[] args) {

        twoTiger();
        threePerson();

    }
}
