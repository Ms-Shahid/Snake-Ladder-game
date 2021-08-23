package day_4_pratice_problems.snakeLadder;

public class UC1_Snake_Ladder {

	public static void main(String[] args) {
		
		System.out.println("Snake And ladder Game using 2 Player");
		System.out.println("Game Starts Here !! (: ");
		int counter = 0, position = 0, dice = 0, Player1 = 0, Player2 =0;
		while (counter <= 100 || counter > 100) {
			if (counter > 100) {	
				counter = counter - position;
			}
			else if (counter == 100) {
					break;
			}
		int Players = (int)Math.floor(Math.random() * 10 ) % 2;
		int Rolling = (int)Math.floor(Math.random() * 10 ) % 6 + 1;
		int randomPlayer = (int)Math.floor(Math.random() * 10 ) % 3;
		
		if (Players == 1 ) {
			Player1 = (int) Rolling;
			switch(randomPlayer) {
			case 0: System.out.println("No Play ");position = 0;break;
			case 1: System.out.println("Moving Ahead");position = (int) (position + Rolling);break;
			default : System.out.println("Moving back");Rolling = (int) (Rolling - position);
				position = (int) (position - Rolling);
				if (Rolling > position ) {
					position = (int) Rolling-position;
				}
				else if (position < 0) {
					position = 0;
				}break;
			}
			System.out.println("Current Count of Player is " + counter);
			counter = position+counter;
			System.out.println("----------------------------");
			dice = (int) (dice + position);
			System.out.println("Number of dice Played " + dice);
			System.out.println("----------------------------");
			Player1 = dice;
			
			System.out.println("Current Position is " + counter);
			System.out.println("Number of dice Player1 Played " + dice);
			System.out.println("----------------------------");
			
		}
			else {
				Player2 = (int) Rolling;
				
				switch(randomPlayer) {
				case 0: System.out.println("No Play ");position = 0;break;
				case 1: System.out.println("Moving Ahead");position = (int) (position + Rolling);break;
				default : System.out.println("Moving back");Rolling = (int) (Rolling - position);
					position = (int) (position - Rolling);
					if (Rolling > position ) {
						position = (int) Rolling-position;
					}
					else if (position < 0) {
						position = 0;
					}break;
				}
				System.out.println("Current Count of Player is " + counter);
				counter = position+counter;
				System.out.println("----------------------------");
				dice = (int) (dice + position);
				System.out.println("Number of dice Player1 Played " + dice);
				System.out.println("----------------------------");
				Player2 = dice;
				
				System.out.println("Current Position is " + counter);
				System.out.println("Number of dice Player2 Played " + dice);
				System.out.println("----------------------------");
				}
		}
			if (Player1 > Player2)
			System.out.println("!!!Player1 Wins the game!!!");
			else{
				System.out.println("!!!Player2 Wins the game!!!");
			}
	}
}
