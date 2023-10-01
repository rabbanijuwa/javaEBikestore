import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a product in the store, including e-bikes and accessories.
 */
public class Product {
    private int id;
    private String productName;
    private String description;
    private double price;
    private int stockQuantity;


    public Product(int id, String productName, String description, double price, int stockQuantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Getter method for Id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter method for Id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter method for productName
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * setter for productName
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * getter for description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter for price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter for price
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for stockQuantity
     * @return stockQuantity
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * setter for stockQuantity
     */
    public void setStockQuantity() {
        this.stockQuantity = stockQuantity;
    }

    /**
     * Represents an accessory product, a subclass of Product
     */
    static class Accessory extends Product {
        private int id;
        private AccessoryCategory accessoryCategory;
        private Size size;
        private String color;

        public Accessory(String productName, String description, double price, int stockQuantity, int id, AccessoryCategory accessoryCategory, Size size, String color) {
            super(id, productName, description, price, stockQuantity);
            this.id=id;
            this.accessoryCategory = accessoryCategory;
            this.size = size;
            this.color = color;
        }

        /**
         * getter for id, generated form Product
         * @return id
         */
        public int getId(){
            return id;
        }

        /**
         * setter for id, generated from Product
         * @param id
         */
        @Override
        public void setId(int id) {
            this.id = id;
        }

        /**
         * Getter for accessoryCategory from enum
         * @return accessoryCategory
         */
        public AccessoryCategory getAccessoryCategory() {
            return accessoryCategory;
        }

        /**
         * getter for size from enum
         * @return size
         */
        public Size getSize() {
            return size;
        }

        /**
         * getter for color
         * @return color
         */
        public String getColor() {
            return color;
        }

        /**
         * setter for color
         * @param color
         */
        public void setColor(String color) {
            this.color = color;
        }


    }

    /**
     * Represents an e-bike product, a subclass of Product
     */
    static class EBike extends Product {
        private int id;
        private double maximumSpeed;
        private EBikeCategory category;

        public EBike(String productName, String description, double price, int stockQuantity, int id, double maximumSpeed, EBikeCategory category) {
            super(id, productName, description, price, stockQuantity);
            this.id = id;
            this.category = category;
            this.maximumSpeed = maximumSpeed;
            this.category = category;

        }

        //getters and setters
        public int getId() {
            return id;
        }

        @Override
        public void setId(int id) {
            this.id = id;
        }

        public double getMaximumSpeed() {
            return maximumSpeed;
        }

        public void setMaximumSpeed(double maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
        }

        //getter method for category
        public EBikeCategory getCategory() {
            return category;
        }


    }

    /**
     * Represents a customer of the store
     */
    class Customer {
        private int customerID;
        private String name;
        private String email;
        private String address;
        private String phoneNumber;

        public Customer(int customerId, String name, String email, String address, String phoneNumber) {
            this.customerID = customerId;
            this.name = name;
            this.email = email;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        //getters and setters
        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail() {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     *Represents a new customer, a subclass of Customer
     */
    class NewCustomer extends Customer {
        private String registrationDate;

        public NewCustomer(int customerID, String name, String email, String address, String phoneNumber, String registrationDate) {
            super(customerID, name, email, address, phoneNumber);
            this.registrationDate = registrationDate;
        }

        // Getter and setter methods for the registration date
        public String getRegistrationDate(){
            return registrationDate;
        }
        public void setRegistrationDate(String registrationDate){
            this.registrationDate=registrationDate;
        }


        /**
         * Polymorphism-Prompt new customers to enter their information
         */
        public void enterCustomerInformation() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome, new customer! Please enter your registration date:");
            System.out.println("Enter your email:");
            System.out.println("Enter your address:");
            System.out.println("Enter your phone number");
            registrationDate = scanner.nextLine();
        }
    }

    /**
     * Represents a returning customer, a subclass of Customer
     */
    class ReturningCustomer extends Customer {
        private int loyaltyPoints;

        public ReturningCustomer(int customerID, String name, String email, String address, String phoneNumber, int loyaltyPoints) {
            super(customerID, name, email, address, phoneNumber);
            this.loyaltyPoints = loyaltyPoints;
        }
        //getters and setters for loyalty points
        public int getLoyaltyPoints() {
            return loyaltyPoints;
        }
        public void setLoyaltyPoints(int customerID){
            this.loyaltyPoints=loyaltyPoints;
        }

        /**
         * polymorphism--Prompt returning customers to enter their information
         */
        public void enterCustomerInformation() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome back, returning customer! Please enter your loyalty points:");
            loyaltyPoints = scanner.nextInt();
            // You can add more prompts for additional information if needed
        }

    }


}

