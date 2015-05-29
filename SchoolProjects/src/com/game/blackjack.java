package com.game;
import java.util.*;
public class blackjack {
	static Scanner input = new Scanner(System.in);
	static boolean question = false;
	
	static boolean win = false;
	static boolean lose = false;
	static boolean busted = false;
	static boolean dealer_busted = false;
	static int player_last_number = 0;
	static int dealer_last_number = 0;
	static Random random = new Random();
	static boolean testMode = false; //TEST MODE KEEP FALSE UNLESS TESTING
    static int rndm;
    static int playerTotal;
    static int dealerTotal;
    //maxDeckSize
	static int playerDeck[] = new int[12];
	static int dealerDeck[] = new int[12];
	static String playerDeckName[] = new String[12];
	static String dealerDeckName[] = new String[12];
	static int cardValue[] = new int[]{11,2,3,4,5,6,7,8,9,10,10,10,10};
	static String cards[] = new String[]{"Ace","Two","Three","Four",
        	"Five","Six","Seven","Eight","Nine","Ten","King",
        	"Queen","Jack"};
	static public void draw(){
    	if (playerDeck[0] == 0){
   		 rndm = new Random().nextInt(13)+1;	
   		 switch (rndm){
   			 case 1:
   				 playerDeck[0] = cardValue[0];
   				 playerDeckName[0] = cards[0];
   				 break;
   			 case 2:
   				 playerDeck[0] = cardValue[1];
   				 playerDeckName[0] = cards[1];
   				 break;
   			 case 3:
   				 playerDeck[0] = cardValue[2];
   				 playerDeckName[0] = cards[2];
   				 break;
   			 case 4:
   				 playerDeck[0] = cardValue[3];
   				 playerDeckName[0] = cards[3];
   				 break;
   			 case 5:
   				 playerDeck[0] = cardValue[4];
   				 playerDeckName[0] = cards[4];
   				 break;
   			 case 6:
   				 playerDeck[0] = cardValue[5];
   				 playerDeckName[0] = cards[5];
   				 break;
   			 case 7:
   				 playerDeck[0] = cardValue[6];
   				 playerDeckName[0] = cards[6];
   				 break;
   			 case 8:
   				 playerDeck[0] = cardValue[7];
   				 playerDeckName[0] = cards[7];
   				 break;
   			 case 9:
   				 playerDeck[0] = cardValue[8];
   				 playerDeckName[0] = cards[8];
   				 break;
   			 case 10:
   				 playerDeck[0] = cardValue[9];
   				 playerDeckName[0] = cards[9];
   				 break;
   			 case 11:
   				 playerDeck[0] = cardValue[10];
   				 playerDeckName[0] = cards[10];
   				 break;
   			 case 12:
   				 playerDeck[0] = cardValue[11];
   				 playerDeckName[0] = cards[11];
   				 break;
   			 case 13:
   				 playerDeck[0] = cardValue[12];
  				 playerDeckName[0] = cards[12];
  				 break;
   		 }	 
    	
    	rndm = new Random().nextInt(13)+1;		 
  		 switch (rndm){
  			 case 1:
  				 playerDeck[1] = cardValue[0];
  				 playerDeckName[1] = cards[0];
  				 break;
  			 case 2:
  				 playerDeck[1] = cardValue[1];
  				 playerDeckName[1] = cards[1];
  				 break;
  			 case 3:
  				 playerDeck[1] = cardValue[2];
  				 playerDeckName[1] = cards[2];
  				 break;
  			 case 4:
  				 playerDeck[1] = cardValue[3];
  				 playerDeckName[1] = cards[3];
  				 break;
  			 case 5:
  				 playerDeck[1] = cardValue[4];
  				 playerDeckName[1] = cards[4];
  				 break;
  			 case 6:
  				 playerDeck[1] = cardValue[5];
  				 playerDeckName[1] = cards[5];
  				 break;
  			 case 7:
  				 playerDeck[1] = cardValue[6];
  				 playerDeckName[1] = cards[6];
  				 break;
  			 case 8:
  				 playerDeck[1] = cardValue[7];
  				 playerDeckName[1] = cards[7];
  				 break;
  			 case 9:
  				 playerDeck[1] = cardValue[8];
  				 playerDeckName[1] = cards[8];
  				 break;
  			 case 10:
  				 playerDeck[1] = cardValue[9];
  				 playerDeckName[1] = cards[9];
  				 break;
  			 case 11:
  				 playerDeck[1] = cardValue[10];
  				 playerDeckName[1] = cards[10];
  				 break;
  			 case 12:
  				 playerDeck[1] = cardValue[11];
  				 playerDeckName[1] = cards[11];
  				 break;
  			 case 13:
  				 playerDeck[1] = cardValue[12];
 				 playerDeckName[1] = cards[12];
 				 break;
  		 } 
  		 player_last_number = 1;
  		playerTotal = playerDeck[0] + playerDeck[1];
 		//If Your first and second were both aces it would make your total 12.
 		if ((playerDeck[0] == 11) && (playerDeck[1] == 11)){playerTotal = 12;}
 		if (playerTotal == 21){System.out.println("You win!"); win = true; question = false;}

  		 
  		rndm = new Random().nextInt(13)+1;	
  		 switch (rndm){
  			 case 1:
  				 dealerDeck[0] = cardValue[0];
  				 dealerDeckName[0] = cards[0];
  				 break;
  			 case 2:
  				 dealerDeck[0] = cardValue[1];
  				 dealerDeckName[0] = cards[1];
  				 break;
  			 case 3:
  				 dealerDeck[0] = cardValue[2];
  				 dealerDeckName[0] = cards[2];
  				 break;
  			 case 4:
  				 dealerDeck[0] = cardValue[3];
  				 dealerDeckName[0] = cards[3];
  				 break;
  			 case 5:
  				 dealerDeck[0] = cardValue[4];
  				 dealerDeckName[0] = cards[4];
  				 break;
  			 case 6:
  				 dealerDeck[0] = cardValue[5];
 				 dealerDeckName[0] = cards[5];
  				 break;
  			 case 7:
  				 dealerDeck[0] = cardValue[6];
 				 dealerDeckName[0] = cards[6];
  				 break;
  			 case 8:
  				 dealerDeck[0] = cardValue[7];
 				 dealerDeckName[0] = cards[7];
  				 break;
  			 case 9:
  				 dealerDeck[0] = cardValue[8];
 				 dealerDeckName[0] = cards[8];
  				 break;
  			 case 10:
  				 dealerDeck[0] = cardValue[9];
 				 dealerDeckName[0] = cards[9];
  				 break;
  			 case 11:
  				 dealerDeck[0] = cardValue[10];
 				 dealerDeckName[0] = cards[10];
  				 break;
  			 case 12:
  				 dealerDeck[0] = cardValue[11];
 				 dealerDeckName[0] = cards[11];
  				 break;
  			 case 13:
  				 dealerDeck[0] = cardValue[12];
 				 dealerDeckName[0] = cards[12];
 				 break;
  		 }	 
  		 
   	
   	rndm = new Random().nextInt(13)+1;		 
 		 switch (rndm){
 			 case 1:
 				 dealerDeck[1] = cardValue[0];
 				 dealerDeckName[1] = cards[0];
 				 break;
 			 case 2:
 				 dealerDeck[1] = cardValue[1];
				 dealerDeckName[1] = cards[1];
 				 break;
 			 case 3:
 				 dealerDeck[1] = cardValue[2];
				 dealerDeckName[1] = cards[2];
 				 break;
 			 case 4:
 				 dealerDeck[1] = cardValue[3];
				 dealerDeckName[1] = cards[3];
 				 break;
 			 case 5:
 				 dealerDeck[1] = cardValue[4];
				 dealerDeckName[1] = cards[4];
 				 break;
 			 case 6:
 				 dealerDeck[1] = cardValue[5];
				 dealerDeckName[1] = cards[5];
 				 break;
 			 case 7:
 				 dealerDeck[1] = cardValue[6];
				 dealerDeckName[1] = cards[6];
 				 break;
 			 case 8:
 				 dealerDeck[1] = cardValue[7];
				 dealerDeckName[1] = cards[7];
 				 break;
 			 case 9:
 				 dealerDeck[1] = cardValue[8];
				 dealerDeckName[1] = cards[8];
 				 break;
 			 case 10:
 				 dealerDeck[1] = cardValue[9];
				 dealerDeckName[1] = cards[9];
 				 break;
 			 case 11:
 				 dealerDeck[1] = cardValue[10];
				 dealerDeckName[1] = cards[10];
 				 break;
 			 case 12:
 				 dealerDeck[1] = cardValue[10];
				 dealerDeckName[1] = cards[10];
 				 break;
 			 case 13:
 				 dealerDeck[1] = cardValue[0];
				 dealerDeckName[1] = cards[0];
				 break;
 		 }
 		if (win){System.out.println("The dealer drew a "+dealerDeck[0]+" and a "+dealerDeck[1]);}
    	}
    	dealerTotal += dealerDeck[0] + dealerDeck[1];
    	dealer_last_number = 1;
    	
    	
    	
	}
    
	public static void checkDeck(){ 
		if (playerTotal == dealerTotal){System.out.println("You guys tied. The dealer wins!"); lose = true;}
	    else if (playerTotal == 21){System.out.println("You win!"); win = true;}
	    else if (playerTotal >= 22){System.out.println("You Busted..."); busted = true;}
	    else if (playerTotal > dealerTotal){System.out.println("You scored higher than the dealer!, You win!"); win = true; dealer_busted = true;}	    
	    else if (dealerTotal > 21){System.out.println("Dealer busted. You win!"); win = true; dealer_busted = true;}
	    else if (dealerTotal > playerTotal){System.out.println("Dealer scored closer than you!,You lose!"); lose = true;}    	
		else{System.out.println("Your total is total is: "+playerTotal);}
		
	}
    
	public static void hit(){
   	 question = false;
   	 player_last_number++;
 	 rndm = new Random().nextInt(13)+1;		 
		 switch (rndm){
			 case 1:
				 playerDeck[player_last_number] = cardValue[0];
				 playerDeckName[player_last_number] = cards[0];
				 break;
			 case 2:
				 playerDeck[player_last_number] = cardValue[1];
				 playerDeckName[player_last_number] = cards[1];
				 break;
			 case 3:
				 playerDeck[player_last_number] = cardValue[2];
				 playerDeckName[player_last_number] = cards[2];
				 break;
			 case 4:
				 playerDeck[player_last_number] = cardValue[3];
				 playerDeckName[player_last_number] = cards[3];
				 break;
			 case 5:
				 playerDeck[player_last_number] = cardValue[4];
				 playerDeckName[player_last_number] = cards[4];
				 break;
			 case 6:
				 playerDeck[player_last_number] = cardValue[5];
				 playerDeckName[player_last_number] = cards[5];
				 break;
			 case 7:
				 playerDeck[player_last_number] = cardValue[6];
				 playerDeckName[player_last_number] = cards[6];
				 break;
			 case 8:
				 playerDeck[player_last_number] = cardValue[7];
				 playerDeckName[player_last_number] = cards[7];
				 break;
			 case 9:
				 playerDeck[player_last_number] = cardValue[8];
				 playerDeckName[player_last_number] = cards[8];
				 break;
			 case 10:
				 playerDeck[player_last_number] = cardValue[9];
				 playerDeckName[player_last_number] = cards[9];
				 break;
			 case 11:
				 playerDeck[player_last_number] = cardValue[10];
				 playerDeckName[player_last_number] = cards[10];
				 break;
			 case 12:
				 playerDeck[player_last_number] = cardValue[11];
				 playerDeckName[player_last_number] = cards[11];
				 break;
			 case 13:
				 playerDeck[player_last_number] = cardValue[12];
				 playerDeckName[player_last_number] = cards[12];
				 break;
		 }
		 playerTotal += playerDeck[player_last_number];
		 question = true;
		 if (playerTotal >= 22){busted = true; question = false; System.out.println("You busted!");}
		 System.out.println("You have a total of "+playerTotal);
	}
    
	public static void stand(){
   	 	do {
   	 		if(dealerTotal <= 16){
   	 		dealer_last_number++;
   	 		//about to draw :-)
   	  		rndm = new Random().nextInt(13)+1;	
     		 switch (rndm){
     			 case 1:
     				 dealerDeck[dealer_last_number] = cardValue[0];
     				 dealerDeckName[dealer_last_number] = cards[0];
     				 break;
     			 case 2:
     				 dealerDeck[dealer_last_number] = cardValue[1];
     				 dealerDeckName[dealer_last_number] = cards[1];
     				 break;
     			 case 3:
     				 dealerDeck[dealer_last_number] = cardValue[2];
     				 dealerDeckName[dealer_last_number] = cards[2];
     				 break;
     			 case 4:
     				 dealerDeck[dealer_last_number] = cardValue[3];
     				 dealerDeckName[dealer_last_number] = cards[3];
     				 break;
     			 case 5:
     				 dealerDeck[dealer_last_number] = cardValue[4];
     				 dealerDeckName[dealer_last_number] = cards[4];
     				 break;
     			 case 6:
     				 dealerDeck[dealer_last_number] = cardValue[5];
    				 dealerDeckName[dealer_last_number] = cards[5];
     				 break;
     			 case 7:
     				 dealerDeck[dealer_last_number] = cardValue[6];
    				 dealerDeckName[dealer_last_number] = cards[6];
     				 break;
     			 case 8:
     				 dealerDeck[dealer_last_number] = cardValue[7];
    				 dealerDeckName[dealer_last_number] = cards[7];
     				 break;
     			 case 9:
     				 dealerDeck[dealer_last_number] = cardValue[8];
    				 dealerDeckName[dealer_last_number] = cards[8];
     				 break;
     			 case 10:
     				 dealerDeck[dealer_last_number] = cardValue[9];
    				 dealerDeckName[dealer_last_number] = cards[9];
     				 break;
     			 case 11:
     				 dealerDeck[dealer_last_number] = cardValue[10];
    				 dealerDeckName[dealer_last_number] = cards[10];
     				 break;
     			 case 12:
     				 dealerDeck[dealer_last_number] = cardValue[11];
    				 dealerDeckName[dealer_last_number] = cards[11];
     				 break;
     			 case 13:
     				 dealerDeck[dealer_last_number] = cardValue[12];
    				 dealerDeckName[dealer_last_number] = cards[12];
    				 break;
     		 }	
     		 dealerTotal += dealerDeck[dealer_last_number];
   	 		}
   	 	}while (dealerTotal <= 16);
   	 	checkDeck();
   	 	if (lose || win){question = false;}
   	 	
   	 		
   	 	}

//	public static void display(){
//    	System.out.println(playerDeckName[0] +" "+ playerDeck[0]);
//    	System.out.println(playerDeckName[1] +" "+ playerDeck[1]);
//    	System.out.println(playerDeckName[2] +" "+ playerDeck[2]);
//    	System.out.println(playerDeckName[3] +" "+ playerDeck[3]);
//    	System.out.println(dealerDeckName[0] +" "+ dealerDeck[0]);
//    	System.out.println(dealerDeckName[1] +" "+ dealerDeck[1]);
//    	System.out.println(dealerDeckName[2] +" "+ dealerDeck[2]);
//    	System.out.println(dealerDeckName[3] +" "+ dealerDeck[3]);
//	}

    
	public static void main(String[] args){
		String response;
		question = true;
    	draw();	
    	System.out.println("You drew a "+playerDeck[0]+" and a "+playerDeck[1]);
    	System.out.println("Your total is: "+playerTotal);
    	if(!win){System.out.println("The dealer has a "+playerDeck[0]+ " showing and a Hidden card.");}
    	if(testMode){
    	System.out.println(playerDeckName[0] +" "+ playerDeck[0]);
    	System.out.println(playerDeckName[1] +" "+ playerDeck[1]);
    	System.out.println(dealerDeckName[0] +" "+ dealerDeck[0]);
    	System.out.println(dealerDeckName[1] +" "+ dealerDeck[1]);
    	}
    	while (question){
    	System.out.println("Would you like to \"Hit\" or \"Stay\"?");
    	response =  input.nextLine();
    	response = response.toUpperCase();
    	switch(response){
    	case "HIT":
    		hit();
    		break;
    	case "STAY":
    		stand();
    		break;
    	default:
    		System.out.println("Invalid command..");
    		break;
    	}
    	}
    	if (dealer_busted){System.out.println("The dealer's last card that made him bust was \n"+dealerDeck[dealer_last_number]+ " and his hidden card was: "+dealerDeck[1]);}
    	if (dealer_busted){System.out.println("Dealers total:" +dealerTotal);}
    }
	}





