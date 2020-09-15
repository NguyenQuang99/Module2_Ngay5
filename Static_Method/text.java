package Static_Method;

public class Text {
    public static void main(String[] args) {
        Student.change(); //calling change method
        // creating objects
        Student s1 = new Student(111, "Quang");
        Student s2 = new Student(222, "Dung");
        Student s3 = new Student(333, "Đào");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
