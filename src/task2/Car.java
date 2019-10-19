package task2;

public class Car {
    private String name;
    private double price;
    private Wheel wheel;
    private Helm helm;
    private Body body;

    public Car(String name, double price, Wheel wheel, Helm helm, Body body) {
        super();
        this.name = name;
        this.price = price;
        this.wheel = wheel;
        this.helm = helm;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", wheel=" + wheel +
                ", helm=" + helm +
                ", body=" + body +
                '}';
    }
    public double sale(){
        price=price/2;
        return price;
    }
}
