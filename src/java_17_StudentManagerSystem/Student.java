package java_17_StudentManagerSystem;

public class Student {
    String Sid;
    String name;
    String age;
    String address;


    public void setSid(String sid) {
        Sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSid() {
        return Sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    
}
