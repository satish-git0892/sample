public class Book {
    private String title;
    private double price;

    public Book(String title, double price){
        setTitle(title);
        setPrice(price);
        if (getTitle() != null){
        System.out.println("The price of book: " + getTitle() + " is " + getPrice() );
    }
    }

    public void setTitle(String title){
        if(!title.equals("")){
            this.title=title;
        }else{
            System.out.println("Empty titles are not allowed");
        }
    }

    public String getTitle(){
        return this.title;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
}
class BookStore {
    public static void main(String[] args) {
        Book Book1 = new Book("", 27.99);
        Book Book2 = new Book("War", 29.99);
        //System.out.println("inside BookStore, The price of book: " + Book1.getTitle() + " is " + Book1.getPrice() );
    }
}
