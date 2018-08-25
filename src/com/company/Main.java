package com.company;
         import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int computersNumber;
        computersNumber = (int) (Math.random() * 99 + 1);
        Scanner typeytype = new Scanner(System.in);
        int userGuess;
        do {
            System.out.print("What's Your Guess? ");
            userGuess = typeytype.nextInt();
            System.out.println("Your Guess Was " + userGuess);
            if (userGuess == computersNumber)
                System.out.println("Your Guess is correct!!!!!!!!!!");
            else if (userGuess < computersNumber)
                System.out
                        .println("Your Guess is lower than my number");
            else if (userGuess > computersNumber)
                System.out
                        .println("Your Guess is Higher Than My Number");
        }while (userGuess !=computersNumber);

    }
}
