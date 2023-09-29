import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity() {
        this.stockQuantity = stockQuantity;
    }


    class Accessory extends Product {
        private AccessoryCategory accessoryCategory;
        private String size;
        private String color;

        public Accessory(String productName, String description, double price, int stockQuantity, AccessoryCategory accessoryCategory, String size, String color) {
            super(id, productName, description, price, stockQuantity);
            this.accessoryCategory = accessoryCategory;
            this.size = size;
            this.color = color;
        }

        public AccessoryCategory getAccessoryCategory() {
            return accessoryCategory;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void getColor(String color) {
            this.color = color;
        }


    }

    class EBike extends Product {
        private double batteryCapacity;
        private double motorPower;
        private int maximumSpeed;
        private EBikeCategory category;

        public EBike(String productName, String description, double price, int stockQuantity, double batteryCapacity, double motorPower, int maximumSpeed, EBikeCategory category) {
            super(id, productName, description, price, stockQuantity);
            this.batteryCapacity = batteryCapacity;
            this.motorPower = motorPower;
            this.maximumSpeed = maximumSpeed;
            this.category = category;

        }

        //getters and setters
        public double getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }

        public double getMotorPower() {
            return motorPower;
        }

        public void setMotorPower(double motorPower) {
            this.motorPower = motorPower;
        }

        public int getMaximumSpeed() {
            return maximumSpeed;
        }

        public void setMaximumSpeed() {
            this.maximumSpeed = maximumSpeed;
        }

        //getter method for category
        public EBikeCategory getCategory() {
            return category;
        }


    }

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


        // Polymorphism-Prompt new customers to enter their information
        public void enterCustomerInformation() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome, new customer! Please enter your registration date:");
            System.out.println("Enter your email:");
            System.out.println("Enter your address:");
            System.out.println("Enter your phone number");
            registrationDate = scanner.nextLine();
            // You can add more prompts for additional information if needed
        }
    }

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
        //polymorphism--Prompt returning customers to enter their information
        public void enterCustomerInformation() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome back, returning customer! Please enter your loyalty points:");
            loyaltyPoints = scanner.nextInt();
            // You can add more prompts for additional information if needed
        }

    }

}

