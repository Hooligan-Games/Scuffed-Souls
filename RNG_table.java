import java.util.Scanner;
public class RNG_table {
//	the string scanner is used for the decisions in combat and mini decisions when not in gameplay
//	the number scanner is used for the random chance that happens 
	private static Scanner strScan = new Scanner(System.in);
	private static Scanner numScan = new Scanner(System.in);
	
	public static void RNG() {
//		player and enemy hit chance, out of 20
		int enemy = atk(20);
		int player = atk(20);
		
//		enemy hit chance
		if (enemy < 20) {
			System.err.println("you died");
		} else {
			System.out.println("you lived");
			
		}
//		player hit chance
		if (player == 20) {
			System.out.println("you killed it, test");
			if (enemy <= 2) {
				System.err.println("despite killing it you died along with it");
			} else {
				System.out.println("you won the encounter");
			}
		} else {
			System.out.println("you missed, test");
		}
	}
	
//	actual RNG table
	private static int atk(int sides) {
		int roll = (int)(Math.random()*sides+1);
		System.out.println(roll);
		return roll;
	}
}