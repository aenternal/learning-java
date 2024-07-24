public class IsoscelesTriangle implements Polygon, Cloneable {
    private final int sidesNumber = 3;

    private final double side;
    private final double base;
    private final double height;

    public IsoscelesTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.side = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.base / 2, 2));

    }

    @Override
    public double perimeter() {
        return 2 * Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.height, 2)) + this.base;
    }

    @Override
    public double area() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double median() {
        return this.height / 2;
    }

    @Override
    public String toString() {
        return String.format("Равнобедренный треугольник с основанием %.2f, высотой %.2f, " +
                "периметром %.2f и площадью %.2f", this.base, this.height, perimeter(), area());
    }

    @Override
    public int getSidesNumber() {
        return this.sidesNumber;
    }

    public double getBase() {
        return this.base;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public IsoscelesTriangle clone() {
        try {
            return (IsoscelesTriangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
