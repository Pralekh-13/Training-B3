package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("hello");
        arrayList.add(12);
        arrayList.add(45.0);
        ArrayList<Employee> arrayList1=new ArrayList<>();
        //arrayList1.add();
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee(sc.nextInt(),sc.nextLine(),sc.next());
        Employee employee1=new Employee(11,"hkjhjk","ghjhg");
        arrayList1.add(employee);
        arrayList1.add(employee1);
//        arrayList1.add(employee);
//       arrayList1.remove(employee);
//        boolean b = arrayList1.removeAll(arrayList1);
        ArrayList<Employee> arrayList2=new ArrayList<>();

        arrayList2.add(employee1);
        boolean b = arrayList2.retainAll(arrayList1);
//        System.out.println(b);
        System.out.println(arrayList2);
        System.out.println(arrayList1);
        Collections.sort(arrayList1,new EmployeeById());
        System.out.println(arrayList1);
//        for(Employee e:arrayList1)
//        {
//            System.out.println(e);
//        }



    }
    public int sum(){
        return 19;
    }
}
