import java.util.Random;
import java.io.*;
import java.util.*;

public class Craps {

  public static void main(String[] args){

    int numofRounds = Integer.parseInt(args[0]);
    for (int i = 1; i <= numofRounds; i++){
      System.out.println(round());
    }
  
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