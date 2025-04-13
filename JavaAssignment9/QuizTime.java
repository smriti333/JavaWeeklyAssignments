package main;
import java.util.Scanner;



    class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrect(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }
}
    
    
    

    class Quiz {
    private Question[] questions = new Question[25];
    private int count = 0;

    public void add(Question q) {
        if (count < questions.length) {
            questions[count++] = q;
        } else {
            System.out.println("Cannot add more questions. Quiz is full!");
        }
    }

    
    
    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i].getQuestionText());
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (questions[i].isCorrect(answer)) {
                System.out.println("Correct!\n");
                correctCount++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("You got " + correctCount + " out of " + count + " correct.");

        scanner.close();
    }
}

public class QuizTime {
	public static void main(String[] args) {
        Quiz quiz = new Quiz();

        
        quiz.add(new Question("What is the capital of Nepal?", "Kathmandu"));
        quiz.add(new Question("What is 5 + 3?", "8"));
        quiz.add(new Question("What is the name of the national bird of Nepal'?", "Danphe"));

        
        quiz.giveQuiz();
    }

}
