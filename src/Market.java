import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{
    ArrayList<Actor> list = new ArrayList<>();
    Queue<Actor> queue = new ArrayDeque<>();

    public void takeInQueue(Actor actor){
        if(list.contains(actor)) {
            System.out.print(actor.getName() + " уже есть среди посетителей. ");
            queue.add(actor);
            System.out.println("Человек стал в очередь размера " + queue.size());
            list.remove(actor);
        }
    }
    public void takeOrders(){
        if(queue.peek() != null) {
            queue.peek().isMakeOrder = true;
            System.out.println(queue.peek().getName() + " сделал заказ");
        }
    }
    public void giveOrders(){
        if(queue.peek() != null) {
            queue.peek().isTakeOrder = true;
            System.out.println(queue.peek().getName() + " забрал заказ");
            releaseFromQueue();
        }
    }
    public void releaseFromQueue(){
        System.out.print(queue.peek().getName() + " покинул очередь ");
        list.add(queue.poll());
        System.out.print(queue.size() + " клиентов ");
        System.out.print(queue.toString());
        System.out.println(" остался в очереди.");
    }
    public void acceptToMarket(Actor actor){
        System.out.print(actor.getName() + " Пришел на рынок. ");
        list.add(actor);
        System.out.println("Всего людей на рынке: " + (list.size()+queue.size()));
    }
    public void releaseFromMarket(List<Actor> actors){
        for (int i = 0; i < actors.size(); i++) {
            if(actors.get(i).isTakeOrder) {
                System.out.print(actors.get(i).getName() + " покидает рынок. ");
                actors.remove(actors.get(i));
                System.out.println("Всего людей на рынке: " + (list.size()+queue.size()));
            }
        }
    }
    public void update(){
        takeOrders();
        giveOrders();
    }
}
