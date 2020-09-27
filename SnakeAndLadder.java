
public class SnakeAndLadder {
	public static void main(String args[]) {
		int p1 = 0;
		System.out.println("Welcome to snake and ladder game");
		int count = 0;
		while (p1 != 100) {
			count++;
			int i = (int) (Math.random() * 6 % 6) + 1;
			System.out.println("value on the dice: " + i);
			int o = (int) (Math.random() * 10 % 3);

			System.out.println("option: " + o);
			switch (o) {
			case 1: {
				System.out.println("Ladder");
				if ((p1 + i) < 101) {
					p1 += i;
					System.out.println("The new position of the player is: " + p1);
				}
				break;
			}
			case 2: {
				System.out.println("Snake");
				if (p1 - i > -1) {
					p1 -= i;
					System.out.println("The new position of the player is: " + p1);
				} else {
					p1 = 0;
					System.out.println("The new position of the player is: " + p1);
				}
				break;
			}
			default:
				System.out.println("No Movement");
			}
		}
		System.out.println("the dice was rolled "+count+" times");
		System.out.println("The player has won the game");

	}
}
