package java_13_class._private;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "huangyunqiang";
//        st.age = 31;
//        st.age = -31;
        st.setAge(-31); // 方法中可以设置赋值条件，避免无效数据设置
        st.setAge(31);
        st.show();
        System.out.println("访问私有属性" + st.getAge());

    }
}
