package ThucHanh3;

public class Circle {
private double radius = 1;
private String  color = "red";

    public Circle(double radius) {
        this.radius = radius;
        //this.color = color;
    }
    public Circle(){

    }

    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
