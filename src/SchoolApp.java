public class SchoolApp {
    public static void main(String[] args) {
        // Create an array that can hold 3 Student objects
        Student[] classroom = new Student[3];

        // You must create the objects before putting them in the array!
        classroom[0] = new Student();
        classroom[0].name = "Satish";
        classroom[0].grade = 80;

        classroom[1] = new Student();
        classroom[1].name = "Lavanya";
        classroom[1].grade = 45;

        classroom[2] = new Student();
        classroom[2].name = "Kumar";
        classroom[2].grade = 52;

        // Loop through the objects
        for (Student s : classroom) {
            if (s != null) { // Good practice to check if the slot isn't empty
                s.checkstatus();
            }
        }
    }
}