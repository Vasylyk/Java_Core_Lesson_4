package task2;

public class Body {
    private String type;
    private String bodyColor;
    private int placeNumber;

    public Body(String type, String bodyColor, int placeNumber) {
        this.type = type;
        this.bodyColor = bodyColor;
        this.placeNumber = placeNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", placeNumber=" + placeNumber +
                '}';
    }
    public void blackBody(){
        bodyColor="black";
    }
}
