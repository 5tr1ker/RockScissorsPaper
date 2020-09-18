package Themain;

import java.util.Scanner;

public class Main extends Core {
	
	public Main(){
	      
	      @SuppressWarnings("resource")
	      Scanner scan = new Scanner(System.in); // This is a main
	      System.out.println("Welcome to games world");
	      System.out.println("[Rock_paper_scissors]");
	      System.out.println("You have" + Games.coin + " Coins!!");
	      System.out.println("Please choose::");
	      
	      System.out.println("1 . Games Start");
	      System.out.println("2.  How to play?");
	      System.out.println("3.  Statisitc");
	      System.out.println("4.  Exit");
	      System.out.println("<If out-of-range value requires re-input.>");
	      
	      do {                      // if user input out of range , than System requiers re input.
	      choice = scan.nextInt();
	      } while( choice < 0 || choice > 4);
	      

	   
	}
	static int choice;

}
