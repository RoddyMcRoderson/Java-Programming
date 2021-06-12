package day52_inheritance;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class Instagram extends  MobileApp{
    public void postPhoto() {
        System.out.println("Posting photo on Instagram");
    }

    @Override
    public void useTheApp(int minutes) {
        System.out.println("Using instagram app features");
        postPhoto();
    }
}
