package MultilevelInheritence;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello today is a great day");
        String s= "Hello";
//        String s1=new String("Hello");
//        System.out.println(s==s1);
        System.out.println(s.equals(sb));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());

       String s2[]=s.split(" ");
        System.out.println(Arrays.toString(s2));

    }
}
