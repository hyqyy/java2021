package java_28_annotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestReflex {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
//        getCls();
//        getConstruct();
//        getField();
        getMethod();

    }


    // 反射：不同方式获取Class对象
    public static void getCls() throws ClassNotFoundException {

        // 方式1
        Class<?> c1 = Class.forName("java_28_annotation.Students");
        System.out.println(c1);

        // 方式2
        Students students = new Students();
        Class<? extends Students> c2 = students.getClass();
        System.out.println(c2);

        // 方式3
        Class<Students> c3 = Students.class;
        System.out.println(c3);


    }

    // 反射：获取构造方法并使用
    public static void getConstruct() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Students> Cls = Students.class;

        // 获取所有public构造方法
        System.out.println("----获取所有public构造方法----");
        Constructor<?>[] publicCons = Cls.getConstructors();
        for(Constructor<?> con :publicCons){
            System.out.println(con);
        }

        System.out.println("----获取所有构造方法----");
        Constructor<?>[] allCons = Cls.getDeclaredConstructors();
        for(Constructor<?> con :allCons){
            System.out.println(con);
        }

        System.out.println("----获取指定public构造方法,依据构造方法参数指定----");
        Constructor<Students> oneofpublicCons = Cls.getConstructor(String.class,int.class,String.class);
        System.out.println(oneofpublicCons);

        System.out.println("----获取指定构造方法,依据构造方法参数指定----");
        Constructor<Students>  oneofallCons= Cls.getDeclaredConstructor(String.class);
        System.out.println(oneofallCons);


        System.out.println("----根据构造方法对象,实例化类对象----");
        Students st1 = oneofpublicCons.newInstance("黄运强", 31, "河南");

        oneofallCons.setAccessible(true); /**设置私有属性可被外调用*/
        Students st2 = oneofallCons.newInstance("黄运强");

        System.out.println("public构造方法实例化的对象"+ st1);
        System.out.println("private私有构造方法实例化的对象" + st2);



    }

    // 反射：获取成员变量并使用

    public static void getField() throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<Students> Cls = Students.class;

        System.out.println("----获取所有public成员变量----");
        Field[] pubFields = Cls.getFields();
        for (Field field : pubFields){
            System.out.println(field);
        }

        System.out.println("----获取所有成员变量----");
        Field[] allFields = Cls.getDeclaredFields();
        for (Field field : allFields){
            System.out.println(field);
        }


        System.out.println("----获取指定的public成员变量,并使用----");
        Field addressField = Cls.getField("address");


        Constructor<?> con = Cls.getConstructor();
        Object obj = con.newInstance();

        addressField.set(obj,"河南信阳"); // 给对象obj的addressField字段赋值“河南信阳”
        System.out.println(obj);



        System.out.println("----获取指定的成员变量,并使用----");
        Field ageField = Cls.getDeclaredField("age");
        ageField.set(obj,31);

        Field nameField = Cls.getDeclaredField("name");
        nameField.setAccessible(true); /**设置私有属性可被外调用*/
        nameField.set(obj,"黄运强");

        System.out.println(obj);


    }

    // 反射：获取成员方法并使用
    public static void getMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Students> Cls = Students.class;

        System.out.println("----获取所有public成员方法，包含继承public----");
        Method[] publicMethods = Cls.getMethods();
        for(Method method : publicMethods){
            System.out.println(method);
        }


        System.out.println("----获取所有成员方法----");
        Method[] allMethods = Cls.getDeclaredMethods();
        for(Method method : allMethods){
            System.out.println(method);
        }


        System.out.println("----获取指定的public成员方法----");
        Method oneofpublicMethods = Cls.getMethod("method2",String.class); //指定方法名和方法参数类型对象
        System.out.println(oneofpublicMethods);

        // 使用
        Constructor<Students> con = Cls.getConstructor();
        Object obj = con.newInstance();
        oneofpublicMethods.invoke(obj,"有参数");


        Method m = Cls.getMethod("method3",String.class,int.class); //指定方法名和方法参数类型对象
        Object o = m.invoke(obj,"huangyunqiang",31); /**接收返回值*/
        System.out.println(o);


        System.out.println("----获取指定的成员方法----");
        Method oneofallMethods = Cls.getDeclaredMethod("function"); //指定方法名和方法参数类型对象
        System.out.println(oneofallMethods);

        // 使用
        oneofallMethods.setAccessible(true);
        oneofallMethods.invoke(obj);




    }

}

