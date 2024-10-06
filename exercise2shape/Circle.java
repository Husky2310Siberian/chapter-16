package gr.aueb.cf.ch16.exercise2shape;

public class Circle extends AbstractShape implements ICircle {

    private double radius;

    @Override
    public double getDiameter() {
        return (2 * radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
    }
}
