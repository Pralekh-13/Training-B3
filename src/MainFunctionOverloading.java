public class MainFunctionOverloading {
    public static void main(String[] args) {
        FunctionOverloading functionOverloading=new FunctionOverloading();
                functionOverloading.area(10,15);
                functionOverloading.area(10);
                functionOverloading.area(10.00);
                FunctionOverloading.area(10,10,10); //Static function calling
    }
}
