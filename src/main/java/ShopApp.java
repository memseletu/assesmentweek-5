import java.util.ArrayList;

public class ShopApp {
    public static double calcTotal(Clothing[] clothings){
        double total = 0;
        for(int i =0; i< clothings.length;i++){
            total = total+clothings[i].getPrice();
        }
      return total;
    }
    public static boolean isAFit(Customer customer, Clothing clothing){
        boolean isAfit= true;
    if(customer.getSize() == clothing.getSize())
        return isAfit;
        return isAfit;
    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothing){
       ArrayList<>
    }
    public static void printEmployeeName(Employee employee){

    }
    public static void printDiscAmtOff(Discountable[] discount, Clothing clothing){

    }
}
