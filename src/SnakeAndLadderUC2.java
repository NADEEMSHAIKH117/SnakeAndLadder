
public class SnakeAndLadderUC2 {
	
	public static void main(String[] args) {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		
		int RollDice=(int) ( (Math.floor (Math.random() * 10) % 6) + 1);
		System.out.println("The Dice Roll is "+RollDice);

	}

}
