package Inheritence;

public class Main1 {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Address address=(Employee)employee;
//        Address address=new Address();
//        Employee employee=(Address)address ;
//        address.showAddress();

            Address address1=new Employee();
            address1.showAddress();
Employee employee1=new Employee();
employee.showAddress();

    }
}
