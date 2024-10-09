package co.jetfan.my;

public class PizzaStore {
    public static void main(String[] args){
        PizzaFactory oven = new PizzaFactory();
        
        Pizza chpizza = oven.MakePizza("CHEESE");
        chpizza.prepare();
        chpizza.bake();
        chpizza.cut();
        chpizza.box();

        Pizza prpizza = oven.MakePizza("PEPPERONI");
        prpizza.prepare();
        prpizza.bake();
        prpizza.cut();
        prpizza.box();

        Pizza grpizza = oven.MakePizza("GREEK");
        grpizza.prepare();
        grpizza.bake();
        grpizza.cut();
        grpizza.box();

        Pizza gfpizza = oven.MakePizza("GLUTENFREE");
        gfpizza.prepare();
        gfpizza.bake();
        gfpizza.cut();
        gfpizza.box();
        
    }
}
