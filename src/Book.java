public class Book {
    String title;
    double price;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
        System.out.println("The price of book: " + title + " is " + price );
    }
}
class BookStore {
    public static void main(String[] args) {
        Book Book1 = new Book("Peace", 27.99);
        Book Book2 = new Book("War", 29.99);
        System.out.println("inside BookStore, The price of book: " + Book1.title + " is " + Book1.price );
    }
}
