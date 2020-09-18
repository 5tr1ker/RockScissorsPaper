package Themain;

public class Data{
	public Data() {
	System.out.println("how to play?");
	System.out.println(" <1> .  The player plays a game against the computer and Triple coins in victory, and all coins lost in defeat. the coin left 0 coin then program is exit");
	System.out.println(" <2> .  Games is total 3 round , if you get 2 point, you win");
	System.out.println(" <3> .  This programm can Save, Reload funtion");
	System.out.println(" <4> .  You can see statistics, total games , winning rate ");
	}
	
	public static void stat() {
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
	}

	   }
