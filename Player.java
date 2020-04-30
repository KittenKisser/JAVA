import java.util.Scanner;
public class Player {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		boolean choice = false;
		do {
			//player dice
			int p1 = (int)(Math.random() * 12)+1;
			int p2 =(int)(Math.random() * 12)+1;
			System.out.println("Player results\n----------\nDie One = "+p1+"\nDie Two = "+p2+"\n<><><><><><><><><>");
			int o1 = (int)(Math.random() * 12)+1;
			int o2 = (int)(Math.random() * 12)+1;
			System.out.println("Opponent results\n----------\nDie One = "+o1+"\nDie Two = "+o2);
			if(p1>o1+o2||p2>o1+o2) {System.out.println("You win!");}
			else if(o1>p1+p2||o2>p1+p2) {System.out.println("Opponent wins!");}
			else {System.out.println("It's a tie!");}
			
			System.out.println("Would you like to play again?[y/n]");
			String playerChoice = userInput.next();
			char parsedChoice = playerChoice.charAt(0);
			if(parsedChoice == 'y') {choice = true;}
			else {System.out.println("Thanks for playing!");choice = false;}
		}while(choice);
		userInput.close();
	}

}
