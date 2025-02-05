// Класс для представления отрезка
public class Segment {
    private Point point1;
    private Point point2;

    // Конструктор
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    // Метод для расчёта длины отрезка
    public double length() {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}