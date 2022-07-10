import java.util.Random;
import java.io.*;
import java.util.*;

public class CrapsS {

  public static void main(String[] args){
  Scanner in= new Scanner(System.in);


 int numofRounds; 

           System.out.print("Welcome to Ashley's Game of Craps!");
    System.out.print("\nPlease enter the Number of Rounds you want to play.");  
        numofRounds= Integer.parseInt(args[  + in.nextInt()]);
    
  }
    
  
 
   public static int roll(int DieSides) {
      Random randomNumbers = new Random();
      int DiceRollValue =   
      randomNumbers.nextInt(DieSides)+1;
      return DiceRollValue; 
		}

  public static int shoot(int NumDice, int     
    DieSides){
    int Total= 0;

    for (int i = 0; i < NumDice; i++) {
         Total += roll(DieSides);
    }
    return Total;
}
  public static String round(){
    int ThisRoll=shoot(2, 6);
    int points;
    
    System.out.println ("You rolled a " +     
      ThisRoll);

    
      if (ThisRoll==2 || ThisRoll==3 ||    
      ThisRoll==12){
        return "That's CRAPS! Sorry, you loose.";
  
      } else if (ThisRoll == 7 || ThisRoll 
      ==11){
        return "That's a Natural, you win!!";
       
          }else{
          points = ThisRoll;
            while (true){
            ThisRoll = shoot(2,6);
            
              System.out.println ("You rolled a " + 
              ThisRoll);
              if (ThisRoll == points) {
              return "Congratulations! Point Match, YOU WIN!";
            }
              if (ThisRoll == 7){
              return "Sorry, you lose. Try again!";
                
              }
          }
      
 
    }
}
}