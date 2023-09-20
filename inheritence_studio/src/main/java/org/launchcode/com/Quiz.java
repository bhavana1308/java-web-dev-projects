package org.launchcode.com;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<Question> questions;
    private final Scanner scanner;

    public Quiz() {
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }


    public void gradeQuiz() {
        int questionNumber = 0;
        int score = 0;
        int totalQuestions = questions.size();

        while (questionNumber < totalQuestions) {
            Question question = questions.get(questionNumber);

            Object userAnswer = getUserAnswer(question);

            boolean isCorrect = question.checkAnswer(userAnswer);
            System.out.println(isCorrect ? "Correct!\n" : "Incorrect. The correct answer is: " + userAnswer + "\n");

            if (isCorrect) {
                score++;
            }

            questionNumber++;
        }

        System.out.println("Quiz completed! Your score is: " + score + " out of " + totalQuestions);
    }

    public void runQuiz() {
        int questionNumber = 0;
        int totalQuestions = questions.size();

        while (questionNumber < totalQuestions) {
            Question question = questions.get(questionNumber);

            System.out.println("Question " + (questionNumber + 1) + ":");
            question.displayQuestion();
            questionNumber++;
        }

    }


    private Object getUserAnswer(Question question) {
        // Implement input handling based on the type of question
        if (question instanceof MultipleChoiceQuestion) {
            System.out.print("Enter the number of your choice: ");
            return scanner.nextInt();
        } else if (question instanceof TrueFalseQuestion) {
            System.out.print("Enter 'true' or 'false': ");
            return scanner.nextBoolean();
        } else if (question instanceof CheckboxQuestion) {
            System.out.print("Enter the numbers of your choices separated by commas : ");
            String input = scanner.next();

            String[] inputParts = input.split(",");
            List<Integer> selectedIndices = new ArrayList<>();

            for (String part : inputParts) {
                try {
                    int index = Integer.parseInt(part);
                    selectedIndices.add(index);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            return selectedIndices;
        } else {
            return null;
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
