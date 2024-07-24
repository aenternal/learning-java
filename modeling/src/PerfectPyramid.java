import java.util.ArrayList;
import java.util.List;


public class PerfectPyramid implements Polyhedron {
    private final Polygon base;
    private final IsoscelesTriangle edge;
    private final int edgesNumber;
    private final double height;

    private List<Polygon> faces;

    public PerfectPyramid(PolygonFactory factory, IsoscelesTriangle edge) {
        this.base = factory.createPolygon(edge.getBase());
        this.edge = edge;
        this.edgesNumber = this.base.getSidesNumber() + 1;
        this.height = this.calculateHeightLength();
        this.faces = new ArrayList<>();
        this.faces.add(base);
        while (this.faces.size() < this.edgesNumber) {
            this.faces.add(this.edge.clone());
        }
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = 0;
        for (int i = 0; i < this.base.getSidesNumber(); i++) {
            surfaceArea += this.edge.area();
        }
        return surfaceArea;
    }

    @Override
    public String toString() {
        return String.format("Правильная пирамида с основанием %s и гранями равнобедренными треугольниками " +
                        "в количестве %d. Высота: %.2f; площадь поверхности: %.2f; объём: %.2f",
                this.base.getClass().getSimpleName(), this.base.getSidesNumber(),
                this.height, this.surfaceArea(), this.volume());
    }

    public Polygon getBase() {
        return this.base;
    }

    public List<Polygon> getFaces() {
        return this.faces;
    }

    public double getHeight() {
        return this.height;
    }

    private double calculateHeightLength() {
        return Math.sqrt(Math.pow(this.edge.getSide(), 2) - Math.pow(this.base.median(), 2));
    }

    @Override
    public double volume() {
        return ((double) 1 / 3) * this.surfaceArea() * this.getHeight();
    }
}
