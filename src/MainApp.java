import Pizza.Pepperoni;
import Pizza.Pizza;
import pizzaFactory.Factory;
import storage.PizzaStorage;

public class MainApp {
    static Pepperoni pepperoni = new Pepperoni("pepperonni",0);
    static PizzaStorage pizzaStorage = new PizzaStorage();

    static Factory pizahut = new Factory("pizzahut");
    static Factory dominos = new Factory("dominos");

    public static void main(String[] args) throws InterruptedException {

        loopthrouh();

    }

    public static Pizza makeOrder(Pizza pizza,Factory pizahut,Factory dominos,PizzaStorage pizzaStorage) {

        if (pizzaStorage.number() < 19) {

            if (pizahut.isStatus()) {
                return pizahut.makePizza(pizza);
            } else if (dominos.isStatus()) {
                return dominos.makePizza(pizza);
            }
        }
        return null;
    }

    public static void loopthrouh() throws InterruptedException {
        while (pizzaStorage.number()<19) {
            Thread orderThread = new Thread(() -> pizzaStorage.addPizza(makeOrder(pepperoni, pizahut, dominos, pizzaStorage), 1));
            orderThread.setDaemon(true);
            orderThread.start();
            Thread.sleep(1000);
        }
    }
}
