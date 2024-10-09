package co.jetfan.my;


public class PizzaFactory {
    public Pizza MakePizza(String type){
        if (type == null || type.isEmpty()){
            return null;
        }
        switch (type) {
            case "CHEESE":
                return new CheesePizza();
            case "PEPPERONI":
                return new PepperoniPizza();
            case "GREEK":
                return new GreekPizza();
            case "GLUTENFREE":
                return new GlutenfreePizza();
            default:
                throw new IllegalArgumentException("Sorry, we don't serve " + type + " at this location.");

        }
    }
}
