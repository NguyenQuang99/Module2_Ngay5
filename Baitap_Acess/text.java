package Acess_Modifier;

public class text {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle.toString() + " :" + circle.getRadius() );
        System.out.println(circle.toString() + ":"  + circle.getArea());
    }
}
