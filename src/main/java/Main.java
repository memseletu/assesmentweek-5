public class Main {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("blue", 50.00, (char) 32);
        Clothing clothing2 = new Clothing("yellow", 100.00, (char) 5);
        Clothing clothing3 = new Clothing("green", 59.99, (char) 12);
        Clothing[] managerCart = {clothing1, clothing2, clothing3};
        Manager manager = new Manager("mike", (char) 18, managerCart);
        Clothing[] employeeCart = {clothing1, clothing2, clothing3};
        Employee employee = new HourlyEmployee("mem", (char) 2, employeeCart);
        Clothing[] customercart = {clothing1, clothing2, clothing3};
        Customer customer1 = new Customer("Traore", (char) 32, customercart);
        System.out.println(ShopApp.calcTotal(managerCart));
        for (int x = 0; x < customercart.length; x++) {
            System.out.println(ShopApp.isAFit(customer1, customercart[x] ));

        }
        employee.printEmpPriceAfterDisc(clothing1);
        employee.printEmpPriceAfterDisc(clothing2);
        manager.printEmpPriceAfterDisc(clothing1);
        manager.printEmpPriceAfterDisc(clothing2);
        for (Clothing clothing : employeeCart) {
            System.out.println(clothing.getDescription());
        }
        ShopApp.printEmployeeName(employee);
        ShopApp.printEmployeeName(manager);
        }

    }
