import java.util.Scanner;
// This class implements some danger into the game... there are three different types of rooms, which can all cause fatal outcomes
// There are different actions that the player can act on, being powering off, opening a vent, and crouching. All of these things will be necessary for their survival
// The different escape rooms aren't supposed to show up in any specific order either, since I implemented a method, in which case I can randomize the choosing of the rooms (not using lists)
// After a room is chosen, it is removed from the options so that no one spends the entirety of their game repeating the same room

public class EscapeRoom {

    private Player player;
    // sets as default
    private boolean powerOff = false;
    private boolean ventOpened = false;
    private boolean crouched = false;

    private boolean panelRoomAvailable = true;
    private boolean gasRoomAvailable = true;
    private boolean bladeRoomAvailable = true;

    public EscapeRoom(Player player) {
        this.player = player;
    }

    // This is the main section where everything starts and then it implements the rest of the features
    public boolean start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your head throbs. Something is wrong.");

        while (panelRoomAvailable || gasRoomAvailable || bladeRoomAvailable) {
            playRandomRoom(scanner);

            if (!player.isAlive()) {
                System.out.println("\nYou have succumbed to your injuries.");
                System.out.println("Final Health: " + player.getHealth() + "/" + player.getMaxHealth());
                return false;
            }
        }
        System.out.println("\nYou escape the room—alive.");
        System.out.println("Final Health: " + player.getHealth());
        scanner.close();
        return true;
    }
        
    // This randomizes the rooms and removes it each time the room is chosen
    private void playRandomRoom(Scanner scanner) {
        int choice;

        while (true) {
            choice = (int)(Math.random() * 3) + 1;

            if (choice == 1 && panelRoomAvailable) {
                panelRoomAvailable = false;
                electricalPanel(scanner);
                break;
                }

            if (choice == 2 && gasRoomAvailable) {
                gasRoomAvailable = false;
                gasRoom(scanner);
                break;
            }

            if (choice == 3 && bladeRoomAvailable) {
                bladeRoomAvailable = false;
                bladeDoor(scanner);
                break;
            }
        }
    }

    private void electricalPanel(Scanner scanner) {
        System.out.println("\nA damaged electrical panel crackles with energy.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("inspect panel")) {
               System.out.println("Exposed wires spark violently.");
            } else if (input.equals("pull red wire") && !powerOff) {
                player.takeDamage(30);
                System.out.println("Electricity surges through you!");
            } else if (input.equals("flip breaker")) {
                powerOff = true;
                System.out.println("The power shuts down.");
                break;
            } else {
                System.out.println("Nothing happens.");
            }
        }
    }

    private void gasRoom(Scanner scanner) {
        System.out.println("\nA faint green gas seeps into the room.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("breathe") && !ventOpened) {
                player.takeDamage(15);
                System.out.println("The gas burns your lungs.");
            } else if (input.equals("open vent")) {
                ventOpened = true;
                System.out.println("Fresh air rushes in.");
                break;
            } else {
                System.out.println("The gas hisses softly.");
            }
        }
    }
    
    private void bladeDoor(Scanner scanner) {
        System.out.println("\nSpinning blades block the exit door.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("run through")) {
                player.takeDamage(40);
                System.out.println("Blades slash across your body!");
            } else if (input.equals("crouch")) {
                crouched = true;
                System.out.println("You lower yourself close to the floor.");
            } else if (crouched && input.equals("move slowly")) {
                System.out.println("You pass safely beneath the blades.");
                break;
            } else {
                System.out.println("The blades spin rapidly.");
            }
        }
    }       
}

