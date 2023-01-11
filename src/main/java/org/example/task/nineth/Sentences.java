package org.example.task.nineth;

public class Sentences {
    public static void main(String[] args) {
        String text = "We are the best test coders. Give us a try? !";

        for (int i = 0; i < 5; i++) {
            long start = System.nanoTime();
            charArrayVar(text);
            long end = System.nanoTime();
            System.out.println("CharArrayTime: " + (end - start));

            long start2 = System.nanoTime();
            splitVar(text);
            long end2 = System.nanoTime();
            System.out.println("SplitTime: " + (end2 - start2));
        }

    }

    private static void charArrayVar(String text) {
        char[] textCharSec = text.toCharArray();
        int maxWordsNumber = 0;
        int wordsNumber = 0;
        int wordLength = 0;
        for (char currentChar : textCharSec) {
            if (isAtTheEndOfSentence(currentChar)) {
                if (isAfterValidWord(wordLength)) {
                    wordsNumber++;
                }
                if (wordsNumber > maxWordsNumber) {
                    maxWordsNumber = wordsNumber;
                }
                wordsNumber = 0;
            } else if (isAtTheEndOfWord(currentChar)) {
                if (wordLength != 0) {
                    wordsNumber++;
                }
                wordLength = 0;
            } else {
                wordLength++;
            }
        }
        System.out.println(maxWordsNumber);
    }

    private static boolean isAfterValidWord(int wordLength) {
        return wordLength > 0;
    }

    private static boolean isAtTheEndOfWord(char currentChar) {
        return currentChar == ' ';
    }

    private static boolean isAtTheEndOfSentence(char currentChar) {
        return currentChar == '!' || currentChar == '?' || currentChar == '.';
    }

    private static void splitVar(String text) {
        String[] sentences = text.split("[.?!]");
        int maxCountOfWords = 0;
        for (String sentence : sentences) {
            int countWords = countWords(sentence);
            if (maxCountOfWords < countWords) {
                maxCountOfWords = countWords;
            }
        }

        System.out.println(maxCountOfWords);
    }

    private static int countWords(String sentence) {
        return sentence.split(" ").length;
    }

}
