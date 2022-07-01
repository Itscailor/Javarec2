package org.example;

public class Frase {
    int letterCount=0;
    int wordsCount=0;
    String replacedString="";

    public Frase(int letterCount, int wordsCount, String replacedString) {
        this.letterCount = letterCount;
        this.wordsCount = wordsCount;
        this.replacedString = replacedString;
    }

    @Override
    public String toString() {
        return "result{" +
                "letterCount='" + letterCount + '\'' +
                ", wordsCount=" + wordsCount +
                ", ReplacedString=" + replacedString +
                '}';
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    public String getReplacedString() {
        return replacedString;
    }

    public void setReplacedString(String replacedString) {
        this.replacedString = replacedString;
    }
}