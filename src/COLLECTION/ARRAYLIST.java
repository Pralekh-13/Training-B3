package COLLECTION;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("hello");
        arrayList.add(12);
        arrayList.add(45.0);
//        ArrayList<Employee> arrayList1=new ArrayList<>();
        //arrayList1.add();
//       Scanner sc=new Scanner(System.in);
//       Employee employee=new Employee(sc.nextInt(),sc.nextLine(),sc.next());
        Employee employee1=new Employee(11,"","");
//        arrayList1.add(employee);
//        arrayList1.add(employee1);
////        arrayList1.add(employee);
////       arrayList1.remove(employee);
////        boolean b = arrayList1.removeAll(arrayList1);
//        ArrayList<Employee> arrayList2=new ArrayList<>();
//
//        arrayList2.add(employee1);
//        boolean b = arrayList2.retainAll(arrayList1);
////        System.out.println(b);
//        System.out.println(arrayList2);
//        System.out.println(arrayList1);
//        Collections.sort(arrayList1,new EmployeeById());
//        System.out.println(arrayList1);
//        for(Employee e:arrayList1)
//        {
//            System.out.println(e);
//        }
        Employee employee2=new Employee(11,"","");
        Set<Employee> employees=new HashSet<>();
//        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
//        employees.add(employee1);
        System.out.println(employees);
        Set<String> set=new HashSet<>();
        set.add("");
//        set.add("");
        set.add("joker");
        System.out.println(set);




    }

}
