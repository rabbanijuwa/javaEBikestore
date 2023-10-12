package ist242.team3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/**
 * Enumerates e-bike categories
 */
public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        //Creating ebikes
        Product.EBike EBike1 = new Product.EBike ("City E-Bike","A Comfortable city e-bike",1699.00,30,1,30.00, EBikeCategory.CITY);
        Product.EBike EBike2 = new Product.EBike ("Mountain E-Bike","A comfortable mountain e-bike",1699.00,20,2,35.00, EBikeCategory.MOUNTAIN);


        inventory.addEBike(EBike1);
        inventory.addEBike(EBike2);

        //Creating accessories
        Product.Accessory Accessory1 = new Product.Accessory("Bike Basket", "Detachable steel bicycle basket",24.99,15,3, AccessoryCategory.STORAGE, Size.MEDIUM,"Blue");
        Product.Accessory Accessory2 = new Product.Accessory("Bike Bag", "Triangle mesh bag with side pockets", 19.99,20,4, AccessoryCategory.STORAGE, Size.SMALL,"Black");

        inventory.addAccessory(Accessory1);
        inventory.addAccessory(Accessory2);

        // Display available products
        List<Product.EBike> availableEBikes = inventory.getAvailableEBikes();
        List<Product.Accessory> availableAccessories = inventory.getAvailableAccessories();

        System.out.println("Available E-Bikes:");
        for (Product.EBike eBike : availableEBikes) {
            System.out.println(eBike.getId() + ": " + eBike.getProductName() + " - $" + eBike.getPrice());
        }

        System.out.println("Available Accessories:");
        for (Product.Accessory accessory : availableAccessories) {
            System.out.println(accessory.getId() + ": " + accessory.getProductName() + " - $" + accessory.getPrice());
        }

        // Prompt the user to enter their information
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAre you a new customer or a returning customer? (Enter 'new' or 'returning'): ");
        String customerType = scanner.nextLine();

        Product.Customer customer = null;

        if (customerType.equalsIgnoreCase("new")) {
            System.out.println("You are a new customer.");
            System.out.println("Please enter your information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("\nThank you for providing your information, " + name + "!");
            // You can create a new NewCustomer object with this information if needed.
        } else if (customerType.equalsIgnoreCase("returning")) {
            System.out.println("You are a returning customer.");
            System.out.println("Please enter your loyalty points: ");
            int loyaltyPoints = scanner.nextInt();

            System.out.println("\nWelcome back! You have " + loyaltyPoints + " loyalty points.");
            // You can create a new ReturningCustomer object with this information if needed.
        } else {
            System.out.println("Invalid input. Please enter 'new' or 'returning'.");
        }

        //Prompt user to select the products they want to purchase
        List<Product> selectedProducts = new ArrayList<>();
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.println("\nSelect a product by entering its ID or type 'done' to finish shopping: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("done")) {
                continueShopping = false;
            } else {
                try {
                    int productId = Integer.parseInt(input);
                    Product selectedProduct = findProductById(productId, availableEBikes, availableAccessories);
                    if (selectedProduct != null) {
                        selectedProducts.add(selectedProduct);
                        System.out.println("Added " + selectedProduct.getProductName() + " to your cart.");
                    } else {
                        System.out.println("Product with ID " + productId + " not found. Please enter a valid ID.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid product ID or 'done'.");
                }
            }
        }
        // Perform the checkout process here
        // You can calculate the total price and perform any necessary actions.
        System.out.println("\nThank you for shopping with us!");
        System.out.println("Your selected products:");
        for (Product selectedProduct : selectedProducts) {
            System.out.println(selectedProduct.getProductName() + " - $" + selectedProduct.getPrice());
        }
    }

    private static Product findProductById(int productId, List<Product.EBike> ebikes, List<Product.Accessory> accessories) {
        for (Product.EBike ebike : ebikes) {
            if (ebike.getId() == productId) {
                return ebike;
            }
        }

        for (Product.Accessory accessory : accessories) {
            if (accessory.getId() == productId) {
                return accessory;
            }
        }

        return null;
    }

}


