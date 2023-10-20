public class Electronics extends Product{
    private int powerConsumption;
    private int warranty;

    public Electronics(int id, String name, int price, int quantity, int tax, ProductType productType, int powerConsumption, int warranty) {
        super(id, name, price, quantity, tax, productType);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    public String toString(){
        return String.format(super.toString()+"Power Consumption: %d W,Warranty: %d Months",powerConsumption,warranty);
    }
}
