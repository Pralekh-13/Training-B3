package OVERVIEW;

import java.util.Scanner;

public class DOUBTS {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CARS c=new CARS();
        c.setName("nexon");
    c.setModel("zx+");
    c.setBrand("Tata");
        System.out.println(
                c.getName()+" "+c.getBrand()+" "+c.getModel());
//        CARS cars=new CARS(scanner.nextLine(),
//                scanner.nextLine(),scanner.nextLine());
//        System.out.println(cars.toString());
        System.out.println(c.toString());
//        c.mileageCalculator(250,12);
//        c.rpm(250,800);
        CarsFunctions carsFunctions=(double distance,double fuelConsumed)->{
            System.out.printf("%.2f",distance/fuelConsumed);
            System.out.println();
        };
        carsFunctions.mileageCalculator(300,5);
        int a=5;
        String s="$2000";
        String s1=s.substring(0);
        int b=Integer.parseInt(s);
    }

}
