package Lesson_5;

public interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    default String getShapeInfo() {
        return "[" + getPerimeter() + ", " + getArea() + ", " + getFillColor() + ", " + getBorderColor() + "]";
    }
}
