package com.game;
import java.util.*;
public class blackjack {
	static Scanner input = new Scanner(System.in);
	static boolean question = false;
	
	static Random random = new Random();
	static boolean testMode = true;
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
 		//If Your first and second were both aces it would make your total 12.
 		if ((playerDeck[0] == 11) && (playerDeck[1] == 11)){playerTotal = 12; checkDeck();}
 		playerTotal = playerDeck[0] + playerDeck[1];
  		 checkDeck();
  		 
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
    	}
    	
    	
    	
	}
    
	public static void checkDeck(){ 
		if (playerTotal == 21){System.out.println("You win!");}
		else{System.out.println("Your total is total is: "+playerTotal);}
		
	}
    
	public static void hit(){
   	 System.out.println("I work.");
   	 question = false;
	}
    
	public static void stand(){
   	 
	}
    
	public static void main(String[] args){
		String response;
    	draw();
    	if(testMode){
    	System.out.println(playerDeckName[0] +" "+ playerDeck[0]);
    	System.out.println(playerDeckName[1] +" "+ playerDeck[1]);
    	System.out.println(dealerDeckName[0] +" "+ dealerDeck[0]);
    	System.out.println(dealerDeckName[1] +" "+ dealerDeck[1]);
    	}
    	question = true;
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
    }
	}





