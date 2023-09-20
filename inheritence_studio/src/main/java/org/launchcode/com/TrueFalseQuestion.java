package org.launchcode.com;

public class TrueFalseQuestion extends Question {

    private final boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println("True or False: " + getText());
    }

    @Override
    public boolean checkAnswer(Object userAnswer) {
        if (userAnswer instanceof Boolean) {
            return (boolean) userAnswer == correctAnswer;
        } else {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
            return false;
        }
    }
}



