package OVERVIEW;

public class CARS {

    private String name;
    private String model;
    private String brand;

    public CARS(String name, String model, String brand) {
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public CARS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CARS{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


//    @Override
//    public void mileageCalculator(double distance, double fuel_consumed) {
//        System.out.printf("%.2f",distance/fuel_consumed);
//        System.out.println();
//    }




//    @Override
//    public void rpm(double distance, double rotation) {
//System.out.printf("%.2f",rotation/distance);
//        System.out.println();
//    }
}


