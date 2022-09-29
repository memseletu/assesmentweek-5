import java.util.ArrayList;
import java.util.Comparator;

public class ShopApp {
    public static double calcTotal(Clothing[] clothings){
        double total = 0;
        for(int i =0; i< clothings.length;i++){
            total = total+clothings[i].getPrice();
        }
      return total;
    }
    public static boolean isAFit(Customer customer, Clothing clothing){
        boolean isAfit= false;
    if(customer.getSize() == clothing.getSize()){
        isAfit = true;
    }
        return isAfit;

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothing){
//      ArrayList<String>clothingss = new ArrayList<>();
//      for(int i= 0; i<clothingss.length)
    }
    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());

    }
    public static void printDiscAmtOff(Employee[] employees, Clothing clothing){
          double amtOff =0;
          for (int  x =0; x< employees.length; x++) {
              System.out.println(clothing.getPrice() - (clothing.getPrice() * employees[x].getDiscount()));
          }

    }
}
