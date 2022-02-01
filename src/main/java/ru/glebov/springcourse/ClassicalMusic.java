package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {} // конструктор private

    public static ClassicalMusic getClassicalMusic() { // фабрич. метод
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Rhapsody111";
    }
}
