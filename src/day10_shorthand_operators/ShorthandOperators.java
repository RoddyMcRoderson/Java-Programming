package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        cars = cars -1;
        cars -=1;
        System.out.println("cars in parking lot = " + cars);
        int electricCars = 13;
        System.out.println("electricCars in parking lot = " + electricCars);
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word += " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);
        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);

        int count = 2;
        count++;
        System.out.println("count = " + count);

        int i = 44;
        i--;
        System.out.println("i = " + i);


        int num = 10;
        num = num +1;
        num+=1;
        num++;
        ++num;
        System.out.println("num = " + num);















    }
}
