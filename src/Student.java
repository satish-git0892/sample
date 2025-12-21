public class Student {
    String name;
    int age;
    double grade;
    static int studentCount = 0;

    public void checkstatus(){
        if(grade>50){
            System.out.println("Passing");
        }
        else {
            System.out.println("Failing");
        }
    }

    public static void studentCount(){
        System.out.println("Total Students " + studentCount);

    }
}

class findStatus{
    public static void main(String[] args){
        Student.studentCount++;
        Student student1 = new Student();
        student1.name="Satish";
        student1.age=34;
        student1.grade=60;

        Student student2 = new Student();
        student2.name="Lavanya";
        student2.age=34;
        student2.grade=45;
        Student.studentCount++;

        student1.checkstatus();
        student2.checkstatus();
        Student.studentCount();
    }
}
