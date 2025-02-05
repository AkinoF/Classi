public class Point {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для задания новых координат
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры для координат
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Метод для поворота точки относительно заданной точки на угол (в радианах)
    public void rotate(Point center, double angle) {
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);

        // Перемещение точки относительно центра
        double translatedX = this.x - center.getX();
        double translatedY = this.y - center.getY();

        // Поворот
        double rotatedX = translatedX * cos - translatedY * sin;
        double rotatedY = translatedX * sin + translatedY * cos;

        // Возврат к оригинальной системе координат
        this.x = rotatedX + center.getX();
        this.y = rotatedY + center.getY();
    }
}