package com.game;
import java.util.*;
public class blackjack {
    static Random random = new Random();
    static int rndm;
    static int playerTotal;
    //maxDeckSize
	static int deck[] = new int[5];
	static String deckName[] = new String[5];
	static int cardValue[] = new int[]{11,2,3,4,5,6,7,8,9,10,10,10,10};
	static String cards[] = new String[]{"Ace","Two","Three","Four",
        	"Five","Six","Seven","Eight","Nine","Ten","King",
        	"Queen","Jack"};
	static public void draw(){
    	if (deck[0] == 0){
   		 rndm = new Random().nextInt(13)+1;		 
   		 switch (rndm){
   			 case 1:
   				 deck[0] = cardValue[0];
   				 deckName[0] = cards[0];
   				 break;
   			 case 2:
   				 deck[0] = cardValue[1];
   				 deckName[0] = cards[1];
   				 break;
   			 case 3:
   				 deck[0] = cardValue[2];
   				 deckName[0] = cards[2];
   				 break;
   			 case 4:
   				 deck[0] = cardValue[3];
   				 deckName[0] = cards[3];
   				 break;
   			 case 5:
   				 deck[0] = cardValue[4];
   				 deckName[0] = cards[4];
   				 break;
   			 case 6:
   				 deck[0] = cardValue[5];
   				 deckName[0] = cards[5];
   				 break;
   			 case 7:
   				 deck[0] = cardValue[6];
   				 deckName[0] = cards[6];
   				 break;
   			 case 8:
   				 deck[0] = cardValue[7];
   				 deckName[0] = cards[7];
   				 break;
   			 case 9:
   				 deck[0] = cardValue[8];
   				 deckName[0] = cards[8];
   				 break;
   			 case 10:
   				 deck[0] = cardValue[9];
   				 deckName[0] = cards[9];
   				 break;
   			 case 11:
   				 deck[0] = cardValue[10];
   				 deckName[0] = cards[10];
   				 break;
   			 case 12:
   				 deck[0] = cardValue[11];
   				 deckName[0] = cards[11];
   				 break;
   			 case 13:
   				 deck[0] = cardValue[12];
  				 deckName[0] = cards[12];
  				 break;
   		 }	 
    	
    	rndm = new Random().nextInt(13)+1;		 
  		 switch (rndm){
  			 case 1:
  				 deck[1] = cardValue[0];
  				 deckName[1] = cards[0];
  				 break;
  			 case 2:
  				 deck[1] = cardValue[1];
  				 deckName[1] = cards[1];
  				 break;
  			 case 3:
  				 deck[1] = cardValue[2];
  				 deckName[1] = cards[2];
  				 break;
  			 case 4:
  				 deck[1] = cardValue[3];
  				 deckName[1] = cards[3];
  				 break;
  			 case 5:
  				 deck[1] = cardValue[4];
  				 deckName[1] = cards[4];
  				 break;
  			 case 6:
  				 deck[1] = cardValue[5];
  				 deckName[1] = cards[5];
  				 break;
  			 case 7:
  				 deck[1] = cardValue[6];
  				 deckName[1] = cards[6];
  				 break;
  			 case 8:
  				 deck[1] = cardValue[7];
  				 deckName[1] = cards[7];
  				 break;
  			 case 9:
  				 deck[1] = cardValue[8];
  				 deckName[1] = cards[8];
  				 break;
  			 case 10:
  				 deck[1] = cardValue[9];
  				 deckName[1] = cards[9];
  				 break;
  			 case 11:
  				 deck[1] = cardValue[10];
  				 deckName[1] = cards[10];
  				 break;
  			 case 12:
  				 deck[1] = cardValue[11];
  				 deckName[1] = cards[11];
  				 break;
  			 case 13:
  				 deck[1] = cardValue[12];
 				 deckName[1] = cards[12];
 				 break;
  		 }
 		//If Your first and second were both aces it would make your total 12.
 		if ((deck[0] == 11) && (deck[1] == 11)){playerTotal = 12; checkDeck();}
 		playerTotal = deck[0] + deck[1];
  		 checkDeck();
    	}
    	
	}
    
	public static void checkDeck(){ 
		if (playerTotal == 21){System.out.println("You win!");}
		else{System.out.println("Your total is total is: "+playerTotal);}
		
	}
    
	public void hit(){
   	 
	}
    
	public void stand(){
   	 
	}
    
	public static void main(String[] args){
    	draw();
    	System.out.println(deckName[0] +" "+ deck[0]);
    	System.out.println(deckName[1] +" "+ deck[1]);
	}
}





