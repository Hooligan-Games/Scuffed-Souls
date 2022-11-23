import java.util.Scanner;

public class Option_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Option_3 treasure;
		RNG_table RNG;
//		the beginning where you start with a bit of lore and a few choices on what you can do
		System.out.println("t'was a normal day in the small village that you live in,\n"
				+ "and as a knight you are some of the members defending this small village of 200 people, while on post the higher-ups require your presence\n"
				+ "inside, they talk about a dongeon, one that has been wreaking havoc on the farms and the people, they say that this holy hand grenade, from the\n"
				+ "far, far lands of detroit was given to them as a deterrent against the deadly dongeon, however unknowing to your higher-ups you min-maxed all\n"
				+ "your stats to go into strength, perception, and agility, meaning that you are a glass cannon, not to mention having 1 luck, meaning that any\n"
				+ "attack you inflict on the enemy has a high chance to miss, and if you enter, you are cursed requiring the townspeople to kill you, but you\n"
				+ "have the option of not entering, so with a heavy heart you venture to the entrance of the dongeon, you have the choice to enter the dongeon\n"
				+ "but you have the choice to:\n"
				
//				your choices on what you can do
				+ "1"+ "	Enter\n"
				+ "2"+ "	Leave\n"
				+ "3"+ "	jump into the endless hole\n"
				+ "(type the number associated with the choice)\n"
				+ "(if you choose 3 it will brick your game)");
		
		int choice1 = input.nextInt();
		
		switch(choice1) {
			case 1:
//				when you enter the dungeon, you have 2 choices, fight the skeleton, or go for the treasure
				System.out.println("Upon entering you see 2 hallways, one appears to lead to a skeleton, and the other appears to lead to a treasure at the end\n"
						+ "it may contain a few things that might help you in your dungeon crawl, however how the treasure and the hallway is layed out makes\n"
						+ "the entire thing look like a trap\n"
						+ "do you choose to fight the skeleton, or go for the treasure\n"
						+ "1	Fight\n"
						+ "2	go for treasure\n"
						+ "(type the number associated with the choice)\n"
						+ "(the treasure looks like a trap, I don't think it's a good idea to go for it)");
				int choice2 = input.nextInt();
				if (choice2 == 1) {
					
				} else if (choice2 == 2) {
					Option_3.treasure();
				} else {
					System.err.println("actually type a number");
				}
				break;
			case 2:
				System.err.println("Coward");
				break;
			case 3:
				
				break;
		}
	}
	
}
