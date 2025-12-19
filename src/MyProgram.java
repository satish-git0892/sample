public class MyProgram {
    public static void main(String[] args) {
        printmultiplication(7);
        double balMessage = checktransaction(15000.00,5000.00);
        double discPrice = getDiscountedPrice(80,20);
        printNames("Alex", "Blake", "Charlie");
        System.out.println("balmessage: " + balMessage);

    }

    public static void printmultiplication(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
        }
    }

    public static double checktransaction(double balance, double withDrawalAmount) {
        if (withDrawalAmount > balance) {
            System.out.println("Insufficient funds");
//            return balance;
        } else if (withDrawalAmount < 0 || withDrawalAmount > 10000) {
            System.out.println("Invalid amount or exceeds daily limit.");
//            return balance;
        } else if (withDrawalAmount > 0 && balance >= withDrawalAmount) {
            balance = balance - withDrawalAmount;
            System.out.println("Withdrawal successful! Available balance: " + balance);
//            return balance;
        } else {
            System.out.println("Try Again Later");
//            return balance;
        }
        return  balance;
    }
    public static double getDiscountedPrice(double price, double discountPercent){
        if(price > 100){
            price = (price*(100-discountPercent))/100;
            System.out.println("Discount Applied");
        }
       else {
//            price = price;
           System.out.println("NO discount");
       }
        System.out.println("The New Price of the Product: " + price);
        return price;

    }
    public static void printNames(String... names) {
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }

}
