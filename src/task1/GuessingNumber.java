/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Govind Kumar
 */
public class GuessingNumber {
    public int generateRandom(int max, int min){
        int randomNum = (int) (Math.random()*(max - min + 1)+ min);
        return randomNum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GuessingNumber randomgenerate = new GuessingNumber();
        
        int totalAttempts = 0;
        int win = 0;
        
        while(true){
            System.out.println("Enter Maximum Number : ");
            int max = scanner.nextInt();
            System.out.println("Enter Minimum Number : ");
            int min = scanner.nextInt();
            
            int number = randomgenerate.generateRandom(max, min);
            int attempts = 0;
            
            while(true){
                System.out.println("\nGuess a number between "+max+" and "+min);
                int guessNumber = scanner.nextInt();
                
                attempts++;
                
                if(guessNumber > number){
                    System.out.println("Guess is too high...");
                }else if(guessNumber < number){
                    System.out.println("Guess is too low");
                }else{
                    System.out.println("WOW! Guess is Correct...\n");
                    win++;
                    break;
                }
            }
            
            totalAttempts += attempts;
            System.out.println("Attempts = "+attempts);
            System.out.println("Wins = "+win);
           
            double winRate =  (win * 100) / totalAttempts ;
            
            System.out.println("Your win rate is "+winRate+"%");
            
            System.out.println("\nDo you wanna play again (yes/no) : -");
            String playAgain = scanner.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                scanner.close();
                System.exit(0);
            }
            scanner.nextLine();
        }
    }
    
}
