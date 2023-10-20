public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Smartphone phone = new Smartphone(1001, "Samsung Galaxy S21", 90000, 50, 500, ProductType.ELECTRONICS, 10, 30, "Android 13", 512, 25);
        inventory.addProduct(phone);

        Smartphone phone1 = new Smartphone(1002, "iPhone 13", 110000, 80, 200, ProductType.ELECTRONICS, 8, 25, "iOS 15", 256, 30);
        inventory.addProduct(phone1);

        System.out.println("Product Having ID 1001 is " + inventory.searchByID(1001));

        inventory.deleteProduct(phone);

        Laptop laptop = new Laptop(1003, "Dell XPS 15", 120000, 1440, 20000, ProductType.ELECTRONICS, 12, 60, ProcessorType.x64, 16, 2560, 1600);
        inventory.addProduct(laptop);

        inventory.updateProduct(3, ProcessorType.x64, 64, 2048, 1280, "MacBook Pro", 2000, 12, 70, 40);

        Product[] product = inventory.searchByCategory(ProductType.ELECTRONICS);
        System.out.println("Search By Category Results Are:");
        if (product[0] == null) {
            System.out.println("No Products Found.");
        } else {
            for (int i = 0; i < product.length; i++) {
                if (product[i] == null) break;
                System.out.println(product[i]);
            }
        }

        Product[] product1 = inventory.getLowStockProducts();
        System.out.println("Low In Stock Products Are:");
        if (product1[0] == null) {
            System.out.println("No Products Found.");
        } else {
            for (int i = 0; i < product1.length; i++) {
                if (product1[i] == null) break;
                System.out.println(product1[i]);
            }
        }

        inventory.setThisMonthSale(70);
        System.out.println("This Month's Sales Are:" + inventory.getSaleByMonth(1));
    }
}
