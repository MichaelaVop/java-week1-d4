import java.util.Scanner;
import java.lang.Math;


public class ScissorRockPap {

    public static void main(String [] args) {

        /* generate a number 0, 1 or 2 for the computer
        set scanner to get input from user
        set rules to compare a win
        */
        // scissor = 0, rock = 1, paper = 2
        
        byte computer = (byte)(Math.random() * 3);
        System.out.println("computer choice" + computer);

        Scanner input = new Scanner(System.in);
        System.out.println("Choose 0, 1 or 2 for scissor(0), rock(1) or paper(2): ");
        byte user = input.nextByte();

        int computerWon = 0;
        int userWon = 0;

        while (!(computerWon == 2 || userWon ==2)) {

        if (computer == user) {
            switch (computer) {
                case 0: System.out.println("The computer is scissor. You are scissor too. It is a draw.");
                break;
                case 1: System.out.println("The computer is rock. You are rock too. It is a draw.");
                break;
                case 2: System.out.println("The computer is paper. You are paper too. It is a draw.");
                break;
            }
        } else if (computer == 0 && user == 1) {
            System.out.println("The computer is scissor. You are rock. You won.");
            userWon++;
        } else if (computer == 0 && user == 2) {
            System.out.println("The computer is scissor. You are paper. You lost.");
            computerWon++;
        } else if (computer == 1 && user == 0) {
            System.out.println("The computer is rock. You are scissor. You lost.");
            computerWon++;
        } else if (computer == 1 && user == 2) {
            System.out.println("The computer is rock. You are paper. You won.");
            userWon++;
        } else if (computer == 2 && user == 0) {
            System.out.println("The computer is paper. You are scissor. You won.");
            userWon++;
        } else if (computer == 2 && user == 1) {
            System.out.println("The computer is paper. You are rock. You lost.");
            computerWon++;
        }  
        System.out.println("Your wins: " + userWon);
        System.out.println("Computer wins: " + computerWon);
    }
       
    if (computerWon > userWon) { 
        System.out.println("The computer wins, end of the game.");
    } else {
        System.out.println("You win, end of the game.");
    }


    }
}