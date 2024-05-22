public class FunctionOverloading {
    public  void area(int length,int breadth) {
        System.out.println(length * breadth);
    }
    public void area(int length){
        System.out.println(length*length);
    }
    public void area(double radius){
        System.out.printf("%.2f",radius*radius*Math.PI);
        System.out.println();
    }
    public static void area(int length,int breadth,int hypotenuse){
        System.out.println(0.5*(hypotenuse+length+breadth));
    }


}
