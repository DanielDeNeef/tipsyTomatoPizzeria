package Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private String name;
    private int amount;
    List<String>ingredient=new ArrayList<>();

    public Pizza() {

    }

    public Pizza(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void addPizza(int amount){
        this.amount+=amount;
    }

    public void removePizza(int amount){
        if (enoughPizza(amount)){
            this.amount-=amount;
        }
    }

    private boolean enoughPizza(int amount){
        if (this.amount>=amount){
            return true;
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredient() {
        return ingredient;
    }
}
