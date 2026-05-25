public class Circle extends Shape{
    private double redius;
    public Circle(double redius){
        this.redius=redius;
    }
    @Override
    public double getArea(){
        return redius*redius*3.14;
    }
}
