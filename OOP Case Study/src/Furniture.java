public class Furniture extends Product{
    private String material;
    private int length;
    private int width;

    public Furniture(int id, String name, int price, int quantity, int tax, ProductType productType, String material, int length, int width) {
        super(id, name, price, quantity, tax, productType);
        this.material = material;
        this.length = length;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Material Type: %s,Length: %d m,Width: %d m, ",material,length,width);
    }
}
