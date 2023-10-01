/**
 * Enumerates e-bike categories
 */
public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        //Creating ebikes
        Product.EBike EBike1 = new Product.EBike ("City E-Bike","A Comfortable city e-bike",1699.00,30,1,30.00,EBikeCategory.CITY);
        Product.EBike EBike2 = new Product.EBike ("Mountain E-Bike","A comfortable mountain e-bike",1699.00,20,2,35.00,EBikeCategory.MOUNTAIN);


        inventory.addEBike(EBike1);
        inventory.addEBike(EBike2);

        //Creating accessories
        Product.Accessory Accessory1 = new Product.Accessory("Bike Basket", "Detachable steel bicycle basket",24.99,15,3,AccessoryCategory.STORAGE, Size.MEDIUM,"Blue");
        Product.Accessory Accessory2 = new Product.Accessory("Bike Bag", "Triangle mesh bag with side pockets", 19.99,20,4, AccessoryCategory.STORAGE,Size.SMALL,"Black");

        inventory.addAccessory(Accessory1);
        inventory.addAccessory(Accessory2);



    }
}