public class Referee {
	
	
	//---constant----------------------------------------------------------
	final String HAND_R = "Rock" ;    
	final String HAND_S = "Scissors" ;   
	final String HAND_P = "Paper" ;
	
	
	//---field---------------------------------------------------
	String name       ;   //Referee's name
	
	
	//---constructor------------------------------------------------
	Referee(String nm){
		this.name = nm;   //Referee's name
	}
	
	
	//---Method------------------------------------------------------
	
	void startRockgame(){
		
		messageReferee("Rock, paper, scissors, shoot!");
		
	}
	
	//---Method------------------------------------------------------
	void checkHand( Player p ){
	  	if( (p.handStatus).equals( HAND_R ) ){
	
			messageReferee(p.name + "'s hand is Rock");
			
		}else if( (p.handStatus).equals( HAND_S ) ){
			
			messageReferee(p.name + "'s hand is Scissors");
			
		}else if( (p.handStatus).equals( HAND_P ) ){
			
			messageReferee(p.name + "'s hand is Paper");
			
		}else{
			
			System.out.println("[ERROR]");
			
		}
	}
	
//---Method------------------------------------------------------
	void judgeRockgame(Player p1,Player p2){
		
  	messageReferee("Result is...");
		
		if( (p1.handStatus).equals( p2.handStatus ) ){
			
		messageReferee("It's a tie!");
			
		}else if(     (p1.handStatus.equals( HAND_R ) && p2.handStatus.equals( HAND_S ))
		           || (p1.handStatus.equals( HAND_S ) && p2.handStatus.equals( HAND_P ))
		           || (p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_R ))  ) {
			
			//When Player1 win
			messageReferee(p1.name + "Win!");
			
		}else if(     (p2.handStatus.equals( HAND_R ) && p1.handStatus.equals( HAND_S ))
		           || (p2.handStatus.equals( HAND_S ) && p1.handStatus.equals( HAND_P ))
		           || (p2.handStatus.equals( HAND_P ) && p1.handStatus.equals( HAND_R ))  ) {
			
				//When Player2 win
			messageReferee(p2.name + "-Win!");
			
		}else{
			
			System.out.println("[ERROR]");
			
		}
	}
	
	//---Method------------------------------------------------------
	//Referee says result
	void messageReferee(String msg){
		
		System.out.println( this.name + "'" + msg + "'");
		
	}
}
