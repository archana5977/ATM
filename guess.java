
package s1;

import java.util.Scanner;


public class guess {
    public static void main (String[] args){
        int ans=(int)(Math.random()*100)+1; //generate a random number between 1 to 100
        int i=5;
        Scanner scan =new Scanner(System.in); 
        boolean guess_correctly=false;
        System.out.println("I am thinking of a number 1 to 100 \nYou have 5 chance to guess the number ");
        while(i>0){
        System.out.println("Enter your guess number:");
        int gs=scan.nextInt();
        if(gs==ans){
        System.out.println("You correctly guessed the number \nCongratualation \nYou win!!!!!!");
        break;
        }
        else if(gs>ans){
        System.out.println("Your guess is too high \nYour left attempt is:" +(i-1));
        i--;
        }
        else{
        System.out.println("Your guess is too low \nYour left attempt is:" + (i-1));
        i--;
        }
        if(guess_correctly==false)        
        {
         System.out.println("You ran out attempt. \nYou lose!! \nTry Once Again!!!"); 
        }
       
        }
        }
    }


         
       
        
        
    
    
