package day56_abstraction;

public class GreetingsActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        gt = new Ukrainian();
        gt.hi();
        gt.bye();
    }
}
