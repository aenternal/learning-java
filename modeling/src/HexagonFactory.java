public class HexagonFactory implements PolygonFactory {
    @Override
    public Polygon createPolygon(double size) {
        return new Hexagon(size);
    }
}
