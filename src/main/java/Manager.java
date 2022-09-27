public class Manager extends Employee implements  Discountable{
    private final double discount = 0.25;


    public Manager(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public  double getDiscount(){
        return discount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice()* discount);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + discount +
                '}';
    }




    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice()-((clothing.getPrice())*discount);
    }
}
