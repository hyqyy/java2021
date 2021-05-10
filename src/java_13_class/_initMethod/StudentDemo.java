package java_13_class._initMethod;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.show();

        System.out.println("---------------------");

        Student st1 = new Student("huangyunqiang",31);
        st1.show();
    }
}
