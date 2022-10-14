public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        System.out.println(this);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println(this);
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println(this);
    }


    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double[] getThreeSide() {
        double[] array = {this.getSide1(), this.getSide2(), this.getSide3()};
        return array;
    }

    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter() / 2;
        System.out.print("Triangle area: ");
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.getSide1()) * (halfPerimeter - this.getSide2()) * (halfPerimeter - this.getSide3()));
    }

    public double getPerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", color = " + super.getColor()
                + ", perimeter = " + this.getPerimeter();
    }
}
