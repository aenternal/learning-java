public class Square implements Polygon, Cloneable {
    private final int sidesNumber = 4;
    private final double sideLength;
    private double diagonal;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.diagonal = Math.hypot(this.sideLength, this.sideLength);
    }

    @Override
    public double perimeter() {
        return this.sideLength * this.sidesNumber;
    }

    @Override
    public double area() {
        return Math.pow(this.sideLength, 2);
    }

    @Override
    public double median() {
        return this.diagonal / 2;
    }

    @Override
    public String toString() {
        return String.format("Квадрат со стороной %.2f, периметром %.2f и площадью %.2f",
                this.sideLength, perimeter(), area());
    }
    @Override
    public int getSidesNumber() {
        return this.sidesNumber;
    }

    @Override
    public Square clone() {
        try {
            return (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public double getDiagonal() {
        return this.diagonal;
    }

    public double getSideLength() {
        return this.sideLength;
    }
}
