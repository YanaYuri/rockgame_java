class Player {
	
	//---constant----------------------------------------------------------
	final String HAND_R = "Rock" ;    
	final String HAND_S = "Scissors" ;   
	final String HAND_P = "Paper" ;     
	
	
	//---field---------------------------------------------------
	String name       ;   //Player's name
	String handStatus ;   //Hand status
	
	
	//---constructor------------------------------------------------
	Player(String nm){
		this.name       = nm ;                   //Player's name
	}
	
	//---Method------------------------------------------------------
	//makeHandStatus by Math.random
	void makeHandStatus(){
		
		int random1to3 = 1 + (int)( Math.random() * 3.0 );    //get number of 1~3 randomly
		
		switch(random1to3){
			case 1:
				this.handStatus = HAND_R ;
				break;
			
			case 2:
				this.handStatus = HAND_S ;
				break;
			
			case 3:
				this.handStatus = HAND_P ;
				break;
		}
	}
}
