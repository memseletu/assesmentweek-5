public class Main {
    public static void main(String[] args) {

       Clothing clothing1 = new Clothing();
       Clothing clothing2 = new Clothing();
       Clothing clothing3 = new Clothing();
       Clothing[] managerCart = {clothing1, clothing2,clothing3};
       Manager manager = new Manager("mike", (char) 18, managerCart);
       Clothing[] employeeCart ={clothing1,clothing2,clothing3};
       HourlyEmployee employee = new HourlyEmployee("mem",(char)2, employeeCart);

    }
}
