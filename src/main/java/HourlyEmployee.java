public class HourlyEmployee extends Employee implements Discountable{

public final double discount = 0.10;
    public HourlyEmployee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getDiscount(){
        return 0;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice()* discount );
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice()-((clothing.getPrice())*discount);
    }
    public String toString(){
        return "";
    }
}
