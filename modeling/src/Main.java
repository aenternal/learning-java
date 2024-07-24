public class Main {
    public static void main(String[] args) {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(10, 15);
        Square square = new Square(10);
        Hexagon hexagon = new Hexagon(10);
        Cube cube = new Cube(square);
        PerfectPyramid isoscelesTrianglePerfectPyramid = new PerfectPyramid(new IsoscelesTriangleFactory(), isoscelesTriangle);
        PerfectPyramid squarePerfectPyramid = new PerfectPyramid(new SquareFactory(), isoscelesTriangle);
        PerfectPyramid hexagonPerfectPyramid = new PerfectPyramid(new HexagonFactory(), isoscelesTriangle);

        System.out.println(isoscelesTriangle);
        System.out.println(square);
        System.out.println(hexagon);
        System.out.println(cube);
        System.out.println(isoscelesTrianglePerfectPyramid);
        System.out.println(squarePerfectPyramid);
        System.out.println(hexagonPerfectPyramid);
        System.out.println(isoscelesTrianglePerfectPyramid.getFaces().toString());
        System.out.println(squarePerfectPyramid.getFaces().toString());
        System.out.println(hexagonPerfectPyramid.getFaces().toString());
    }
}