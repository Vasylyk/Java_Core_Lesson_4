package task2;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMV X5", 15000, new Wheel(40,"circle","leather"),
                new Helm(35,"black"),new Body("car","white",5));
        System.out.println(c);
    }
}
