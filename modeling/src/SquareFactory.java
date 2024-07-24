public class SquareFactory implements PolygonFactory {
    @Override
    public Polygon createPolygon(double size) {
        return new Square(size);
    }
}
