public class Inventory {
    Product[] products;
    int indexcount=0;
    int [] monthlySales;
    int saleIndex=0;

    public Inventory(){
        products = new Product[300];
        monthlySales = new int[300];

    }
    public void addProduct(Product product1){
        products[indexcount++] = product1;

    }
    public void deleteProduct(Product product1){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==product1.getId()){
                for(int j=i;j<indexcount;j++){
                    products[j] = products[j+1];
                    products[j+1] = null;
                }
                indexcount--;
                break;
            }
        }
    }
    public void updateProduct(int id,String name ,int storageCap, int powerConsumption,String operatingSystem,int price,int quantity,int tax,int warranty){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                Smartphone product = (Smartphone) products[i];
                product.setId(id);
                product.setName(name);
                product.setOperatingSystem(operatingSystem);
                product.setPowerConsumption(powerConsumption);
                product.setWarranty(warranty);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setStorageCapacity(storageCap);
                product.setTax(tax);
                break;
            }
        }
    }

    public void updateProduct(int id,ProcessorType processorType, int ramSize, int width,int height,String name,int price,int quantity,int tax,int warranty){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                Laptop product = (Laptop) products[i];
                product.setId(id);
                product.setName(name);
                product.setWarranty(warranty);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setTax(tax);
                product.setProcessor(processorType);
                product.setRamSize(ramSize);
                product.setWidth(width);
                product.setHeight(height);
                break;
            }
        }
    }

    public void updateProduct(int id,int volume, boolean bluetooth,int h1,String name,int price,int quantity,int tax,int warranty){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                AudioDevices product = (AudioDevices) products[i];
                product.setId(id);
                product.setName(name);
                product.setWarranty(warranty);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setTax(tax);
                product.setBluetooth(bluetooth);
                product.setVolume(volume);
                break;
            }
        }
    }

    public void updateProduct(int id, int loadCap,String name, int price, int quantity, int tax, String material, int width, int length){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                Seating product = (Seating) products[i];
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setTax(tax);
                product.setLength(length);
                product.setWidth(width);
                product.setLoadCap(loadCap);
                product.setMaterial(material);
                break;
            }
        }
    }

    public void updateProduct(int id,String shape,String name, int price, int quantity, int tax, String material, int width, int length){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                Table product = (Table) products[i];
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setTax(tax);
                product.setLength(length);
                product.setWidth(width);
                product.setMaterial(material);
                product.setShape(shape);
                break;
            }
        }
    }


    public void updateProduct(int id,String name,int price,int quantity,int tax,Date date,int proteinValue,int energyLevel, int lipidsValue){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                Grocery product = (Grocery) products[i];
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setTax(tax);
                product.setExpiryDate(date);
                product.setEnergyLevel(energyLevel);
                product.setProteinValue(proteinValue);
                product.setLipidsValue(lipidsValue);
                break;
            }
        }
    }
    public Product[] getLowStockProducts(){
        Product[] tempProducts = new Product[100];
        int tempIndex = 0;
        for(int i=0;i<indexcount;i++){
            if(products[i].getQuantity()<=5){
                tempProducts[tempIndex++] = products[i];
            }
        }
        return tempProducts;
    }

    public void setThisMonthSale(int sale){
        monthlySales[saleIndex++] = sale;
    }

    public int getSaleByMonth(int month){
        return monthlySales[month-1];
    }
    public Product searchByID(int id){
        for(int i=0;i<indexcount;i++){
            if(products[i].getId()==id){
                return products[i];
            }
        }
        return null;
    }
    public Product searchByName(String name){
        for(int i=0;i<indexcount;i++){
            if(products[i].getName()==name){
                return products[i];
            }
        }
        return null;
    }
    public Product[] searchByCategory(ProductType p){
        Product[] tempProducts = new Product[100];
        int tempIndex = 0;
        for(int i=0;i<indexcount;i++){
            if(products[i].getProductType()==p){
                tempProducts[tempIndex++] = products[i];
            }
        }
        return tempProducts;}}





