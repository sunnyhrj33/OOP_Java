public class Product {
    public  static int idshold=0;
        private int id;
        private String name;
        private int price;
        private int quantity;
        private int tax;
        private ProductType productType;

    public Product(int id, String name, int price, int quantity, int tax, ProductType productType) {
        this.id = ++idshold;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.tax = tax;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
    @Override
    public String toString(){
        return String.format("ID: %d,Name: %s,Price: %d,Quantity: %d,Tax: %d,ProductType: %s",id,name,price,quantity,tax,productType);
    }
}
