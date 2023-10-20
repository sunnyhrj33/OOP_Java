public class Seating extends Furniture{
    private int loadCap;

    public Seating(int id, String name, int price, int quantity, int tax, ProductType productType, String material, int length, int width, int loadcap) {
        super(id, name, price, quantity, tax, productType, material, length, width);
        this.loadCap = loadcap;
    }

    public int getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(int loadCap) {
        this.loadCap = loadCap;
    }
    public String toString(){
        return String.format(super.toString() + "Load Capacity: %d KG ", loadCap);
    }
}
