public class Smartwatch extends Gadget {
    private int batteryLife;

    // Конструктор
    public Smartwatch(String name, int batteryLife) {
        super(name);
        this.batteryLife = batteryLife;
    }

    // Геттер для времени работы батареи
    public int getBatteryLife() {
        return batteryLife;
    }

    // Сеттер для времени работы батареи
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Время работы от батареи: " + batteryLife + " часов");
    }
}