import java.util.Scanner;

public class DragonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;

        Dragon dragon = new Dragon();
        dragon.x = 0;
        dragon.y = 0;
        
        while (!dragon.isError) {
            System.out.println("Type 'W' : Up\nType 'A' : Left\nType 'S' : Down\nType 'D' : Right");
            System.out.print("Your input : ");
            input = sc.nextLine();
            
            
            System.out.println("\033[H\033[2J");
            if (input.equals("w")) {
                dragon.moveUp();
            } else if (input.equals("a")) {
                dragon.moveLeft();
            } else if (input.equals("s")) {
                dragon.moveDown();
            } else if (input.equals("d")) {
                dragon.moveRight();
            } else {
                System.out.println("Wrong input!");
            }
            dragon.printPosition();
        }
    }
}
