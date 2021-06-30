package OfficeHours;

public class A {
    public A(){
        System.out.println("A");
    }
    class B extends A {
        public B(){
            System.out.println("B");
        }
    }

    public class Test extends B{
        public Test(){
            System.out.println();
        }
    }
}
