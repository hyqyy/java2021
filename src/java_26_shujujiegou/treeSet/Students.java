package java_26_shujujiegou.treeSet;


public class Students implements Comparable<Students>{
    private String name;
    private int math;
    private int english;
    private int total;

    public Students() {
    }

    public Students(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }


    public int sum(){
        int total = this.english + this.math;
        return total;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", total=" + sum() +
                '}';
    }

    @Override
    public int compareTo(Students s) {
//        int num = this.sum()-s.sum(); // 按总分降序
        int num = s.sum()-this.sum(); // 按总分升序
        int num1=num==0?s.english-this.english:num; // 总分一样按照英语从大到小排序
        int num2=num1==0?s.math-this.math:num1; // 英语也一样按照数学从大到小排序
        return num2==0?s.name.compareTo(this.name):num2;
    }
}
