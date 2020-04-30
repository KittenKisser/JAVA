import java.util.Scanner;
public class Program08 {
//Name: Daniel Maciejewski
//Section 802
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);//object holds user input
		String playerChoice = "";//stores the player's choice of 1 or 2 as a String 
		
		char parsedUserInput =' ';//holds the char parsed from the String userInput
		int chipsNow = 100;//user starts with 100 chips
		boolean cashout = true;//defines the boolean conditional for quitting and cashing out
		
		welcome();
		do {//This do-while loop keeps playing the game until the user chooses 2
			
		do {//This do-while loop validates that user input is only either 1 or 2
		System.out.print("1 - Pick a number to bet on\r\n2 - Cash out\nEnter a choice [1, 2]:");//give user input options
		playerChoice = stdIn.next();//hold their choice
		parsedUserInput = playerChoice.charAt(0);//parse their choice for comparison
		}while(parsedUserInput != '1' && parsedUserInput != '2');//define conditions for appropriate user input
		
		if (parsedUserInput == '1') {//this if branch is where all the action happens
			
		int betNum =getNumber(stdIn);//calls the method getNumber and stores the returned value in betNumber
		int bet =getBet(stdIn,chipsNow);//calls the method getBet and stores the returned value in bet
		int spinNum = (int)(Math.random() * 36) + 1;//spins the Roulette wheel
		displaySpinResult(spinNum);//calls the void method displaySpinResult()
		
		if (spinNum == betNum) {chipsNow += bet;System.out.println("You won!\nYou now have "+chipsNow+" chip(s)");}
		else {chipsNow -= bet;System.out.println("Sorry, you lost\nYou now have "+chipsNow+" chip(s)\n");}
		
		}//end if
		
		else {cashout = false;}//kicks the user out of do-while
		
		}while(cashout);//end do-while
		
		finalReport(chipsNow);//calls finalReport()
	}//end main
	
	
	
public static void welcome() {//This method displays a welcome and informs the user of the ground rules
	System.out.println("############################\r\n" + 
			"#    WELCOME TO ROULETTE   #\r\n" + 
			"############################\r\n" + 
			"# NUMBER BETS PAYOUT: 35:1 #\r\n" + 
			"############################\r\n" + 
			"You have 100 chips\n\n");
	
}//end welcome

public static int getNumber(Scanner stdIn){
	/*this method takes the Scanner class object stdIn as an argument,
	and asks the user to input a number to bet on*/
	int betNumber = 0;
	
	do {
		System.out.println("Enter a number to bet on [0-36]");
		betNumber = stdIn.nextInt();//holds user input
	}while(betNumber <= 0  || betNumber >= 36);//checks inputs
	
	return betNumber;//sends betNumber to the variable betNum in main
	
}//end getNumber

public static int getBet(Scanner stdIn,int chipsNow) {//asks the user for a bet amount and ensures that it's within acceptable boundaries
	int bet =0;
	do {
		System.out.println("Enter the number of chips to bet [1-100]:");
		bet = stdIn.nextInt();//holds user input
	}while(bet < 1 || bet > chipsNow);//checks input
	
	return bet;//sends bet to the variable "bet" in main
}//end getBet

public static String determineColor(int spinNum) {//takes spinNum, decides its color and returns the decided variable
	String color = "";//holds the color of the wheel 
	if(spinNum == 0) {color = "Green"; return color;}//0 is the color green
	else if(spinNum%2 ==0) {color = "red"; return color;}//even colors are red
	else {color = "black"; return color;}//odd colors are black
}//end determineColor

public static void displaySpinResult(int spinNum) {//takes and displays the spinNum variable, then it calls determineColor() and displays the result
	System.out.println("Spinning the wheel ...\nand the ball lands on : "+spinNum+" "+determineColor(spinNum));
}//end displaySpinResult

public static void finalReport(int chipsNow) {//depending on the value of chipsNow, finalReport displays your winnings/losings/evens with respect to your initial chip count
	if(chipsNow == 100) {System.out.print("Thanks for playing, you broke even!");}
	else if(chipsNow == 0) {System.out.print("Thanks for playing, You have 0 chip(s)");}
		else if (chipsNow < 100) {System.out.println("Thanks for playing, you lost a total of "+(100-chipsNow)+" chip(s)");}
		else{System.out.println("Thanks for playing, you won a total of "+(chipsNow-100)+" chip(s)");}	
}//end finalReport

}//end class
