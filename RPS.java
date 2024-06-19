import java.util.*;
//import java.util.Scanner;
//import java.util.Random;
public class RPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] rps = {"Rock","Scissor","Paper"};

		String computer_move, usermove;
		boolean play = true;
		while(play) {
			int comp_index = random.nextInt(3);
			computer_move = rps[comp_index];
			 System.out.println("Enter your move (Rock, Paper, Scissors) or To exit the game, type exit:");
			usermove = sc.nextLine();
			if(usermove.equalsIgnoreCase("exit")) {
				System.out.println("You should not know about the game");
				play = false;
				break;
			}
			if((!usermove.equalsIgnoreCase("Rock")) && (!usermove.equalsIgnoreCase("Scissor")) && (!usermove.equalsIgnoreCase("Paper"))){
				System.out.println("Invalid move, please try again");
				continue;
			}
			System.out.println("Computer\'s move: "+ computer_move);
			if(usermove.equalsIgnoreCase(computer_move)) {
				System.out.println("It's tie ");
			}else if(usermove.equalsIgnoreCase("Rock")){
				if(computer_move=="Scissor") {
					System.out.println("You lose");
				}else {
					System.out.println("You Won");
				}
			}else if(usermove.equalsIgnoreCase("Scissor")) {
				if(computer_move=="Rock") {
					System.out.println("You lose");
				}else {
					System.out.println("You won");
				}
			}else if(usermove.equalsIgnoreCase("Paper")) {
				if(computer_move=="Rock") {
					System.out.println("You win");
				}else {
					System.out.println("You lose");
				}
			}
		System.out.print("Do you want to play again ?  (yes/no): ");
		String playagain = sc.nextLine();
		play = playagain.equalsIgnoreCase("yes");
		}
	
	System.out.println("Thanks for playing.");
	sc.close();
	}
}
