package day54_abstaction;

public class CampusStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("Campus student is attending the class in person");
    }
}
