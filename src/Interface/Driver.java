package Interface;

public class Driver {
    public static void main(String[] args) {
        Student student=new Student(12,"fguyfghf");
        Student student1=new Student(11,"fytfrghf");
        student.display();
        System.out.println(student.showRollNo());
        System.out.println(student.compareTo(student1));
    }

    //Serializable,Clonable,Remote Interface-Marker Interface
    //Comparable interface-funtional interface
}
