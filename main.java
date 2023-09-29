public class main{
    public void main(String[] args) {
        // Create a new instance of the Inventory class
        Inventory inventory = new Inventory();

        //create EBikes
        //super(id, productName, description, price, stockQuantity);
        Product.EBike EBike1 = new Product.EBike (1, "City E-Bike", "A comfortable city e-bike", 1699.99, 50);

        inventory.addEBike(EBike1);
    }
}
