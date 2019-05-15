package storage;

import Pizza.*;

import java.util.ArrayList;
import java.util.List;

public class PizzaStorage {
    private List<Pizza> pizzas = new ArrayList<>();

    public PizzaStorage() {
        pizzas.add(new Pepperoni("Pereronni", 0));
    }

    public void addPizza(Pizza pizza, int number) {
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i) instanceof Pepperoni && pizza instanceof Pepperoni) {
                pizzas.get(i).addPizza(number);
                System.out.println("pepperoni pizza in store: "+pizzas.get(0).getAmount());
            }
        }
    }

    public void removePizza(Pizza pizza, int number) {
        if (pizza instanceof Pepperoni) {
            if (pizzas.get(0).getAmount() >= pizza.getAmount()) {
                pizzas.get(0).removePizza(number);
                if (pizzas.get(0).getAmount() < 40) {
                    starOrder(pizza);
                }
            }else {
                System.out.println("nog enough "+pizza.getName()+" for this order");
            }
        }
    }

    public void printStorageInfo() {
        pizzas.forEach((t) -> System.out.println("Pizza: " + t.getName() + " amount: " + t.getAmount()));
    }

    public void starOrder(Pizza pizza) {
        System.out.println("starting new order of " + pizza.getName()+" to the factory");
    }

    public int number(){
        return pizzas.get(0).getAmount();
    }


}
