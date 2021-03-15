package quizgame;

import java.io.*;
import java.util.Scanner;

public class Game {

    static void theGame()
    {                    //0   1   2   3   4   5//
        String[] answers={"A","B","C","a","b","c"};
        int counter=0;
///Question 1
        System.out.println("Question 1: Geography \n");
        System.out.println("What is the capital of Chile?");
        System.out.println("A.Ben Nevis");
        System.out.println("B.Barcelona");
        System.out.println("C.Santiago\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer=new Scanner(System.in);
        char u_ans=Answer.next().charAt(0);
        String u_ans_f=String.valueOf(u_ans);
        while(!u_ans_f.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans=Answer.next().charAt(0);
            u_ans_f=String.valueOf(u_ans);
        }

        if (u_ans_f.equals(answers[2]) || u_ans_f.equals(answers[5])) {
                counter++;
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
        System.out.println("Question 2: History \n");
        System.out.println("Which English city was once known as Duroliponte?");
        System.out.println("A.Bangor");
        System.out.println("B.Cambridge");
        System.out.println("C.Bath\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_2=new Scanner(System.in);
        char u_ans_2=Answer_2.next().charAt(0);
        String u_ans_f2=String.valueOf(u_ans_2);
        while(!u_ans_f2.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_2=Answer_2.next().charAt(0);
            u_ans_f2=String.valueOf(u_ans_2);
        }
        if(u_ans_f2.contains(answers[1]) || u_ans_f2.contains(answers[4]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 3

        System.out.println("Question 3: Sport-Question \n");
        System.out.println("What are the five colours of the Olympic rings?");
        System.out.println("A.blue, black, yellow, green and red");
        System.out.println("B.blue, yellow, black, green and red");
        System.out.println("C.black, green, yellow, blue and red\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_3=new Scanner(System.in);
        char u_ans_3=Answer_3.next().charAt(0);
        String u_ans_f3=String.valueOf(u_ans_3);
        while(!u_ans_f3.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_3=Answer_3.next().charAt(0);
            u_ans_f3=String.valueOf(u_ans_3);
        }
        if(u_ans_f3.contains(answers[1]) ||u_ans_f3.contains(answers[4]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 4
        System.out.println("Question 4: Politics Question \n");
        System.out.println("Who was the only British Prime Minister to be assassinated?");
        System.out.println("A.Spencer Perceval");
        System.out.println("B.William Pitt the Younger");
        System.out.println("C.George Grenville\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_4=new Scanner(System.in);
        char u_ans_4=Answer_4.next().charAt(0);
        String u_ans_f4=String.valueOf(u_ans_4);
        while(!u_ans_f4.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_4=Answer_4.next().charAt(0);
            u_ans_f4=String.valueOf(u_ans_4);
        }
        if(u_ans_f4.contains(answers[0]) ||u_ans_f4.contains(answers[3]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 5
        System.out.println("Question 5: Food and drink Question \n");
        System.out.println("Which nuts are used in marzipan?");
        System.out.println("A.Breadnut");
        System.out.println("B.Hazelnuts");
        System.out.println("C.Almonds\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_5=new Scanner(System.in);
        char u_ans_5=Answer_5.next().charAt(0);
        String u_ans_f5=String.valueOf(u_ans_5);
        while(!u_ans_f5.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_5=Answer_5.next().charAt(0);
            u_ans_f5=String.valueOf(u_ans_5);
        }
        if(u_ans_f5.contains(answers[0]) ||u_ans_f5.contains(answers[3]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 6
        System.out.println("Question 6: TV Question \n");
        System.out.println("What is the capital of Westeros in Game of Thrones?");
        System.out.println("A.Old Valyria");
        System.out.println("B.Asshai");
        System.out.println("C.King’s Landing\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_6=new Scanner(System.in);
        char u_ans_6=Answer_6.next().charAt(0);
        String u_ans_f6=String.valueOf(u_ans_6);
        while(!u_ans_f6.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_6=Answer_6.next().charAt(0);
            u_ans_f6=String.valueOf(u_ans_6);
        }
        if(u_ans_f6.contains(answers[2]) ||u_ans_f6.contains(answers[5]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 7
        System.out.println("Question 7: Music Question \n");
        System.out.println("Who is the only singer to have ever performed more than one James Bond theme song?");
        System.out.println("A.Adele");
        System.out.println("B.Shirley Bassey");
        System.out.println("C.John Barry\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_7=new Scanner(System.in);
        char u_ans_7=Answer_7.next().charAt(0);
        String u_ans_f7=String.valueOf(u_ans_7);
        while(!u_ans_f7.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_7=Answer_7.next().charAt(0);
            u_ans_f7=String.valueOf(u_ans_7);
        }
        if(u_ans_f7.contains(answers[1]) ||u_ans_f7.contains(answers[4]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 8
        System.out.println("Question 8: Football Question \n");
        System.out.println("Which year was the Premier League founded?");
        System.out.println("A.1990");
        System.out.println("B.1992");
        System.out.println("C.1998\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_8=new Scanner(System.in);
        char u_ans_8=Answer_8.next().charAt(0);
        String u_ans_f8=String.valueOf(u_ans_8);
        while(!u_ans_f8.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_8=Answer_8.next().charAt(0);
            u_ans_f8=String.valueOf(u_ans_8);
        }
        if(u_ans_f8.contains(answers[1]) ||u_ans_f8.contains(answers[4]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 9
        System.out.println("Question 9: Celebrity Questions \n");
        System.out.println("Which singer was known amongst other things as 'The King of Pop'?");
        System.out.println("A.Michael Jackson");
        System.out.println("B.Charlie Puth");
        System.out.println("C.Adam Levine\n");
        System.out.println("Answer the question above: ");

        Scanner Answer_9=new Scanner(System.in);
        char u_ans_9=Answer_9.next().charAt(0);
        String u_ans_f9=String.valueOf(u_ans_9);
        while(!u_ans_f9.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_9=Answer_9.next().charAt(0);
            u_ans_f9=String.valueOf(u_ans_9);
        }
        if(u_ans_f9.contains(answers[0]) ||u_ans_f9.contains(answers[3]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }
///
///Question 10
        System.out.println("Question 10: Food and drink Question \n");
        System.out.println("Which country is the origin of the cocktail Mojito?");
        System.out.println("A.Cuba");
        System.out.println("B.Greece");
        System.out.println("C.Spain\n");
        System.out.println("Answer the question above: \n");

        Scanner Answer_10=new Scanner(System.in);
        char u_ans_10=Answer_10.next().charAt(0);
        String u_ans_f10=String.valueOf(u_ans_10);
        while(!u_ans_f10.matches("[a-zA-Z]+"))
        {
            System.out.println("You entered a wrong character.Please type A,B or C.");
            System.out.println("Try again: \n");
            u_ans_10=Answer_10.next().charAt(0);
            u_ans_f10=String.valueOf(u_ans_10);
        }
        if(u_ans_f10.contains(answers[0]) || u_ans_f10.contains(answers[3]))
        {
            counter++;
            System.out.println("Your answer is correct!\n");
            System.out.println("Press [ENTER] to continue.");
            Quiz.promptENTER();
        }
        else
        {
            System.out.println("WRONG\n");
            System.out.println("Press [ENTER] to continue with the next question.");
            Quiz.promptENTER();
        }


        if(counter>7) {


///
///BONUS QUESTION 1 [TRUE/FALSE]
            System.out.println("[BONUS] Question 1: TRUE or FALSE \n");
            System.out.println("President Theodore Roosevelt's son was called Kermit");
            System.out.println("A.TRUE");
            System.out.println("B.FALSE\n");
            System.out.println("Answer the question above: \n");

            Scanner Answer_11 = new Scanner(System.in);
            char u_ans_11 = Answer_11.next().charAt(0);
            String u_ans_f11 = String.valueOf(u_ans_11);
            while (!u_ans_f11.matches("[a-zA-Z]+")) {
                System.out.println("You entered a wrong character.Please type A or B");
                System.out.println("Try again: \n");
                u_ans_11 = Answer_11.next().charAt(0);
                u_ans_f11 = String.valueOf(u_ans_11);
            }
            if (u_ans_f11.contains(answers[0]) || u_ans_f11.contains(answers[3])) {
                counter+=5;
                System.out.println("Your answer is correct!\n");
                System.out.println("Press [ENTER] to continue.");
                Quiz.promptENTER();
            } else {
                System.out.println("WRONG\n");
                System.out.println("Press [ENTER] to continue with the next question.");
                Quiz.promptENTER();
            }
///
///BONUS QUESTION 2 [TRUE/FALSE]
            System.out.println("[BONUS] Question 2: TRUE or FALSE \n");
            System.out.println(" Vietnamese is an official language in Canada");
            System.out.println("A.TRUE");
            System.out.println("B.FALSE\n");
            System.out.println("Answer the question above: \n");

            Scanner Answer_12 = new Scanner(System.in);
            char u_ans_12 = Answer_12.next().charAt(0);
            String u_ans_f12 = String.valueOf(u_ans_12);
            while (!u_ans_f12.matches("[a-zA-Z]+")) {
                System.out.println("You entered a wrong character.Please type A or B");
                System.out.println("Try again: \n");
                u_ans_12 = Answer_12.next().charAt(0);
                u_ans_f12 = String.valueOf(u_ans_12);
            }
            if (u_ans_f12.contains(answers[1]) || u_ans_f12.contains(answers[4])) {
                counter+=10;
                System.out.println("Your answer is correct!\n");
                System.out.println("Press [ENTER] to continue.");
                Quiz.promptENTER();
            } else {
                System.out.println("WRONG\n");
                System.out.println("Press [ENTER] to continue with the next question.");
                Quiz.promptENTER();
            }
///END OF QUESTIONS

        }
        //score calculator:
        counter=(counter*100)+(counter/2)*30;
        System.out.println("Your Round [1] score is: "+counter+"p\n");
        if(counter==2860){
            System.out.println("-----------------------------------");
            System.out.println("YOU GOT THE MAX SCORE FOR ROUND [1]");
            System.out.println("-----------------------------------");
        }

        try{
                FileWriter score = new FileWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt", true);
                score.write(" " + counter);
                score.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
