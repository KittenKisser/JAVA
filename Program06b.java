import java.util.Scanner;

//Dan Maciejewski
//Section 802
//Goal: Write a program that allows a single Player (the user) to play a simple four dice game of chance against "The Odds".
public class Program06b {
	public static void main(String[] args) {
		//declare all of the necessary variables
		boolean flag = true;//condition for exiting do-while loop
		//accepts user input
		Scanner userInput = new Scanner(System.in);
		//initializes empty strings for user choice input 
		String playChoice = "",rerollQuantity = "";
		//initialize int variables to zero
		int roundCounter = 0,wins = 0,losses = 0,d1 = 0,d2 = 0,d3 = 0,d4 = 0;
		//Gives the Player the rules of the game
		System.out.print("     Welcome to Computer Dice\n----------------------------------\nYou will first roll your dice\n\n"
				+ "You then are allowed to re-roll up to\r\ntwo of your dice\n\nFinally the outcome of your roll is\r\n" + 
				"be determined:\n\nany Quad and you receive 108 Wins\nany Triple and you receive 6 wins\n" + 
				"any Two-Pair and you receive 4 Wins\nanything else and you receive 1 Lose\n-------------------------------------\n\n");
		do{
			System.out.println("  Player\n-----------");//initiates player turn
			roundCounter++;//increment round count
			//rolls the dice
			d1 = (int)(Math.random() * 6) + 1;//die 1
			d2 = (int)(Math.random() * 6) + 1;//die 2
			d3 = (int)(Math.random() * 6) + 1;//die 3
			d4 = (int)(Math.random() * 6) + 1;//die 4
			//displays dice-roll results
			System.out.println("  "+d1+" "+d2+" "+d3+" "+d4);
			System.out.print("Please enter the number of dice to re-roll [0,2]: ");//Gives user option to re-roll up to two dice
			
			rerollQuantity = userInput.next();//holds user input
			char parsedRerollQuantity = rerollQuantity.charAt(0);//parses user input
			
			if(parsedRerollQuantity == '0') {}
			
			else if(parsedRerollQuantity == '1')//user opts to roll 1 die
			{
				System.out.println("You have opted for one re-roll...");
				System.out.print("Please enter which dice to re-roll[1,4]:[x](Input format): ");//tell user the entry format
				
				String dieToReroll = userInput.next();//get user input
				char x1 = dieToReroll.charAt(0);//parse user input
				//this section re-rolls the die that the user selected
				
				if (x1=='1'){d1 = (int)(Math.random() * 6) + 1;}
				else if (x1=='2'){d2 = (int)(Math.random() * 6) + 1;}
				else if (x1=='3'){d3 = (int)(Math.random() * 6) + 1;}
				else {d4 = (int)(Math.random() * 6) + 1;}
				
				System.out.println("  "+d1+" "+d2+" "+d3+" "+d4);//display current dice rolls
			}//end single re-roll
			
			else if (parsedRerollQuantity == '2')//user opts to re-roll
			{		
				System.out.print("Please enter which dice to re-roll [[1,4],[1,4]]:[x,y](Input format): ");
			
				String dieToReroll = userInput.next();
				char x1 = dieToReroll.charAt(0);
				char x2 = dieToReroll.charAt(2);
			
				if (x1=='1') {d1 = (int)(Math.random() * 6) + 1;}//this section re-rolls the first die that the user selected
				else if (x1=='2'){d2 = (int)(Math.random() * 6) + 1;}
				else if (x1=='3'){d3 = (int)(Math.random() * 6) + 1;}
				else {d4 = (int)(Math.random() * 6) + 1;}
			
				if (x2=='1') {d1 = (int)(Math.random() * 6) + 1;}//this section re-rolls the second die that the user selected
				else if (x2=='2'){d2 = (int)(Math.random() * 6) + 1;}
				else if (x2=='3'){d3 = (int)(Math.random() * 6) + 1;}
				else {d4 = (int)(Math.random() * 6) + 1;}
			
				System.out.println("  "+d1+" "+d2+" "+d3+" "+d4);//displays output
			}//end double re-roll 
			//Scoring of results occurs here
			//Quads
			if(d1==d2 && d1==d3 && d1==d4) {wins += 108;}
			//Trips
			else if(d1==d2 && d1==d3) {wins += 6;} 
			else if(d1==d2 && d1==d4) {wins += 6;}
			else if(d1==d3 && d1==d4) {wins += 6;}
			else if(d2==d1 && d2==d3) {wins += 6;}
			else if(d2==d1 && d2==d4) {wins += 6;}
			else if(d3==d1 && d3==d2) {wins += 6;}
			else if(d3==d4 && d3==d2) {wins += 6;}
			else if(d4==d2 && d4==d1) {wins += 6;}
			else if(d4==d2 && d4==d3) {wins += 6;}
			else if(d4==d2 && d4==d3) {wins += 6;}
			//Two-Pair
			else if(d1==d2) {wins += 4;}
			else if(d1==d3) {wins += 4;}
			else if(d1==d4) {wins += 4;}
			else if(d2==d3) {wins += 4;}
			else if(d2==d4) {wins += 4;}
			else if(d3==d4) {wins += 4;}
			//Junker
			else {losses++;}
			
			System.out.print("Do you with to play again?[y,n]:");//determine if play will kick back to top of loop or leave it
			playChoice = userInput.next();//hold player input
			char parsedPlayChoice = playChoice.charAt(0);//parse input
			//player exits loop on choosing n
			if (parsedPlayChoice == 'n') {flag = false;}
			
		}while(flag != false);//end do-while
		//displays final results
		System.out.print("\n\nComputer Dice Results\n---------------------\nYou played "+roundCounter+" round(s)\n\nWins:   "+wins+"\nLosses: "+losses+"\n---------------------");
	}//End Main
}//End Class