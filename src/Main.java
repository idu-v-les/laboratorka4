public class Main {
    public static void main(String[] args) {
        // Создаем магазин гаджетов
        GadgetStore store = new GadgetStore();

        // Создаем гаджеты
        Smartphone phone = new Smartphone("iPhone", "iOS");
        Tablet tablet = new Tablet("iPad", 12.9);
        Smartwatch watch = new Smartwatch("Apple Watch", 18);

        // Добавляем гаджеты в магазин
        store.addGadget(phone);
        store.addGadget(tablet);
        store.addGadget(watch);

        // Включаем все гаджеты
        store.turnOnAll();

        // Выводим информацию о гаджетах
        phone.displayInfo();
        tablet.displayInfo();
        watch.displayInfo();

        // Подсчитываем гаджеты каждого типа
        store.countGadgets();
    }
}