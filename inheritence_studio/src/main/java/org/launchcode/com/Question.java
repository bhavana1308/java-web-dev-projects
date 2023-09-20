package org.launchcode.com;


public abstract class Question {

    private final String text;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void displayQuestion();

    public abstract boolean checkAnswer(Object userAnswer);
}
