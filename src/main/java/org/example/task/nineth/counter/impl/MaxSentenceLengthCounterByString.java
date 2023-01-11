package org.example.task.nineth.counter.impl;

import org.example.task.nineth.counter.MaxSentenceLengthCountable;

public class MaxSentenceLengthCounterByString implements MaxSentenceLengthCountable {

    @Override
    public int countMaxSentenceLength(final String text) {
        String[] sentences = text.split("[.?!]");
        int maxCountOfWords = 0;
        for (String sentence : sentences) {
            int countWords = countWords(sentence);
            if (maxCountOfWords < countWords) {
                maxCountOfWords = countWords;
            }
        }
        return maxCountOfWords;
    }

    private static int countWords(String sentence) {
        return sentence.split(" ").length;
    }
}
