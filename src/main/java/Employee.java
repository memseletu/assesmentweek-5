public abstract class Employee extends Customer{
    private final double discount = 0.10;

    public Employee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }


    public double getDiscount(){
     return discount;

    }
    public abstract void printEmpPriceAfterDisc(Clothing clothing);


}
