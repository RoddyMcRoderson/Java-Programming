package day54_abstaction;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies, add dressing");
    }

    @Override
    public void serve() {

    }
}
