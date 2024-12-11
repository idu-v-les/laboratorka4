public class Gadget {
    private String name;

    // Конструктор
    public Gadget(String name) {
        this.name = name;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод включения гаджета
    public void turnOn() {
        System.out.println(name + " включен.");
    }

    // Метод для вывода всей информации
    public void displayInfo() {
        System.out.println("Название: " + name);
    }
}