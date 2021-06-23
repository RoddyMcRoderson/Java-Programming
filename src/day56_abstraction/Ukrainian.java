package day56_abstraction;

public class Ukrainian implements Greeting{
    @Override
    public void hi() {
        System.out.println("Здравствуйте");
    }

    @Override
    public void bye() {
        System.out.println("до побачення");
    }
}
