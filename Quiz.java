/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class Quiz {
    Scanner keyboard = new Scanner(System.in);
            int rightAnswers = 0; 
            static String answer1;
            String answer2;
            String answer3;
            String answer4;
            String answer5;
            String answer6;
            String answer7;
            String answer8;
            String answer9;
            String answer10;
            String answer11;
            String answer12;
            String answer13;
            String answer14;
            String answer15;

    public static void main(String[] args) {
        System.out.println("Here comes a randomized quiz.");
        int random = (int)(Math.random()*5 + 1);
        
//        switch (operator) {
//            case "1":
//            question1();
//            break:
//            case "2":
//            question2();
//            break:
//            case "3"
//                    
//        }
            
//        int[]myArray = new int [6];
//            myArray[1] 
         
    }
    public static void question1() {
        System.out.println("Question 1: What is the capital of Djibouti?");
        System.out.println("\tA) Kampala");
        System.out.println("\tB) Luanda");
        System.out.println("\tC) Djibouti City");
        System.out.println("\tA) None of the above");
        answer1 = keyboard.nextLine();
        if (answer1.equals("C")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 1.");
    }
    public void question2() {
        System.out.println("Question 2: Choose the correct spelling.");
        System.out.println("\tA) Hemorage");
        System.out.println("\tB) Hemorrhage");
        System.out.println("\tC) Hemorrhag");
        System.out.println("\tD) None of the above");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("B")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 2.");
}
    public void question3() {
        System.out.println("Question 3: Choose the correct distance between Denver and Sydney.");
        System.out.println("\tA) 7,827 miles");
        System.out.println("\tB) 8,526 miles");
        System.out.println("\tC) 6,928 miles");
        System.out.println("\tD) 8,325 miels");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("D")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 3.");
    }
    public void question4() {
        System.out.println("Question 4: Choose the correct spelling.");
        System.out.println("\tA) Ideosincracy");
        System.out.println("\tB) Idiosyncrasy");
        System.out.println("\tC) Idiosincracy");
        System.out.println("\tD) Aydiosincracy");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");      
        }
        System.out.println("Your score is " + rightAnswers + " out of 4.");
    }
    public void question5() {
        System.out.println("Question 5: What is Java?");
        System.out.println("\tA) A cup of coffee");
        System.out.println("\tB) A piece of cake");
        System.out.println("\tC) A programming language made in January 23 1993");
        System.out.println("\tD) The same as Javascript");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("A")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 5.");
        
    }
    public void question6() {
        System.out.println("Question 6: How big is stanford cmapus?");
        System.out.println("\tA) 7,838 acres");
        System.out.println("\tB) 9,736 acres");
        System.out.println("\tC) 8,180 acres");
        System.out.println("\tD) None of the above");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("C")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 6.");
    }
    public void question7() {
        System.out.println("Question 7: How much does the cheapest 144hz monitor cost? (In USD)");
        System.out.println("\tA) $99,99");
        System.out.println("\tB) $149,99");
        System.out.println("\tC) $129,99");
        System.out.println("\tD) $109,99");
        String answer7 = keyboard.nextLine();
        if (answer7.equals("D")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 7.");
    }
    public void question8() {
        System.out.println("Question 8: What are the 3rd and 4th most subscribed YouTube channels? (not categories. e.g Gaming)");
        System.out.println("\tA) T-Series and MrBeast");
        System.out.println("\tB) 5-Minute Crafts and Cocomelon - Nursery Rhymes");
        System.out.println("\tC) Dude perfect and 5-Minute Crafts");
        System.out.println("\tD) WWE and PewDiePie");
        String answer8 = keyboard.nextLine();
        if (answer8.equals("B")) {
            System.out.println("Correct answer!");
            rightAnswers++;
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 8.");
    }
    public void question9() {
        System.out.println("Question 9: What is the depth of the Mariana Trench? (In feet)");
        System.out.println("\tA) 36,070");
        System.out.println("\tB) 76,039");
        System.out.println("\tC) 12,857");
        System.out.println("\tD) 12,856");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("A")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 9.");
    }
    public void question10() {
        System.out.println("Question 10: What was the world population on Tuesday 25 July at 18:43 and 16 seconds?");
        System.out.println("\tA) 7,720,131,625");
        System.out.println("\tB) 7,720,131,788");
        System.out.println("\tC) 7,720,131,715");
        System.out.println("\tD) 7,720,131,615");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("D")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 10.");
    }
    public void question11() {
        System.out.println("Question 11: Why is water wet.");
        System.out.println("\tA) Because it is composed of hydrogen");
        System.out.println("\tB) Because of it's density");
        System.out.println("\tC) Because it is");
        System.out.println("\tD) None of the above");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("C")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 11.");
    }
    public void question12() {
        System.out.println("Question 12: Where does salt come from?");
        System.out.println("\tA) The sea");
        System.out.println("\tB) The mountains");
        System.out.println("\tC) Rocks");
        System.out.println("\tD) A lab");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("C")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 12.");
    }
    public void question13() {
        System.out.println("Question 13: Should schools in America stop teaching arab numbers?");
        System.out.println("\tA) Yes");
        System.out.println("\tB) No");
        System.out.println("\tC) Maybe");
        System.out.println("\tD) None of the above");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("D")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 13.");
    }
    public void question14() {
        System.out.println("Question 14: How to enable the search bar in Windows 10?");
        System.out.println("\tA) Right click screen > Display settings > Show search box");
        System.out.println("\tB) Right click taskbar > Cortana > Show search box");
        System.out.println("\tC) Right click Windows logo > Show search box");
        System.out.println("\tD) You can't");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("B")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 14.");
    }
    public void question15() {
        System.out.println("Question 15: What is the real Lenny face?");
        System.out.println("\tA) ( ͡° ͜ʖ ͡°)");
        System.out.println("\tB) ( ° ͜ʖ °)");
        System.out.println("\tC)  ͡° ͜ʖ ͡°");
        System.out.println("\tD) None of the above");
        String answer9 = keyboard.nextLine();
        if (answer9.equals("A")) {
            System.out.println("Correct answer!");
            rightAnswers++; 
        }
        else {
            System.out.println("Wrong answer!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 15.");
    }
    
    
    
}
        
       