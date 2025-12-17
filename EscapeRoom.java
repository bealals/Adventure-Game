import java.util.Scanner;

public class EscapeRoom {

    private Player player;

    private boolean powerOff = false;
    private boolean ventOpened = false;
    private boolean crouched = false;

    private boolean panelRoomAvailable = true;
    private boolean gasRoomAvailable = true;
    private boolean bladeRoomAvailable = true;

    public EscapeRoom(Player player) {
        this.player = player;
    }

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
