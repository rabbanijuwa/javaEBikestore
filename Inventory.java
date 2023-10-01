import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * class that represents the store's inventory
 */
public class Inventory {
    private List<Product.EBike> availableEBikes;
    private List<Product.Accessory> availableAccessories;

    public Inventory() {
        availableEBikes = new ArrayList<>();
        availableAccessories = new ArrayList<>();
    }

    public void addEBike(Product.EBike eBike) {
        availableEBikes.add(eBike);
    }

    public void removeBike(Product.EBike eBike) {
        availableEBikes.remove(eBike);
    }
    public void addAccessory(Product.Accessory accessory) {
        availableAccessories.add(accessory);
    }
    public void removeAccessory(Product.Accessory accessory) {
        availableAccessories.remove(accessory);
    }


    /**
     * search for bikes by category
     */
    public List<Product.EBike> searchEBikesByCategory(EBikeCategory category) {
        List<Product.EBike> result = new ArrayList<>();
        for (Product.EBike eBike : availableEBikes) {
            if (eBike.getCategory() == category) {
                result.add(eBike);
            }
        }
        return result;

    }

    /**
     * Search for e-bikes by maximum speed
     * @param speed
     * @return result
     */
    public List<Product.EBike> searchEBikesByMaximumSpeed(int speed) {
        List<Product.EBike> result = new ArrayList<>();
        for (Product.EBike eBike : availableEBikes) {
            if (eBike.getMaximumSpeed() >= speed) {
                result.add(eBike);
            }
        }
        return result;
    }

    public List<Product.EBike> getAvailableEBikes() {
        return availableEBikes;

    }
    public List<Product.Accessory> getAvailableAccessories() {
        return availableAccessories;
    }

}
