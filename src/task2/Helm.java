package task2;

public class Helm {
    private int helmDiametr;
    private String color;

    public Helm(int helmDiametr, String color) {
        this.helmDiametr = helmDiametr;
        this.color = color;
    }

    public int getHelmDiametr() {
        return helmDiametr;
    }

    public void setHelmDiametr(int helmDiametr) {
        this.helmDiametr = helmDiametr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "helmDiametr=" + helmDiametr +
                ", color='" + color + '\'' +
                '}';
    }
    public int doubleHelmSize(){
        helmDiametr=helmDiametr*2;
        return helmDiametr;
    }
    public void redHelm(){
        color="red";
    }
}
