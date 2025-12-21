class Product {
    String name;
    double price;
    int quantity;

    public void displayProductInfo(){
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("In Stock " + quantity );
        System.out.println("-------------------------------------");
    }
}
