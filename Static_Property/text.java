package Static_Property;

public class text {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "pro x6");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("BMW", "xxx");
        System.out.println(Car.numberOfCar);
    }
}
