/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab2Exercise1;

/**
 *
 * @author faiaz
 */

    import javax.swing.*;
import java.security.SecureRandom;

public class Test {

    // random-number generation
    private final SecureRandom randomNumbers = new SecureRandom();
    private int rightAnswers, wrongAnswers = 0;

    //set of questions
    private final String[] questions = {"The object is created with new keyword:",
            "These are the rules that must be followed when writing a program:",
            "The java compiler generates:",
            "Which keyword is used to declare a named constant?",
            "Every complete java statement ends with:"};

    //options for each questions
    private final String[] options = {"a) at compile-time \nb) at run-time\nc) depends on code \nd) none",
            "a) syntax \nb) punctuation \nc) keywords \nd) operators",
            "a) machine code \nb) byte code \nc) source code \nd) HTML",
            "a) constant \nb) namedConstant \nc) final \nd)concrete",
            "a) period \nb) parenthesis \nc) semicolon \nd)ending brace"};


    //array containing answers
    private final String[] answerKey = {"b", "a", "b", "c", "c"};

// Generate and prompt questions

    public void simulateQuestion() throws NullPointerException{

        boolean value;//value will be true if answer is correct

        //prompting questions

        for (int i = 0; i < this.questions.length; i++) {
            String ans = JOptionPane.showInputDialog("Question " + (i + 1) + "!\n\n" + this.questions[i] + "\n\n" + this.options[i]);
            if(ans.equals(null))
                return;
            value = checkAnswer(ans,i);
            if (value)
                generateMessage(value);

            else
                generateMessage(value);
        }
    }

    // Checks if the answer is correct
    public boolean checkAnswer(String answer, int questionNumber) {

        if (this.answerKey[questionNumber].equals(answer)) {
            this.rightAnswers++;
            return true;
        } else {
            this.wrongAnswers++;
            return false;
        }
    }
    // Method that returns the appropriate message

    public void generateMessage(boolean value) {

        // Correct answer
        if (value) {

            switch (this.randomNumbers.nextInt(4)) {

                case 0:
                    JOptionPane.showMessageDialog(null, "Excellent!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Keep up the good work");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nice work!");
                    break;
            }
        }
        // Incorrect answer
        else {

            switch (this.randomNumbers.nextInt(4)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "No. Please try again");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Don't give up");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No. Keep trying");
                    break;
            }
        }

    }

    public void inputAnswer(){

        try{
            this.simulateQuestion();
        }
            catch (NullPointerException e){
                return;
            }

        }
        //method to start the test
        public void startTest(){

            JOptionPane.showMessageDialog(null,"Java Test");
            inputAnswer();

            JOptionPane.showMessageDialog(null, "Result\n"+"Questions answered correctly are:"+this.rightAnswers+"\n"
                    +"Questions answered wrongly are: "+ this.wrongAnswers+"\n"
                    +"Total:"+(((double) this.rightAnswers / (double) this.questions.length) * 100) + "%","marks",1);

            if(((double) this.rightAnswers / (double) this.questions.length) * 100<50)
                JOptionPane.showMessageDialog(null, "Test failed", "Failed", 0);

            else
                JOptionPane.showMessageDialog(null, "Test passed", "passed!", 1);
        }

    }

