package pizzaFactory;

import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private boolean status=true; //true for free and false for bussy
    String name;

    public Factory(String name) {
        this.name = name;
    }

    public Pizza makePizza(Pizza pizza){

        status=false;

        List<String> ingridientlist = pizza.getIngredient();
        System.out.println(name+" preparing the "+pizza.getClass().getSimpleName());
        for (int i = 0; i < ingridientlist.size() ; i++) {
            //System.out.println(name+" use "+ingridientlist.get(i)+" for the "+pizza.getClass().getSimpleName()+" pizza");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("the "+pizza.getClass().getSimpleName()+" from "+name+" is ready !");
        status = true;
        return pizza;
    }

    public boolean isStatus() {
        return status;
    }
}
