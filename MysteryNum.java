//TASK 1
//MYSTERY NUMBER GUESSER
import java.util.Scanner;
public class MysteryNum {
    static void play(int randnum,int count,int times){
        while (times>0){
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Your guess:");
            int num=obj.nextInt();
            if (num==randnum)
            {
                System.out.println("Hurrah! You guessed right!");
                count+=1;
                break;
            }
            else if (num>randnum)
            {
                System.out.println("Guessed number is greater than the mystery number");
                count+=1;
                times--;
                System.out.println("You have "+times+" moves left");
            }
            else if (num<randnum)
            {
                System.out.println("Guessed number is smaller than mystery number");
                count+=1;
                times--;
                System.out.println("You have "+times+" moves left");
            }
            else
            {
                System.out.println("Enter your guesses only between 1 to 100");
                count+=1;
            }
        }
        //Printing the final outputs
        System.out.println("You guessed in "+count+" moves");
        System.out.println("You scored "+times*5+" points");
        Scanner objName = new Scanner(System.in);
        System.out.println("\nIf you want to play again enter 1");
        int playAgain=objName.nextInt();
        if (playAgain==1){
            randnum= (int) Math.round(Math.random()*100);
            count=0;
            times=20;
            play(randnum, count, times);
        }
        else{
            System.out.println("Thanks for playing!");
        }
    }

    //MAIN FUNCTION
    public static void main(String[] args) {
        int randnum= (int) Math.round(Math.random()*100);
        //int randnum=10;
        int count=0;
        int times=20;
        System.out.println("Guess a number between 1 to 100!");
        System.out.println("You have 20 moves with total of 100 points");
        System.out.println("Each wrong guess costs 5 points. So inorder to have more points try to guess numbers as quick as possible");
        play(randnum,count,times);
    }
}