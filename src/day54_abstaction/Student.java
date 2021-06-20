package day54_abstaction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 *  -> we add abstract keyword to a class to make it an abstract class
 *   -> We cannot create object of Student class - meaning:
 *     Student studdent = new Student(); will show ERROR
 *      -> what can we do with this Student class? We can extend this class by
 */
public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }



    /**
     * we can add abstract methods into abstract class.
     * abstract method -> is created using abstract keyword
     * and does not have the implementation/method body
     *
     *So abstract class only shows WHAT it
     */
    public abstract void attendClass();

    }

