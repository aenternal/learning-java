import java.util.ArrayList;
import java.util.List;

public class Cube implements Polyhedron {

    private List<Square> edges;
    private final Square edge;
    private final int edgesNumber = 6;

    public Cube(Square edge) {
        this.edge = edge;
        this.edges = new ArrayList<>();
        this.edges.add(edge);
        while (this.edges.size() < this.edgesNumber) {
            this.edges.add(new Square(this.edge.getSideLength()));
        }
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = 0;
        for (Square square : this.edges) {
            surfaceArea += square.area();
        }
        return surfaceArea;
    }

    @Override
    public double volume() {
        return Math.pow(this.edge.getSideLength(), 3);
    }

    @Override
    public String toString() {
        return String.format("Куб с площадью поверхности %.2f", this.surfaceArea());
    }
}
