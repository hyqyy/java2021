package java_19_package.demo2;

import java_19_package.demo1.Teacher;
import java_18_extends.demo1.Student;
public class DemoTest {

    public static void main(String[] args) {

        // 导包前使用
        /*java_19_package.demo1.Teacher t = new java_19_package.demo1.Teacher();
        t.teach();*/

        // 导包以后
        Teacher t = new Teacher();
        t.teach();

        Student st = new Student();
        st.study();
    }
}
