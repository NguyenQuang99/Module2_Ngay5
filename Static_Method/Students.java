package Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // hàm để khởi tạo biến.
    Student(int r,String n) {
        rollno = r;
        name = n;

    }
    //Phương thức static để thay đổi giá trị biến static
    static void change() {
        college = "CODEGYM";
    }
    // phương pháp hiển thị giá trị
    void display() {
        System.out.println(rollno+ "" + name + "" + college);
    }
}
