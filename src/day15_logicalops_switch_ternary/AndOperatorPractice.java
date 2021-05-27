package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeshipping = false;
        String itemName = "Wooden Spoon";
        if (onSale && freeshipping) {
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping for deals on - " + itemName);

        }

    }
}
