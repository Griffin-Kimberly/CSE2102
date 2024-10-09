package co.jetfan.my;


public class GlutenfreePizza implements Pizza {
    String type = "Gluten Free";

    @Override
    public void prepare() {
            System.out.println(String.format("Preparing %s Pizza", type));
    }

    @Override
    public void bake() {
            System.out.println(String.format("Baking %s Pizza", type));
    }

    @Override
    public void cut() {
            System.out.println(String.format("Cutting %s Pizza", type));
    }

    @Override
    public void box() {
        System.out.println(String.format("Boxing %s Pizza", type));
    }

    
}
