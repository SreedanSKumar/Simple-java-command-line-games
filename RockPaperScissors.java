import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		int a;
		int player;
		int i=0;
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println("------------------------------------------");
		Random random=new Random();
		int computer;
		while(i<=10)
		{
			System.out.println("Choose your move! 1 for Rock, 2 for Paper and 3 for Scissors");
			System.out.println("------------------------------------------");
			player=scn.nextInt();
			computer=random.nextInt(4);
			if(computer==player)
			{
				System.out.println("That's a tie");
			}
			else if(computer==1 && player==2)
			{
				System.out.println("Computer chose Rock");
				System.out.println("You Win!!!");
			}
			else if(computer==1 && player==3)
			{
				System.out.println("Computer chose Rock");
				System.out.println("You lose");
			}
			else if(computer==2 && player==1)
			{
				System.out.println("Computer chose Paper");
				System.out.println("You lose");
			}
			else if(computer==2 && player==3)
			{
				System.out.println("Computer chose Paper");
				System.out.println("You win!!!");
			}
			else if(computer==3 && player==1)
			{
				System.out.println("Computer chose Scissors");
				System.out.println("You win!!!");
			}
			else
			{
				System.out.println("Computer chose Scissors");
				System.out.println("You lose");
			}
			System.out.println("------------------------------------------");
			System.out.println("Game Over! Would you like to play again? 1 for yes, 2 for no");
			a=scn.nextInt();
			if(a==2)
			{
				break;
			}
			else
			{
				i++;
			}
		}
	}
}