public class Main {
    /**
     * 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
     * 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ
     * и факт получения заказа. Дополнение: для большего понимания у студентов, можно сделать методы-геттеры для имени
     * и прочих “персональных данных” abstract
     * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
     * @param args

     Реализовать класс Market и все методы, которые он обязан реализовывать.
     Методы из интерфейса QueueBehaviour, имитируют работу очереди,
     MarketBehaviour – помещает и удаляет человека из очереди,
     метод update – обновляет состояние магазина (принимает и отдаёт заказы)
     */
    public static void main(String[] args) {
        Market store = new Market();
        Human human1 = new Human();
        human1.setName("Олег");
        Human human2 = new Human();
        human2.setName("Василий");
        Human human3 = new Human();
        human3.setName("Николай");
        Human human4 = new Human();
        human4.setName("Ольга");
        Human human5 = new Human();
        human5.setName("Платон");

        store.acceptToMarket(human1);
        store.takeInQueue(human1);
        store.update();

        store.acceptToMarket(human2);
        store.acceptToMarket(human3);
        store.acceptToMarket(human4);
        store.acceptToMarket(human5);
        store.update();
        store.takeInQueue(human2);
        store.takeInQueue(human3);
        store.takeInQueue(human4);
        store.update();
        store.releaseFromMarket(store.list);
    }
}