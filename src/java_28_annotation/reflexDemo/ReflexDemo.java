package java_28_annotation.reflexDemo;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflexDemo {

    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        show(); /**如果不同时期需要使用show方法中不同的功能模块，就必须来回修改方法*/
        newshow(); /**无需修改代码逻辑,仅仅修改配置文件class.txt即可实现*/

    }



    public static void show(){

        /**功能模块 1*/
        //        Student s = new Student();
//        String res1 = s.study("学生");
//        System.out.println(res1);

        /**功能模块 2*/
        Teacher t = new Teacher();
        String res2 = t.teach("老师");
        System.out.println(res2);
    }


    // 通过反射改造show方法
    public static void newshow() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties prop = new Properties();
        FileReader file = new FileReader("C:\\Users\\HUANGYQ\\Desktop\\java2021\\src\\java_28_annotation\\reflexDemo\\class.txt");
        prop.load(file);
        file.close();

        String className = prop.getProperty("className");
        System.out.println("className"+ className);
        String methodName = prop.getProperty("methodName");
        String methodParms = prop.getProperty("methodParams");


        Class<?> Cls = Class.forName(className);
        Constructor<?> con = Cls.getConstructor();

        Object obj = con.newInstance();

        Method method = Cls.getMethod(methodName, String.class);
        Object res = method.invoke(obj,methodParms);
        System.out.println(res);


    }
}
