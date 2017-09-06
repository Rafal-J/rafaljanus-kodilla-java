package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "driving";
    public static final String PAINTING = "painting";
    public static final String SHOPPING = "shopping";

    public Task generatingTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Zawieźć meble", "Warszawa", "meblowóz");

            case PAINTING:
                return new PaintingTask("Obraz na zamówienie", "czerwony", "zachód słońca");

            case SHOPPING:
                return new ShoppingTask("Zakupy dla mamy", "mleko", 2.1);
            default:
                return null;
        }
    }
}
