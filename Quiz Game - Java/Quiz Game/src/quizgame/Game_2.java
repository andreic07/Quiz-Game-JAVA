package quizgame;

import java.io.*;
import java.util.Scanner;

public class Game_2 {

    static void theGame_2() {
                              //0   1   2   3   4   5//
        String[] answers = {"A", "B", "C", "a", "b", "c"};
        int counter2 = 0;
///Question 1
        System.out.println("Question 1: \n");
        System.out.println("How many breeds of elephant are there?");
        System.out.println("A.Three");
        System.out.println("B.Five");
        System.out.println("C.Ten\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer = new Scanner(System.in);
        char u_ans = Answer.next().charAt(0);
        String u_ans_f = String.valueOf(u_ans);
        while (!u_ans_f.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans = Answer.next().charAt(0);
            u_ans_f = String.valueOf(u_ans);
        }

        if (u_ans_f.equals(answers[0]) || u_ans_f.equals(answers[3])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 2
        System.out.println("Question 2: \n");
        System.out.println("Which Disney Princess has the least amount of screen time?");
        System.out.println("A.Ariel from The Little Mermaid");
        System.out.println("B.Snow White from Snow White and the Seven Dwarfs");
        System.out.println("C.Aurora from Sleeping Beauty\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer2 = new Scanner(System.in);
        char u_ans2 = Answer2.next().charAt(0);
        String u_ans_f2 = String.valueOf(u_ans2);
        while (!u_ans_f2.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans2 = Answer2.next().charAt(0);
            u_ans_f2 = String.valueOf(u_ans2);
        }

        if (u_ans_f2.equals(answers[2]) || u_ans_f2.equals(answers[5])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 3
        System.out.println("Question 3: \n");
        System.out.println("What is Shakespeare's shortest play?");
        System.out.println("A.Hamlet");
        System.out.println("B.The Comedy of Errors");
        System.out.println("C.Othello\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer3 = new Scanner(System.in);
        char u_ans3 = Answer3.next().charAt(0);
        String u_ans_f3 = String.valueOf(u_ans3);
        while (!u_ans_f3.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans3 = Answer3.next().charAt(0);
            u_ans_f3 = String.valueOf(u_ans3);
        }

        if (u_ans_f3.equals(answers[1]) || u_ans_f3.equals(answers[4])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 4
        System.out.println("Question 4: \n");
        System.out.println("What is Prince William's full name?");
        System.out.println("A.William Arthur Henry Felix Louis Windsor");
        System.out.println("B.William Arthur Henry Philip Louis Windsor");
        System.out.println("C.William Arthur Philip Louis Windsor\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer4 = new Scanner(System.in);
        char u_ans4 = Answer4.next().charAt(0);
        String u_ans_f4 = String.valueOf(u_ans4);
        while (!u_ans_f4.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans4 = Answer4.next().charAt(0);
            u_ans_f4 = String.valueOf(u_ans4);
        }

        if (u_ans_f4.equals(answers[2]) || u_ans_f4.equals(answers[5])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 5
        System.out.println("Question 5: \n");
        System.out.println("For two points, what's the average height of males in the UK?");
        System.out.println("A.5ft 6in");
        System.out.println("B.5ft 3in");
        System.out.println("C.5ft 9in\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer5 = new Scanner(System.in);
        char u_ans5 = Answer5.next().charAt(0);
        String u_ans_f5 = String.valueOf(u_ans5);
        while (!u_ans_f5.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans5 = Answer5.next().charAt(0);
            u_ans_f5 = String.valueOf(u_ans5);
        }

        if (u_ans_f5.equals(answers[2]) || u_ans_f5.equals(answers[5])) {
            counter2+=2;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 6
        System.out.println("Question 6: \n");
        System.out.println("What is the capital of St. Lucia?");
        System.out.println("A.Castries");
        System.out.println("B.Laborie");
        System.out.println("C.Micoud\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer6 = new Scanner(System.in);
        char u_ans6 = Answer6.next().charAt(0);
        String u_ans_f6 = String.valueOf(u_ans6);
        while (!u_ans_f6.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans6 = Answer6.next().charAt(0);
            u_ans_f6 = String.valueOf(u_ans6);
        }

        if (u_ans_f6.equals(answers[0]) || u_ans_f6.equals(answers[3])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 7
        System.out.println("Question 7: \n");
        System.out.println("What year did Vincent Van Gogh die?");
        System.out.println("A.1983");
        System.out.println("B.1980");
        System.out.println("C.1976\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer7 = new Scanner(System.in);
        char u_ans7 = Answer7.next().charAt(0);
        String u_ans_f7 = String.valueOf(u_ans7);
        while (!u_ans_f7.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans7 = Answer7.next().charAt(0);
            u_ans_f7 = String.valueOf(u_ans7);
        }

        if (u_ans_f7.equals(answers[1]) || u_ans_f7.equals(answers[4])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 8
        System.out.println("Question 8: \n");
        System.out.println("What's the capital city of Tanzania?");
        System.out.println("A.Dodoma");
        System.out.println("B.Moshi");
        System.out.println("C.Songea\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer8 = new Scanner(System.in);
        char u_ans8 = Answer8.next().charAt(0);
        String u_ans_f8 = String.valueOf(u_ans8);
        while (!u_ans_f8.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans8 = Answer8.next().charAt(0);
            u_ans_f8 = String.valueOf(u_ans8);
        }

        if (u_ans_f8.equals(answers[0]) || u_ans_f8.equals(answers[3])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
/// Question 9
        System.out.println("Question 9: \n");
        System.out.println("What is Joe Biden's middle name?");
        System.out.println("A.Arthur");
        System.out.println("B.Robin");
        System.out.println("C.Robinette\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer9 = new Scanner(System.in);
        char u_ans9 = Answer9.next().charAt(0);
        String u_ans_f9 = String.valueOf(u_ans9);
        while (!u_ans_f9.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans9 = Answer9.next().charAt(0);
            u_ans_f9 = String.valueOf(u_ans9);
        }

        if (u_ans_f9.equals(answers[2]) || u_ans_f9.equals(answers[5])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 10
        System.out.println("Question 10: \n");
        System.out.println("To the closest second, what is the world record for the world's longest fart?");
        System.out.println("A.3 min");
        System.out.println("B.2 min 45 sec");
        System.out.println("C.3 min 25 sec\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer10 = new Scanner(System.in);
        char u_ans10 = Answer10.next().charAt(0);
        String u_ans_f10 = String.valueOf(u_ans10);
        while (!u_ans_f10.matches("[a-zA-Z]+")) {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans10 = Answer10.next().charAt(0);
            u_ans_f10 = String.valueOf(u_ans10);
        }

        if (u_ans_f10.equals(answers[1]) || u_ans_f10.equals(answers[4])) {
            counter2++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        } else {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
        if(counter2>=8) {
///
///Bonus Question 1
            System.out.println("BONUS Question 1: \n");
            System.out.println("Who designed the Eiffel Tower?");
            System.out.println("A.Pierre Eiffel");
            System.out.println("B.Jack Eiffel");
            System.out.println("C.Gustave Eiffel\n");
            System.out.println("Answer the question above: \n");

            Scanner Answer11 = new Scanner(System.in);
            char u_ans11 = Answer11.next().charAt(0);
            String u_ans_f11 = String.valueOf(u_ans11);
            while (!u_ans_f11.matches("[a-zA-Z]+")) {
                System.out.println("You entered a wrong character.Please type A,B or C.");
                System.out.println("Try again: \n");
                u_ans11 = Answer11.next().charAt(0);
                u_ans_f11 = String.valueOf(u_ans11);
            }

            if (u_ans_f11.equals(answers[2]) || u_ans_f11.equals(answers[5])) {
                counter2 += 10;
                System.out.println("Your answer is correct!\n");
                System.out.println("Press [ENTER] to continue.");
                Quiz.promptENTER();
            } else {
                System.out.println("WRONG\n");
                System.out.println("Press [ENTER] to continue with the next question.");
                Quiz.promptENTER();
            }
///
///Bonus Question 2
            System.out.println("BONUS Question 2: \n");
            System.out.println("Where would you find the oldest pot plant in the world?");
            System.out.println("A.Kew Gardens");
            System.out.println("B.Brooklyn Botanic Garden");
            System.out.println("C.Villa D'este Garden\n");
            System.out.println("Answer the question above: \n");

            Scanner Answer12 = new Scanner(System.in);
            char u_ans12 = Answer12.next().charAt(0);
            String u_ans_f12 = String.valueOf(u_ans12);
            while (!u_ans_f12.matches("[a-zA-Z]+")) {
                System.out.println("You entered a wrong character.Please type A,B or C.");
                System.out.println("Try again: \n");
                u_ans12 = Answer12.next().charAt(0);
                u_ans_f12 = String.valueOf(u_ans12);
            }

            if (u_ans_f12.equals(answers[0]) || u_ans_f12.equals(answers[3])) {
                counter2 += 15;
                System.out.println("Your answer is correct!\n");
                System.out.println("Press [ENTER] to continue.");
                Quiz.promptENTER();
            } else {
                System.out.println("WRONG\n");
                System.out.println("Press [ENTER] to continue with the next question.");
                Quiz.promptENTER();
            }
        }

        counter2=(counter2*100)+(counter2/2)*30;
        System.out.println("Your Round [2] score is: "+counter2+"p\n");
        if(counter2==4140){
            System.out.println("-----------------------------------");
            System.out.println("YOU GOT THE MAX SCORE FOR ROUND [2]");
            System.out.println("-----------------------------------");
        }
        try{
                FileWriter score2 = new FileWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt", true);
                score2.write(" " + counter2);
                score2.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
