package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {

    static class Question {
        public String question;
        public String answer;

        public Question(String ask, String answer) {
            this.question = ask;
            this.answer = answer;
        }
    }

    public static void main(String[] args) {

        Question q1 = new Question("What is 2+2", "4");
        Question q2 = new Question("Y/N Can you smell what the Rock is cooking?", "N");
        Question q3 = new Question("T/F I'm comfortably numb.", "T");
        Question q4 = new Question("Who is the enemy of the Fantastic Four?\nA) Reed Richards\nB) Susan Storm\nC) Johnny Storm\nD) The Thing\nE) The enemy of the Fantastic Four, Doctor Doom", "E");

        Question[] testBank = {q1, q2, q3, q4};

        takeQuiz(testBank);

    }

   public static void takeQuiz(Question[] questions) {
        int score = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            String inputText = input.nextLine().toUpperCase();
            if (inputText.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.length);
   }

}
