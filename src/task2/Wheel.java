package task2;

public class Wheel {
    private int wheelDiametr;
    private String wheelForm;
    private String wheelMaterial;

    public Wheel(int diametr, String form, String material) {
        this.wheelDiametr = diametr;
        this.wheelForm = form;
        this.wheelMaterial = material;
    }

    public int getDiametr() {
        return wheelDiametr;
    }

    public void setDiametr(int diametr) {
        this.wheelDiametr = diametr;
    }

    public String getForm() {
        return wheelForm;
    }

    public void setForm(String form) {
        this.wheelForm = form;
    }

    public String getMaterial() {
        return wheelMaterial;
    }

    public void setMaterial(String material) {
        this.wheelMaterial = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelDiametr=" + wheelDiametr +
                ", wheelForm='" + wheelForm + '\'' +
                ", wheelMaterial='" + wheelMaterial + '\'' +
                '}';
    }
    public int doubleSize(){
        wheelDiametr=wheelDiametr*2;
        return wheelDiametr;
    }
}
