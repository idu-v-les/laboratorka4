public class Tablet extends Gadget {
    private double screenSize;

    // Конструктор
    public Tablet(String name, double screenSize) {
        super(name);
        this.screenSize = screenSize;
    }

    // Геттер для размера экрана
    public double getScreenSize() {
        return screenSize;
    }

    // Сеттер для размера экрана
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер экрана: " + screenSize + " дюймов");
    }
}