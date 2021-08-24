package java_26_shujujiegou.treeSet;

public class Teachers {

    private String name;
    private int age;

    public Teachers() {
    }

    public Teachers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
