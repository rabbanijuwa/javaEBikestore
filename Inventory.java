import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<Product.EBike> availableEBikes;

    public Inventory() {
        availableEBikes = new ArrayList<>();
    }

    public void addEBike(Product.EBike eBike) {
        availableEBikes.add(eBike);
    }

    public void removeBike(Product.EBike eBike) {
        availableEBikes.remove(eBike);
    }

    //search for bikes by category
    public List<Product.EBike> searchEBikesByCategory(EBikeCategory category) {
        List<Product.EBike> result = new ArrayList<>();
        for (Product.EBike eBike : availableEBikes) {
            if (eBike.getCategory() == category) {
                result.add(eBike);
            }
        }
        return result;

    }

    // Search for e-bikes by maximum speed
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
}
