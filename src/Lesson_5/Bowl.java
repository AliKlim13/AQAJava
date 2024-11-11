package Lesson_5;

public class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске " + food + " единиц еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды!");
        }
    }
}
