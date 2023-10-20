public class Smartphone extends Electronics{
    private String operatingSystem;
    private int storageCapacity;
    private int cameraResolution;


    public Smartphone(int id, String name, int price, int quantity, int tax, ProductType productType, int powerConsumption, int warranty, String operatingSystem, int storageCapacity, int cameraResolution) {
        super(id, name, price, quantity, tax, productType, powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"OS: %s,Storage: %d GB,Camera Res: %d MP",operatingSystem,storageCapacity,cameraResolution
        );
    }

}
