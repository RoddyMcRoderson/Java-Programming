package day58_polymorphism.practices;

public abstract class OnlineShopping {
  public abstract void buy();
  public abstract void sell();
    public void ship() {
        System.out.println("Shipping items purchased");
    }
}

