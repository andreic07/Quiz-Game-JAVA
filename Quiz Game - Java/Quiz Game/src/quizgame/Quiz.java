package quizgame;


import java.io.*;
import java.util.Scanner;

public class Quiz {

    static void Menu(){
        System.out.println("-----------------------------");
        System.out.println("|       Quiz      Game       |");
        System.out.println("-----------------------------");
        System.out.println("  Welcome to the QUIZ game!  \n");
        System.out.println("1.Start Game\n");
        System.out.println("2.View Score\n");
        System.out.println("3.Compare Scores\n");
        System.out.println("4.Reset GAME (DELETE ALL SCORES)\n");
        System.out.println("5.HELP\n");
        System.out.println("6.QUIT\n");

    }
    public static void promptENTER() {
        Scanner scanKEY = new Scanner(System.in);
        scanKEY.nextLine();
    }
    static void StartGame(){

        System.out.println("You will answer 20 general knownledge questions divided in two rounds by typing A, B or C\n");
        System.out.println("After the first round, there will be a second round with HARD QUESTIONS.");
        System.out.println("Each round has 2 BONUS questions, accesible to those who answer corectly to more than 7 questions.\n");
        System.out.println("Those 2 bonus questions will give you more points than the others.");
        System.out.println("After the game is complete, you will get your final score.\nYou can compare your score with the others in the menu section.");
        System.out.println("Good Luck!\n");
        System.out.println("Round [1]\n");
        System.out.println("Press [ENTER] to start");
        promptENTER();
    }

    static void RunMenu(){
        Menu();
        int choice;
        Scanner User_Input=new Scanner(System.in);
        System.out.println("Please chose one option: ");
        choice=User_Input.nextInt();

        switch(choice){
            case 1:
                Scanner User_Name=new Scanner(System.in);
                System.out.println("Your name/nickname: ");
                String Name=User_Name.nextLine();
                while(!Name.matches("[a-zA-Z0-9]+"))
                {
                    System.out.println("Please use only letters and/or numbers !\n");
                    System.out.println("Your name/nickname: ");
                    Name=User_Name.nextLine();
                }
                try {
                    File n_check = new File("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt");
                    BufferedReader checkn = new BufferedReader(new FileReader(n_check));
                    String n_c;
                    while ((n_c = checkn.readLine()) != null) {
                        String[] n_c_2 = n_c.split(" ");
                        String NameC = n_c_2[0];
                        while (NameC.equals(Name)) {
                            System.out.println("Name/Nickname is used by another person.\nTry again.");
                            System.out.println("Your name/nickname: ");
                            Name=User_Name.nextLine();
                        }
                    }
                }catch (IOException ex43){
                    ex43.printStackTrace();
                    }

                StartGame();
                try{
                    FileWriter name=new FileWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt",true);
                    name.append("\n");
                    name.write(Name);
                    name.close();

                }catch (IOException e){
                    e.printStackTrace();
                }
                Game.theGame();

                System.out.println("You will now proceed to the Round [2].\n");
                System.out.println("Good Luck!");
                System.out.println("Round [2]\n");
                System.out.println("Press [ENTER] to start.");
                promptENTER();
                Game_2.theGame_2();
                promptENTER();
                LineDeleter.LineDeleter1();
                LineDeleter.LineDeleter2();
            try {
                File f_score = new File("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt");
                BufferedReader f_score2 = new BufferedReader(new FileReader(f_score));
                int scoref = 0;
                String s_c;
                while ((s_c = f_score2.readLine()) != null) {
                    String[] s_c_2 = s_c.split(" ");
                    String Name1 = s_c_2[0];
                    String Round1 = s_c_2[1];
                    String Round2 = s_c_2[2];
                    if(Name1.equals(Name)){
                    scoref = (Integer.parseInt(Round1)) + (Integer.parseInt(Round2));
                    System.out.println("Your final score is: " + scoref);
                }
                }

                FileWriter fscoreW=new FileWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\FinalScores.txt",true);
                fscoreW.append("\n");
                fscoreW.write(Name+" "+scoref);
                fscoreW.close();
                LineDeleter.LineDeleter2();
            }catch (IOException ex){
                ex.printStackTrace();
            }
                System.out.println("Press [ENTER] to get back to the main menu.");

            promptENTER();
                break;
            case 2:

                Scanner User_NameCH=new Scanner(System.in);
                System.out.println("Your name/nickname: ");
                String NameCH=User_NameCH.nextLine();
                while(!NameCH.matches("[a-zA-Z0-9]+"))
                {
                    System.out.println("Please use only letters and/or numbers !\n");
                    System.out.println("Your name/nickname: ");
                    NameCH=User_NameCH.nextLine();
                }
                try {
                    File your_score = new File("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\FinalScores.txt");
                    BufferedReader your_score2 = new BufferedReader(new FileReader(your_score));
                    String s_c3;
                    while ((s_c3 = your_score2.readLine()) != null) {
                        String[] s_c_3 = s_c3.split(" ");
                        String Name1 = s_c_3[0];
                        String FinalScore = s_c_3[1];
                        if (Name1.equals(NameCH)) {
                            System.out.println("Hello " + Name1 + " !");
                            System.out.println("Your score is: " + FinalScore);
                            System.out.println("\nPress[ENTER] to get back to the main menu.");
                            promptENTER();

                        }


                    }
                    System.out.println(NameCH + " is not in our records.If you think this is an error, try again.");
                    System.out.println("NOTE: Keep in mind that the game might have just been recently RESETED.");
                    System.out.println("Press [ENTER] to get back to the main menu.");
                    promptENTER();
                }catch (IOException ex4){
                    ex4.printStackTrace();
                }

                break;
            case 3:
                LineDeleter.LineDeleter2();
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\FinalScores.txt"))) {
                    String line;
                    System.out.println("PRESS [ENTER] TO SEE THE SCOREBOARD");
                    promptENTER();
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                }catch (IOException ex2){
                    ex2.printStackTrace();
                }
                System.out.println("\nPress [ENTER] to get back to the main menu.");
                promptENTER();
                break;
            case 4:
                int pass=2233;
                System.out.println("WARNING!\n");
                System.out.println("By continuing you will delete the entire scoreboard.");
                System.out.println("You need a password in order to do that.\nIf you don't know the password it means you are not allowed to do that and you will return to the main menu.\nThank you!");
                Scanner cred=new Scanner(System.in);
                System.out.println("Please press [ENTER] to continue");
                promptENTER();
                System.out.println("Type the password: \n");
              try {
                  int credp = cred.nextInt();
                  if (credp == pass) {
                      PrintWriter pw = new PrintWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\FinalScores.txt");
                      PrintWriter pw2 = new PrintWriter("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Score.txt");
                      pw.close();
                      pw2.close();
                  } else {
                      System.out.println("Wrong PASSWORD.\n\n");
                      return;
                  }
              }catch (IOException credEX){
                  credEX.printStackTrace();
              }


                break;
            case 5:
                System.out.println("You need help ?\nThis is the right place!");
                System.out.println("-----------------------------------------");
                System.out.println("Please press [ENTER] to read the HELP file.");
                System.out.println("-------------------------------------------\n");
                promptENTER();
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\remhq\\Documents\\Quiz Game - Java\\Quiz Game\\src\\quizgame\\Help.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                }catch (IOException ex2){
                    ex2.printStackTrace();
                }
                System.out.println("\nPress [ENTER] to get back to the main menu.");
                promptENTER();
                break;
            case 6:
                System.out.println("Thank you for playing !\nPlease press [ENTER] to EXIT.");
                promptENTER();
                System.exit(6);
                break;
            default:
                System.out.println("ERROR: Please chose a number between [1-6].Try again.");
        }
    }




}
