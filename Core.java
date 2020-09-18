package Themain;

public class Core{
   public Core() {
   }
	   public static void main(String[] args) {
		   Main vs = new Main();
		do
		   switch (Main.choice) {
		   case 1 :
			   new Games();
			   main(args);
			   break;
		   case 2 :
			   new Data();
			   main(args);
			   break;
		   case 3 :
			   Data.stat();
			   main(args);
		   }while(Main.choice < 3);
		   
		   }
	   }
