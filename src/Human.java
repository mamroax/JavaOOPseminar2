public class Human extends Actor{
    /**
     *  параметры актора, включая состояние готовности сделать заказ
     *  и факт получения заказа. Дополнение: для большего понимания у
     *  студентов, можно сделать методы-геттеры для имени и прочих
     *  “персональных данных” abstract
     */
    @Override
    public String toString() {
        return String.format("Сделан: %b Выдан: %b", isMakeOrder, isTakeOrder);
    }
}
