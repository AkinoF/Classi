// Основная программа
public class Artem {
    public static void main(String[] args) {
        // Создание точек
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(0, 4);

        // Создание отрезка
        Segment segment = new Segment(p1, p2);
        System.out.println("Длина отрезка: " + segment.length());

        // Создание фигуры (треугольник)
        Point[] trianglePoints = {p1, p2, p3};
        Shape triangle = new Shape(trianglePoints);
        System.out.println("Периметр треугольника: " + triangle.perimeter());

        // Создание фигуры (четырёхугольник)
        Point[] quadrilateralPoints = {p1, p2, p3, p4};
        Shape quadrilateral = new Shape(quadrilateralPoints);
        System.out.println("Периметр четырёхугольника: " + quadrilateral.perimeter());

        // Поворот точки p2 на 90 градусов (π/2 радиан) вокруг p1
        double angle = Math.PI / 2; // 90 градусов
        p2.rotate(p1, angle);
        System.out.println("Координаты p2 после поворота: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}