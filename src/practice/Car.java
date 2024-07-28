package practice;

public class Car {
    String name;
    int number;

    @Override
    public String toString() {
        return ("[name=" + name + ", number=" + number + "]");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.number = 1234;

        System.out.println(car);
    }
}
