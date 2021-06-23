package day56_abstraction.driveable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(258);
        plane.land();
        plane.stop();
        plane.bye();


        //Polymorphism : will learn next class
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

    }
}
