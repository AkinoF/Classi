// Класс для представления фигуры (например, треугольника или четырёхугольника)
public class Shape {
    private Point[] points;

    // Конструктор
    public Shape(Point[] points) {
        if (points.length < 3) {
            throw new IllegalArgumentException("Фигура должна состоять минимум из трех точек.");
        }
        this.points = points;
    }

    // Метод для расчёта периметра фигуры
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            Segment segment = new Segment(points[i], points[(i + 1) % points.length]);
            perimeter += segment.length();
        }
        return perimeter;
    }
}
