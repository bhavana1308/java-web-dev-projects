package org.launchcode.com;


import java.util.List;

public class CheckboxQuestion extends Question {
    private final String[] options;
    private final int[] correctAnswerIndices;

    public CheckboxQuestion(String text, String[] options, int[] correctAnswerIndices) {
        super(text);
        this.options = options;
        this.correctAnswerIndices = correctAnswerIndices;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.println("Select multiple options (e.g., 1 3):");
    }

    @Override
    public boolean checkAnswer(Object userAnswer) {
        if (userAnswer instanceof List) {
            List<Integer> selectedIndices = (List<Integer>) userAnswer;

            if (selectedIndices.size() != correctAnswerIndices.length) {
                return false; // Number of selections doesn't match
            }

            for (int index : selectedIndices) {
                if (index < 1 || index > options.length || !containsIndex(correctAnswerIndices, index)) {
                    return false; // Invalid index or not a correct answer
                }
            }

            return true; // All selected options are correct
        }
        return false; // User answer is not a List of integers
    }

    private boolean containsIndex(int[] arr, int index) {
        for (int num : arr) {
            if (num == index) {
                return true;
            }
        }
        return false;
    }
}



