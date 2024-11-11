package Lesson_5;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(10);

        Cat[] cats = { new Cat("Кот1"), new Cat("Кот2"), new Cat("Кот3") };

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            String status = cat.isFull ? "сыт" : "голоден";
            System.out.println(cat.name + " сейчас " + status + ".");
        }

        bowl.addFood(5);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            String status = cat.isFull ? "сыт" : "голоден";
            System.out.println(cat.name + " сейчас " + status + ".");
        }

        System.out.println("Общее количество животных: " + Animal.count);


        Circle circle = new Circle(5, "Красный", "Синий");
        Rectangle rectangle = new Rectangle(4, 6, "Зеленый", "Желтый");
        Triangle triangle = new Triangle(3, 4, 5, "Фиолетовый", "Оранжевый");

        System.out.println("Круг: " + circle.getShapeInfo());
        System.out.println("Прямоугольник: " + rectangle.getShapeInfo());
        System.out.println("Треугольник: " + triangle.getShapeInfo());
    }
}
