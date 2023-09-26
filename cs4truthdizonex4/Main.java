// rock, paper, scissors

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		Move pMove = new Move("");
		Move cMove = new Move("");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
		int option, result;
		int playerMove, computerMove;
		int playerScore = 0, computerScore = 0;

		do {
			System.out.printf("Welcome to Rock, Paper, Scissors! Please choose an option:%n1. Start game%n2. Change number of rounds%n3. Exit application%n> ");
			option = Integer.parseInt(input.nextLine());
			
			switch(option) {
				case 1:
					playerScore = 0;
					computerScore = 0;
					do {
						System.out.printf("%nThis match will be first to %d wins. %nThe Computer has selected its move. Select your move:%n1. Rock%n2. Paper%n3. Scissors%n> ", roundsToWin);
						playerMove = Integer.parseInt(input.nextLine());
						switch(playerMove) {
							case 1: pMove = rock; break;
							case 2: pMove = paper; break;
							case 3: pMove = scissors; break;
						}
						computerMove = (int) Math.floor(Math.random()*3) + 1;
						switch(computerMove) {
							case 1: cMove = rock; break;
							case 2: cMove = paper; break;
							case 3: cMove = scissors; break;
						}
						System.out.printf("%nPlayer chose %s. Computer chose %s. ", pMove.getName(), cMove.getName());
						result = Move.compareMoves(pMove, cMove);
						switch(result) {
							case 0: System.out.printf("Player wins round!"); playerScore++; break;
							case 1: System.out.printf("Computer wins round!"); computerScore++; break;
							case 2: System.out.printf("Round is tied!"); break;
						}
						System.out.printf("%nPlayer: %d - Computer: %d%n%n", playerScore, computerScore);
					} while((playerScore < roundsToWin) && (computerScore < roundsToWin));
					
					if(playerScore == roundsToWin) {
						System.out.printf("Player wins!%n%n");
					}
					else {
						System.out.printf("Computer wins!%n%n");
					}
					break;
				case 2:
					System.out.printf("%nHow many wins are needed to win a match?%n> ");
					roundsToWin = Integer.parseInt(input.nextLine());
					System.out.printf("%nNew setting has been saved!%n%n");
					break;
				case 3:
					System.out.printf("%nThanks for playing!");
					break;
				default:
					System.out.printf("%nPlease choose a valid option%n%n");
			}
		} while(option != 3);
	}
}
