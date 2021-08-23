package day_4_pratice_problems.snakeLadder;

public class UC1_Snake_Ladder {
	public static void main(String[] args) {	
		System.out.println("The Player rolls the die\r\n"
				+ "to get a number\r\n"
				+ "between 1 to 6.");
		int Rolling = (int) Math.floor(Math.random() * 10 ) % 6 + 1;
		System.out.println(Rolling);	
	}
}
