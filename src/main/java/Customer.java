import java.util.Arrays;

public class Customer extends Person{

    private char size;
    private Clothing[] clothingItems;

    public Customer(String name, char size, Clothing[] clothingItems) {
        super(name);
        this.size = size;
        this.clothingItems = clothingItems;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                '}';
    }
}
