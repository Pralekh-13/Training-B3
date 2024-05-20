package COLLECTION;

import java.util.*;

public class Mapss {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
//        HashMap<String ,Integer> map1=new HashMap<>();

        map.put("Hari",35);
        map.put("sumit",22);
//        map.put("sumit",23);
        map.put(null,null);
//        map.remove("sumit",22);
        map.put("",2);
//        map.put("",4);
        System.out.println(map);
        map.remove("sumit");

        Map<String,Integer>map1=new HashMap<>();
        map1.putAll(map);

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.containsKey(""));
        System.out.println(map1.containsValue(22));
        map1.putIfAbsent("sumit",22);
        System.out.println("map1 "+ map1);
        System.out.println(map1.entrySet());

        Map<String,String> map2=new TreeMap<>();
        map2.put("hhh","2");
        map2.put("",null);
        map2.put("hjkhj","");
        map2.put("fff",null);
        System.out.println(map2);
        map2.put("hhh","2");


//        List<Employee> list=new ArrayList<>();
//        Map<String,List<Employee>> map3=new HashMap<>();
//        Employee employee=
//                new Employee(1,"jghjg","fghf");
//        Employee employee1=
//                new Employee(2,"fghgf","tuytuy");
//        list.add(employee);
//        list.add(employee1);
//        map3.put("Tech",list);
//        System.out.println(map3);
    }
}
