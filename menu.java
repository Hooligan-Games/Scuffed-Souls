import java.util.Scanner;
import java.util.Collections;


class menu {
   public static void main(String Args[]) {
       Scanner scanner = new Scanner(System.in);
       String input = "";
       boolean menu = true;
       boolean grenade = true;
       int swordDamage = 1;

       while(menu) {
        System.out.println("Welcome to Scuffed Dark Souls \n Start - starts the game \n Exit - exits game");
        
        input = scanner.nextLine();


        if(input.equalsIgnoreCase("Exit")) {
            System.out.println("Exiting program now");
            break;
        } else if(input.equals("Start")) {
            startGame();
        }
       }
       scanner.close();
   }

   public static void startGame() {
        
   }
}
