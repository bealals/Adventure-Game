import java.util.Scanner;
// This is the main runner class. It asks for the person's name before starting up with the gameplay.
// From there, it implements the Room.java class, which includes every other special class I have chosen to include
public class Game{

    public static void main(String[] args){
        new Game().start();
    }
        // get user input so it feels more interactive with their gameplay
    private void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to be called?");
        String name = scanner.nextLine();

        String response = "Great choice, " + name + "!";
        System.out.println(response);

        Player player = new Player(name);
        Room room = new Room(player);

        System.out.print("Start the game? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")){
            room.start(); // starts game
        }

        // this is portrayed if the character reaches room 20 or just dies, depends on which one happens first
        if (player.hasEscaped()){
            System.out.println("Congratulations! You have successfully escaped the room!");
        } else {
            System.out.println("Game Over. Better luck next time!");
        }
        player.showStats();
        scanner.close();   
    }
}




   
