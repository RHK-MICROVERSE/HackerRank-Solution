



// THIS IS A CHILD CLASS of Teacher
public class Student extends Teacher {
    String subject = "CSE";

    public static void main(String[] args) {
        // Creating an object of the class
        Student obj = new Student();
        System.out.println(obj.designation);
        System.out.println(obj.schoolName);
        System.out.println(obj.subject);
        obj.display();

    }
}
