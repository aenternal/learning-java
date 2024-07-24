public class IsoscelesTriangleFactory implements PolygonFactory {
    @Override
    public Polygon createPolygon(double size) {
        return new IsoscelesTriangle(size, (size * Math.sqrt(3)) / 2);
    }
}