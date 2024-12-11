public class Smartphone extends Gadget {
    private String os;

    // Конструктор
    public Smartphone(String name, String os) {
        super(name);
        this.os = os;
    }

    // Геттер для операционной системы
    public String getOs() {
        return os;
    }

    // Сеттер для операционной системы
    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Операционная система: " + os);
    }
}