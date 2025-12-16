//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String instvar = " instance_variable";
    public static void main(String[] args) {
        String firstName = "Satish";
        String lastName = "Kumar";
        int age = 34;
        double height = 5.8;
        boolean isExcited = true;
        String name = ("This is " + firstName + " " + lastName);
        String features = (", My age is " + age  + " and "  + "my height is " + height + " inches");
        String excite = (", Am i excited? : " + isExcited);
        System.out.println(name + features + excite + instvar) ;
        System.out.println("printing instance variable for 2nd time: " + instvar);
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}