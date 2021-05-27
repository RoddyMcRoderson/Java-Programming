package day45_oop;

public class Coffee {
    /**
     * can be 0 - 100 as percentage
     */
    int amount;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    String type;


    public void refill() {
        amount = 100;
    }
    public void drink(int someAmount){
        amount -= someAmount;
    }
    public int getAmount(){
        return amount;
    }
    public void setType(String newType) {
        type = newType;
    }
    public String getType() {
        return type;
    }
}
