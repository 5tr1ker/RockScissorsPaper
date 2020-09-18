package games;

import java.util.Random;
import java.util.Scanner;

public class Core{
	
	static Scanner scan = new Scanner(System.in);
	   private static  int Random;
	   public static int Input;


		   public static void main(String[] args) {
			    int a = 0;
			    int TR= 0;			//total Rocks
			    int TS= 0;			//total scissors
			   int TP= 0;			//total papers
			    int WR= 0;			//win rocks
			    int WS= 0;			//win scissors
			    int WP= 0;			//win  papers
			    int coin = 20;	
			    int Max_coin = 0;		//you have a highest score(coin)
			    int betting = 0;		// betting coin
			   @SuppressWarnings("resource")
			      Scanner scan = new Scanner(System.in); // This is a main
			   do {
				   
			   do {
				      System.out.println("Welcome to games world");
				      System.out.println("[Rock_paper_scissors]");
				                            // if user input out of range , than System requiers re input.
				      System.out.println("You have" + Games.coin + " Coins!!");
				      System.out.println("Please choose::");
				      
				      System.out.println("1 . Games Start");
				      System.out.println("2.  How to play?");
				      System.out.println("3.  Statisitc");
				      System.out.println("4.  Exit");
				      System.out.println("<If out-of-range value requires re-input.>");
				      
				      a = scan.nextInt();
			   } while( a < 0 || a > 4);

			   switch (a) {
			   case 1 :
				   int player_score = 0;
					int com_score = 0;
			        System.out.println("Total 3 games.. The winner of the second round wins.\n");
			        System.out.println("Number of 0 = Rocks // 1 = Paper // 2 = Scissors\n");
			        System.out.println("Please enter your coin to bet.");
			        do {
			        	System.out.println("You have " + coin + " coin Please enter Value in range");
			        betting = scan.nextInt();	
			        } while(betting > coin);
			        
			        
			        for ( int i = 0; com_score != 2 && player_score != 2 ; i++) {
			        	System.out.println("[" + i + "] Games");
			        Random = (int)new Random().nextInt(2);
			        System.out.println("The computer made a decision. \n");
			        System.out.println("Please Inputs your decidsion ::");
			        
			        
			        do {
			        System.out.println("Enter only 0 to 2 values");
			        Input = scan.nextInt();
			        } while(Input < 0 || Input > 2);
			        if(Input < Random || (Input == 2 && Random == 0)) {
			        	System.out.println("Defeat...");
			        	com_score++;
			        	if(Input == 0 && Random == 1 ) { TR++; }
			        	if(Input == 1 && Random == 2 ) { TP++; }
			        	if(Input == 2 && Random == 0 ) { TS++; }
			        }
			        else if (Input > Random || (Input == 0 && Random == 2)) {
			        	System.out.println("Player Wins!!");
			        	player_score++;
			        	if(Input == 0 && Random == 2 ) { TR++; WR++;}
			        	if(Input == 1 && Random == 0 ) { TP++; WP++;}
			        	if(Input == 2 && Random == 1 ) { TS++; WS++;}
			        }
			        else {
			        	System.out.println("Draw...");
			        	i--;
			        }
			        System.out.println("player::  " + player_score + "  Computer::  " + com_score);
			        }
			        if(player_score == 2) {
			        	System.out.println("You win! , You have X3 coin");
			        	coin = betting * 3;
			        	betting = 0;
			        }
			        else {
			        	System.out.println("You lose ��.�� , You lose betting coin");
			        	coin -= betting;
			        	betting = 0;
			        }
			        a = 0;
				   break;
			   case 2 :
				   System.out.println("how to play?");
					System.out.println(" <1> .  The player plays a game against the computer and Triple coins in victory, and all coins lost in defeat. the coin left 0 coin then program is exit");
					System.out.println(" <2> .  Games is total 3 round , if you get 2 point, you win");
					System.out.println(" <3> .  This programm can Save, Reload funtion");
					System.out.println(" <4> .  You can see statistics, total games , winning rate ");
					a = 0;
					break;
			   case 3 :
				   System.out.println("\t<<<Statistic>>>");
					System.out.println("Total Rocks Games:: " + Games.TR + "\tWins ::" + Games.WR + "\t Defeat::" + (Games.TR - Games.WR));
					System.out.println("Total Scissors Games:: " + Games.TS + "\tWins ::" + Games.WS + "\t Defeat::" + (Games.TS - Games.WS));
					System.out.println("Total Papers Games:: " + Games.TP + "\tWins ::" + Games.WP + "\t Defeat::" + (Games.TP - Games.WP));
					
					if(Games.TR == 0) {
						System.out.println("Rocks Winning Rate :: 100.00%");
					}
					else
					{
						System.out.println("Rocks Winning Rate :: " + (double)Games.WR / (double)Games.TR * 100 + "%");
					}
					if(Games.TS == 0) {
						System.out.println("Scissors Winning Rate :: 100.00%");
					}
					else
					{
						System.out.println("Scissors Winning Rate :: " + (double)Games.WS / (double)Games.TS * 100 + "%");
					}
					if(Games.TP == 0) {
						System.out.println("Papers Winning Rate :: 100.00%");
					}
					else
					{
						System.out.println("Papers Winning Rate :: " + (double)Games.WP / (double)Games.TP * 100 + "%");
					}
					a = 0;
					break;
			   }
			   } while( a!=4);
			     }
		   
			 }

