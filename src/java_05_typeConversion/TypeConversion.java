/*数据类型转换
* 1.自动转换，数据类型范围小的可以自动转换到大的*/
package java_05_typeConversion;
public class TypeConversion {
    static void autoConversion() {
        // byte-->short-->int-->long-->float-->double
        // char-->int-->long-->float-->double
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("编译通过说明可以自动转换:"+d);
    };

    static void forceConversion(){

        float f = 13.98f;
        int i = (int)f;  // 强制转换格式
        System.out.println("float类型13.98f到int类型强制转换结果："+i +"(有精度缺失)");


    }

    public static void main(String[] args) {

        autoConversion();
        forceConversion();

    }

}
