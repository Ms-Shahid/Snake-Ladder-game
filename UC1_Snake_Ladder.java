package day_4_pratice_problems.snakeLadder;

public class UC1_Snake_Ladder {

	public static void main(String[] args) {
		System.out.println("Snake And ladder Game using Single Player");
		System.out.println("Game Starts Here !! (: ");
		int counter = 0, position = 0;
		while (counter <= 100 || counter > 100) {
			if (counter > 100) {
				counter = counter - position;
			}
			else if (counter == 100) {
					System.out.println("** Wooo! Player Wins! **");
					break;
				}
			int Rolling = (int)Math.floor(Math.random() * 10 ) % 6 + 1;
			int randomPlayer = (int)Math.floor(Math.random() * 10 ) % 3;

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
		}
	}
}
