package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        System.out.println("What size cappuccino would you like?");
      String size = "grande";
      double price = 0;
      double calories = 0;
      switch (size) {
          case "tall":
              System.out.println("Tall Cappuccino please");
              price = 3.69;
              calories = 90;
              break;
          case "grande":
              System.out.println("Grande Cappuccino please");
              price = 3.99;
              calories = 120;
              break;
          case "venti":
              System.out.println("Venti Cappuccino please");
              price = 4.29;
              calories = 150;
              break;
          default:
              System.out.println("We don't serve that " + size + " Cappuccino");
              break;

      }   System.out.println("Toatla price $"+price);
          System.out.println("You will consume: "+calories+" cal of energy");



      }



    }

