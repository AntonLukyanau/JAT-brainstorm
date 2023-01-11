package org.example.task.nineth;

import org.example.task.nineth.counter.impl.MaxSentenceLengthCounterByCharArray;
import org.example.task.nineth.counter.impl.MaxSentenceLengthCounterByString;

public class SentencesStarter {
    public static void main(String[] args) {
        String text = "We are the    best test coders. Give us a try? !";
        MaxSentenceLengthCounterByCharArray counterByCharArray = new MaxSentenceLengthCounterByCharArray();
        MaxSentenceLengthCounterByString counterByString = new MaxSentenceLengthCounterByString();

        for (int i = 0; i < 5; i++) {
            long start = System.nanoTime();
            System.out.println(counterByCharArray.countMaxSentenceLength(text));
            long end = System.nanoTime();
            System.out.println("CharArrayTime: " + (end - start));

            long start2 = System.nanoTime();
            System.out.println(counterByString.countMaxSentenceLength(text));
            long end2 = System.nanoTime();
            System.out.println("SplitTime: " + (end2 - start2));
        }

    }

}
