
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner ui=new Scanner(System.in);
        int num=(int)(Math.random()*10)+1;
        int unum=0;
        int count=0;
        System.out.println("Welcome to the Guessing Game");
        System.out.println("Guess the number");
        
        while(unum!=num){
            int j=unum;
         unum=ui.nextInt();
        
         if(unum==j){
            count--;
             System.out.println("You already guessed this Number,Please try again");
            
            }
        if(unum==num){
        count++;
        System.out.println("Congratulations! You guessed it right in "+count+"guesses");
    }
        else if(unum<num){
            count++;
        System.out.println("Its too small");
    }
    else if(unum>num){
    count++;
    System.out.println("Its too big");
    }}
    
    
}
}
