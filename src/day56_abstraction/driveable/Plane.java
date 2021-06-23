package day56_abstraction.driveable;

import day56_abstraction.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {

    }
}
