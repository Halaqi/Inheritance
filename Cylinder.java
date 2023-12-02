public class Cylinder extends Circle{
    private double height = 1.0d;
    public Cylinder()
    {}
    public Cylinder(double height)
    {
        this(height,0.0,"");
    }
    public Cylinder(double height,double radius)
    {
        this(height,radius,"");
    }
    public Cylinder(double height,double radius,String color)
    {   super(radius,color);
        this.height=height;
    }
    public void setHeight(double height)
    {
     this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public double getVolume()
    {
        return super.PI*super.radius*super.radius*getHeight();
    }
    @Override
    public String toString() {
        return super.toString()+" Height : "+height+" The volume : "+getVolume();
    }
}
