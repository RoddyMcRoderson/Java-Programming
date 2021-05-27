public class Person {
    //Data -> variables
    String firstName;
    int age;
    char gender;
    //behaviour -> method
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People { //class for running with main method
    public static void main(String[] args) {
        //create object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Rodrigo";
        person1.age = 32;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Ainsley";
        person2.age = 28;
        person2.gender = 'F';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstname= " + person1.firstName);

    }
}
