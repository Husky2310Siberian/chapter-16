package gr.aueb.cf.ch16.shapes2;

import gr.aueb.cf.ch16.skeletal2.AbstractRectangle;

public class Rectangle extends AbstractRectangle  {

    private final double width;
    private final double height;

    private Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }
}
