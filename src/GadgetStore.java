import java.util.ArrayList;

public class GadgetStore {
    private ArrayList<Gadget> gadgets;

    // Конструктор
    public GadgetStore() {
        gadgets = new ArrayList<>();
    }

    // Метод добавления гаджета
    public void addGadget(Gadget gadget) {
        gadgets.add(gadget);
        System.out.println(gadget.getName() + " добавлен в магазин.");
    }

    // Метод удаления гаджета
    public void removeGadget(Gadget gadget) {
        if (gadgets.remove(gadget)) {
            System.out.println(gadget.getName() + " удален из магазина.");
        } else {
            System.out.println("Гаджет не найден.");
        }
    }

    // Метод включения всех гаджетов
    public void turnOnAll() {
        for (Gadget gadget : gadgets) {
            gadget.turnOn();
        }
    }

    // Метод подсчета гаджетов каждого типа
    public void countGadgets() {
        int smartphones = 0, tablets = 0, smartwatches = 0;

        for (Gadget gadget : gadgets) {
            if (gadget instanceof Smartphone) {
                smartphones++;
            } else if (gadget instanceof Tablet) {
                tablets++;
            } else if (gadget instanceof Smartwatch) {
                smartwatches++;
            }
        }

        System.out.println("Смартфоны: " + smartphones);
        System.out.println("Планшеты: " + tablets);
        System.out.println("Умные часы: " + smartwatches);
    }
}