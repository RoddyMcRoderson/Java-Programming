package day51_inheritance.Super_keyword;

import day51_inheritance.Super_keyword.Lyft;

public class LyftXL extends Lyft {


    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles)*1.1;

    }

}
