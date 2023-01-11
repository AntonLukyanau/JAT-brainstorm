package org.example.task.nineth.counter.impl;

import org.example.task.nineth.counter.MaxSentenceLengthCountable;

public class MaxSentenceLengthCounterByCharArray implements MaxSentenceLengthCountable {

    private int maxWordsNumber = 0;
    private int wordsNumber = 0;
    private int wordLength = 0;

    @Override
    public int countMaxSentenceLength(String text) {
        reset();
        char[] textCharSec = text.toCharArray();
        for (char currentChar : textCharSec) {
            analyseSymbol(currentChar);
        }
        return maxWordsNumber;
    }

    private void analyseSymbol(char currentChar) {
        if (isAtTheEndOfSentence(currentChar) || isAtTheEndOfWord(currentChar)) {
            wordCount();
            if (isAtTheEndOfSentence(currentChar)) {
                if (wordsNumber > maxWordsNumber) {
                    maxWordsNumber = wordsNumber;
                }
                wordsNumber = 0;
            }
        } else {
            wordLength++;
        }
    }

    private void wordCount() {
        if (isValidWord(wordLength)) {
            wordsNumber++;
        }
        wordLength = 0;
    }

    private static boolean isValidWord(int wordLength) {
        return wordLength > 0;
    }

    private static boolean isAtTheEndOfWord(char currentChar) {
        return currentChar == ' ';
    }

    private static boolean isAtTheEndOfSentence(char currentChar) {
        return currentChar == '!' || currentChar == '?' || currentChar == '.';
    }

    private void reset() {
        maxWordsNumber = 0;
        wordsNumber = 0;
        wordLength = 0;
    }
}
