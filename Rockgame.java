public class Rockgame {
	
	public static void main(String[] args) {
		
		// Receive 3 names from command line argument
		String nameP1      = args[0] ; //Player1 name
		String nameP2      = args[1] ; //Player2 name
		String nameReferee = args[2] ; //Referee ename
		
		
		// instantiation
		Player  p1      = new Player(  nameP1 ) ;      // instantiation in Player class
		Player  p2      = new Player(  nameP2 ) ;      // instantiation in Player class
		Referee ref     = new Referee( nameReferee ) ; // instantiation in Referee class
		
		
		// Referee says "Rock, paper, scissors, shoot! "
		ref.startRockgame();
		
		// makeHandStatus method in Player class
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		//checkHand method in Referee class. Math.random to define hand.
		ref.checkHand(p1);
		ref.checkHand(p2);
		
		
		// judgeRockgame method in Referee class. Referee says result.
		ref.judgeRockgame(p1,p2);
		
		
	}
}
