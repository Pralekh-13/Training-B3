package Interface;

import java.io.Serializable;

public class Student implements Trial,
        Serializable,Comparable<Student>{
    private int rollNo;
    private String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public int showRollNo() {
        return rollNo;
    }

    @Override
    public int compareTo(Student student) {
    if(rollNo==student.rollNo){
    return 1;
    }
    return 0;
    }
}
