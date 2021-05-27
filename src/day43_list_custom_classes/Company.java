package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        /**
         * add 3 objects of Emplyee class
         * assign name and job titles.
         * call work method
         */
        Employee employee1 = new Employee();
        employee1.name = "Rodrigo";
        employee1.jobTitle = "Developer";
        employee1.work();
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);


        Employee employee2 = new Employee();
        employee2.name = "Fikret";
        employee2.jobTitle = "Full Stack Developer";
        employee2.work();
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);

        //employee1 = employee2
        employee1.work();

     }
    }

