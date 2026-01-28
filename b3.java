class Computer {

    public double calculatePrice(double basePrice) {
        System.out.println("Tinh gia theo gia goc");
        return basePrice;
    }

    public double calculatePrice(double basePrice, double tax) {
        System.out.println("Tinh gia theo gia goc + thue");
        return basePrice + tax;
    }

    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Tinh gia theo gia goc + thue - giam gia");
        return basePrice + tax - discount;
    }
}

public class Main {
    public static void main(String[] args) {

        Computer c = new Computer();

        double p1 = c.calculatePrice(1000);
        System.out.println("Gia: " + p1);

        double p2 = c.calculatePrice(1000, 100);
        System.out.println("Gia: " + p2);

        double p3 = c.calculatePrice(1000, 100, 50);
        System.out.println("Gia: " + p3);
    }
}
