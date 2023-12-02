public class Circle {
    final double PI=3.14d;
    double radius = 1.0d;
     String color = "red";
    public Circle()
    {}

    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle (double radius, String color)
    {this.radius=radius;
    this.color=color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea()
    {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Radius : "+radius+" color : "+color+" Area : "+getArea();
    }
}
