package group25_practice;

import day41_arraylist.ArraysAsList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unit3_practice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String word: words) {
            lengths.add((word.length()));
        }
        System.out.println(lengths);
    }

}