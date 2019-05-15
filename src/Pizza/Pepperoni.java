package Pizza;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        this(null,0);
    }

    public Pepperoni(String name, int amount) {
        super(name, amount);
        ingredient.add("Dough");
        ingredient.add("tomate sauce");
        ingredient.add("pepperoni");
        ingredient.add("Mozzarella");
    }
}
