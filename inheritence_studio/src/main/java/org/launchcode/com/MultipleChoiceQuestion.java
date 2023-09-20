package org.launchcode.com;


public class MultipleChoiceQuestion extends Question {
    private final String[] options;
    private final int correctAnswerIndex;

    public MultipleChoiceQuestion(String text, String[] options, int correctAnswerIndex) {
        super(text);
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(Object userAnswer) {
        if (userAnswer instanceof Integer) {
            int selectedOption = (int) userAnswer;
            return selectedOption == correctAnswerIndex;
        }
        return false;
    }
}



