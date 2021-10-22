public class SnakeAndLadderUC6 {


		SnakeAndLadderUC6() {
		System.out.println("Snake and Ladder game played with single player at start position 0");
		}

		void Game(){
			int PlayerPosition1=0;
			int PlayPosition=0;
			int DiceRollCount=0;
			int Play=0;

			while (PlayerPosition1 < 100 ) {

				int RollDice=(int) ( (Math.floor (Math.random() * 10) % 6) + 1);
				System.out.println("The Dice Roll is "+RollDice);
				DiceRollCount++;
				Play++;
				

				int PlayerCheck=(int) Math.floor(Math.random() * 10) % 3;
				// PlayerCheck= 0 Then Player goes down by Snake
				// PlayerCheck= 1 Then Player  Not Play
				// PlayerCheck= 2 Then Player climb Ladder

				switch (PlayerCheck) {
					case 0:
							System.out.println("SNAKE");
							PlayPosition-=RollDice;
							break;
					case 1:
							System.out.println("No Play");
							break;
					case 2:
							System.out.println("LADDER");
							PlayPosition+=RollDice;
							RollDice=(int) ( (Math.floor (Math.random() * 10) % 6) + 1);
							PlayPosition+=RollDice;
							DiceRollCount++;
							break;
						}

				if((Play%2) == 0){
					PlayerPosition1+=PlayPosition;

					if(PlayerPosition1 < 0)
							PlayerPosition1=0;

					if(PlayerPosition1 > 100)
							PlayerPosition1-=PlayPosition;

					System.out.println("Player1 Position is "+PlayerPosition1);
						}
			
				PlayPosition=0;
			}
			System.out.println("Dice Roll Count is "+DiceRollCount);
		}
		public static void main(String args[]) {
		SnakeAndLadderUC6 Snake=new SnakeAndLadderUC6();

		Snake.Game();
		}
	}


