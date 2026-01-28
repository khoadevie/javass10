class Car {

    private int currentSpeed = 0;

    public void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
        printStatus();
    }

    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
        printStatus();
    }

    public void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
        printStatus();
    }

    public void printStatus() {
        System.out.println("Current speed: " + currentSpeed + " km/h");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.accelerate();
        car.accelerate(20);
        car.accelerate(5, 4);
    }
}
