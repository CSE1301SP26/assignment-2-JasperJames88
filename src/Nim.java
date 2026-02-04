import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The game Nim is played so that you start with 10 sticks. You can either pick 1 stick or 2 sticks to remove from the total on your turn. The person to remove the last stick (or two) wins. How many sticks would you like to start the game with?");
        int sticks = input.nextInt();
         boolean userTurn;
        while (sticks >0){
             userTurn=true;
            System.out.println("The number of sticks remaining is "+sticks+". How many sticks do you want to take?");
            int userSticks = input.nextInt();
            if(userTurn=true){
                System.out.println("User Wins!");
            }else{
                System.out.println("User Lost :(");
            }
            while (userSticks !=1 && userSticks != 2){
                System.out.println("You may only print 1 or 2 sticks. Please type 1 or 2.");
                userSticks = input.nextInt();
            }
            if (sticks ==1 && userSticks !=1){
            System.out.println("You took one stick because there was only one remaining");
            userSticks = 1;
        }

        
            sticks -= userSticks;
            System.out.println("The number of sticks remaining is "+sticks+".");
            userTurn = false;
            int num=(int)(Math.random()*2)+1;
            if (sticks ==1 && num !=1){
                System.out.println("The computer can only print one stick because there is only one stick remaining");
                num =1;
            }
            sticks = sticks-num;
            System.out.println("The computer took "+num+" sticks.");
            


        }
    }
}