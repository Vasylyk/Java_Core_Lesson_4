package task3;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Dog",20,3);
        System.out.println(a.getAnimalName()+", speed="+a.getAnimalSpeed()+"km/h, age="+a.getAnimalAge()+"years");
        a.setAnimalName("Cat");
        a.setAnimalSpeed(12);
        a.setAnimalAge(5);
        System.out.println(a.getAnimalName()+", speed="+a.getAnimalSpeed()+"km/h, age="+a.getAnimalAge()+"years");
    }
}
