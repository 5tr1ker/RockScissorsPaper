package Themain;

import java.util.Random;
import java.util.Scanner;

public class Games {
	Scanner scan = new Scanner(System.in);
	   private  int Random;
	   public int Input;
	   static int TR= 0;			//total Rocks
	   static int TS= 0;			//total scissors
	   static int TP= 0;			//total papers
	   static int WR= 0;			//win rocks
	   static int WS= 0;			//win scissors
	   static int WP= 0;			//win  papers
	   static int coin = 20;	
	   static int Max_coin = 0;		//you have a highest score(coin)
	   static int betting = 0;		// betting coin
	   
	public Games() {
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
        
        
        Scanner scan = new Scanner(System.in);
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
        
	}




}
