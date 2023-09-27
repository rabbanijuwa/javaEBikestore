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
        private String accessoryCategory;
        private String size;
        private String color;

        public Accessory(String productName, String description, double price, int stockQuantity, String accessoryCategory, String size, String color) {
            super(id, productName, description, price, stockQuantity);
            this.accessoryCategory = accessoryCategory;
            this.size = size;
            this.color = color;
        }
        public String getAccessoryCategory(){
            return accessoryCategory;
        }
        public void setAccessoryCategory(String accessoryCategory){
            this.accessoryCategory=accessoryCategory;
        }
        public String getSize(){
            return size;
        }
        public void setSize(String size){
            this.size=size;
        }
        public String getColor(){
            return color;
        }
        public void getColor(String color){
            this.color = color;
        }



    }
    class EBike extends Product{
        private double batteryCapacity;
        private double motorPower;
        private int maximumSpeed;
        private EBikeCategory category;
        public EBike(String productName, String description, double price, int stockQuantity, double batteryCapacity, double motorPower, int maximumSpeed, EBikeCategory category){
            super(id, productName, description, price, stockQuantity);
            this.batteryCapacity = batteryCapacity;
            this.motorPower = motorPower;
            this.maximumSpeed = maximumSpeed;
            this.category = category;

        }
        //getters and setters
        public double getBatteryCapacity(){
            return batteryCapacity;
        }
        public void setBatteryCapacity(double batteryCapacity){
            this.batteryCapacity = batteryCapacity;
        }
        public double getMotorPower(){
            return motorPower;
        }
        public void setMotorPower(double motorPower){
            this.motorPower=motorPower;
        }
        public int getMaximumSpeed(){
            return maximumSpeed;
        }
        public void setMaximumSpeed(){
            this.maximumSpeed=maximumSpeed;
        }
        //getter method for category
        public EBikeCategory getCategory() {
            return category;
        }


    }
}

