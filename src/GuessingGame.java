import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        int guess=0;
        int num=(int)(Math.random()*100+1);
        int guessCounter=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Hello user! What is your name?");
        String userName= input.nextLine();
        System.out.println("Hello "+ userName+ ", nice to meet you!");
        System.out.println("OKAY! "+ userName+ " I will be generating a random number 1-100 and you will have to guess it!");
        System.out.println(userName+" what is your first guess?");
        guess= input.nextInt();
        while (guess!=num)
        {
         int guessNumDiff=guess-num;
            if (guessNumDiff > 0) {
                System.out.println("The number is smaller than that~~");
                guess=input.nextInt();
            }
            if(guessNumDiff<0)
            {
                System.out.println("The number is bigger than that~~");
                guess=input.nextInt();
            }
            guessCounter++;
        }
        System.out.println("CONGRADULATIONS! YOU GOT IT! "+userName+ " The number was: "+ num);
        System.out.println("That took you "+ guessCounter+" guesses");
    }
}
