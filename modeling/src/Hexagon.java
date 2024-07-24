public class Hexagon implements Polygon, Cloneable {
    private final int sidesNumber = 6;
    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return this.sideLength * this.sidesNumber;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(this.sideLength, 2)) / 2;
    }

    @Override
    public double median() {
        return this.sideLength;
    }

    @Override
    public int getSidesNumber() {
        return this.sidesNumber;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public String toString() {
        return String.format("Правильный шестиугольник со стороной %.2f, периметром %.2f и площадью %.2f",
                this.sideLength, this.perimeter(), this.area());
    }

    @Override
    public Hexagon clone() {
        try {
            return (Hexagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
