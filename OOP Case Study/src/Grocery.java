public class Grocery extends Product{
    private Date expiryDate;
    private int proteinValue;
    private int energyLevel;
    private int lipidsValue;

    public Grocery(int id, String name, int price, int quantity, int tax, ProductType productType, Date expiryDate, int proteinValue, int energyLevel, int lipidsValue) {
        super(id, name, price, quantity, tax, productType);
        this.expiryDate = expiryDate;
        this.proteinValue = proteinValue;
        this.energyLevel = energyLevel;
        this.lipidsValue = lipidsValue;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getProteinValue() {
        return proteinValue;
    }

    public void setProteinValue(int proteinValue) {
        this.proteinValue = proteinValue;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getLipidsValue() {
        return lipidsValue;
    }

    public void setLipidsValue(int lipidsValue) {
        this.lipidsValue = lipidsValue;
    }
    public String toString(){
        return String.format(super.toString() + "Expiry Date: %s, Protein: %d mg, Energy Value: %d kd/l,Lipids Value: %d kd/l", expiryDate,proteinValue,energyLevel,lipidsValue);
    }
}
