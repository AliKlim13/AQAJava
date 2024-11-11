package Lesson_5;

class Cat extends Animal {
    static final int MAX_RUN_DISTANCE = 200;
    static final int MAX_SWIM_DISTANCE = 0;
    boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false; // Изначально кот голоден
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.food > 0) {
            bowl.food--; // Каждому коту нужно по 1 единице еды
            this.isFull = true;
            System.out.println(name + " поел из миски.");
        } else {
            System.out.println(name + " не смог поесть, в миске нет еды.");
        }
    }
}