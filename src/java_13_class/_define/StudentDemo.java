package java_13_class._define;

public class StudentDemo {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name +","+st.age);
        st.name = "john";
        st.age = 10;
        System.out.println(st.name +","+st.age);
        st.study();
        String result = st.doHomework("放学要");
        System.out.println(result);

    }
}
