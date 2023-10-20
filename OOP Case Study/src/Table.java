public class Table extends Furniture{
    private String shape;

    public Table(int id, String name, int price, int quantity, int tax, ProductType productType, String material, int length, int width, String shape) {
        super(id, name, price, quantity, tax, productType, material, length, width);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Shape: %d KG ", shape);
    }
}
