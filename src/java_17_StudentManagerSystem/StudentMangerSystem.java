package java_17_StudentManagerSystem;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentMangerSystem {



    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            printFace();
            System.out.println("请输入【1-5】选项");
            String line = sc.nextLine();
            switch (line){
                case "1":
                    String s = addStudet(array,sc);
                    System.out.println("添加学生:"+s);
                    break;
                case "2":
                    String s1 = updateStudet(array,sc);
                    System.out.println("修改学生:"+s1);
                    break;
                case "3":
                    String s2 = deleteStudet(array,sc);
                    System.out.println("删除学生:"+s2);
                    break;
                case "4":
                    queryStudet(array);
                    break;
                case "5":
                    System.out.println("欢迎再次使用！");
                    System.exit(0);
                default:
                    System.out.println("输入指令有误！");
            }
        }
    }

    // 程序主界面
    public static void printFace(){

        System.out.println("-------欢迎使用学生管理系统--------");
        System.out.println("【1】 添加学生");
        System.out.println("【2】 修改学生");
        System.out.println("【3】 删除学生");
        System.out.println("【4】 查看所有学生");
        System.out.println("【5】 退出");
        System.out.println("-------------------------------");

    }

    // 添加学生信息
    public static String addStudet(ArrayList<Student> array,Scanner sc){
        Student s = new Student();
        System.out.println("请输入学号:");
        String Sid = sc.nextLine();
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入住址:");
        String address = sc.nextLine();

        s.Sid = Sid;
        s.name = name;
        s.age = age;
        s.address = address;
        for(int i=0;i<array.size();i++){
            Student st = array.get(i);
            if (st.getName().equals(name) || st.getSid().equals(Sid)){
                return "该学生已添加，请核对信息！";
            }
        }
        array.add(s);
        return "success";

    }
    // 修改学生信息
    public static String updateStudet(ArrayList<Student> array,Scanner sc){
        if(array.size()>0){
            System.out.println("请输入修改学生姓名:");
            String name = sc.nextLine();
            for(int i=0;i<array.size();i++){
                Student s = array.get(i);
                if (s.getName().equals(name)){
                    System.out.println("请输入修改年龄：");
                    String age = sc.nextLine();
                    s.setAge(age);
                    return "success";
                }
            }

            return "修改学生不存在，请核对信息！";
        }else {
            return "学生表中还未添加学生，请核对!";
        }

    }

    // 删除学生信息
    public static String deleteStudet(ArrayList<Student> array,Scanner sc){
        if(array.size()>0){
            System.out.println("请输入删除学生的姓名:");
            String name = sc.nextLine();
            for(int i=0;i<array.size();i++){
                Student s = array.get(i);
                if (s.getName().equals(name)){
                    array.remove(i);
                    return "success";
                }
            }
            return "删除学生不存在，请核对信息";
        }else {
            return "学生表中还未添加学生，请核对!";
        }

    }

    // 查询所有学生信息
    public static void queryStudet(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无信息，请先添加再查询");
        }else if(array.size()>0){
            System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t住址");
            for (int i=0;i<array.size();i++){
                Student s = array.get(i);
                System.out.println(s.getSid()+"\t"+s.getName()+"\t\t"+s.getAge()+"岁\t\t"+s.getAddress());
            }
        }
    }
}
