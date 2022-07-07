package part_one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        while (!StdIn.isEmpty()) {
            String inStr = StdIn.readString();
            boolean b = StdRandom.bernoulli();
            if (b) {
                champion = inStr;
                System.out.println(champion);
            }
        }
    }
}
