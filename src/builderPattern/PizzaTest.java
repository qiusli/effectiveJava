package builderPattern;

public class PizzaTest {
    public static void main(String... args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.SAUSAGE).build();
        Pizza calZonePizza = new Calzone.Builder().sauceInside().addTopping(Pizza.Topping.PEPPER).build();
    }
}
