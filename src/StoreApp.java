public class StoreApp {
    public static void main(String[] args){
        Product laptop = new Product();
        laptop.name="Macbook Pro";
        laptop.price= 1999.99;
        laptop.quantity=10;

        Product mobile = new Product();
        mobile.name = "IPhone";
        mobile.price = 999.99;
        mobile.quantity=15;

        laptop.displayProductInfo();
        mobile.displayProductInfo();
    }
}
