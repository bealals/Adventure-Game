import java.util.Scanner;

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
            room.start();
        }

        if (player.hasEscaped()){
            System.out.println("Congratulations! You have successfully escaped the room!");
        } else {
            System.out.println("Game Over. Better luck next time!");
        }
        player.showStats();
        scanner.close();   
    }
}




   
