package org.launchcode.com;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {

    public static void main(String[] args) {
        // Create a list to hold the questions
        List<Question> questions = new ArrayList<>();

        // Add questions to the list
        questions.add(new MultipleChoiceQuestion("What is 2 + 2?", new String[]{"3", "4", "5"}, 2));
        questions.add(new TrueFalseQuestion("Is the sky blue?", true));
        questions.add(new CheckboxQuestion("Select the even numbers:",
                new String[]{"1", "2", "3", "4", "5", "6"}, new int[]{1, 3, 5}));

        // Create a quiz with the list of questions
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        for (Question question : questions) {
            quiz.addQuestion(question);
        }

        // Run the quiz
        System.out.println("=== Quiz Runner ===");
        System.out.println("Let's start the quiz!");
        quiz.runQuiz();

        // Grade the quiz
        quiz.gradeQuiz();

        quiz.closeScanner();
    }
}
