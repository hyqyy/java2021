package java_13_class._baseClass;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student(); //对象
        st.show();

        st.setName("huangyunqiang");
        st.setAge(31);
        st.show();


        System.out.println("---------------------");
        Student st1 = new Student("huangyunqiang",31); //对象1
        st1.show();

        st1.setName("hyq");
        st1.setAge(32);
        st1.show();
    }
}
