import java.util.Scanner;

public class NewRoom {
    private int playerX = 0; // starting point
    private int playerY = 0; // starting point
    
    private int[][] map = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
    };

    private Player player;

    public NewRoom(Player player) {
        this.player = player;
    }
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    private void moveNorth() {
        map[playerX][playerY + 1] = 1; // move north
    }

    private void moveSouth() {
        map[playerX][playerY - 1] = 1; // move south
    }

    private void moveEast() {
        map[playerX + 1][playerY] = 1; // move east
    }

    private void moveWest() {
        map[playerX - 1][playerY] = 1; // move west
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (N/S/E/W)");
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "N":
                moveNorth();
                break;
            case "S":
                moveSouth();
                break;
            case "E":
                moveEast();
                break;
            case "W":
                moveWest();
                break;
            default:
                System.out.println("Invalid direction. Please enter N, S, E, or W.");
        }
    }

    public int getCurrRoom() {
        return map[playerX][playerY];
    }

    public String describeCurrentRoom() {
        getCurrRoom();
        if (getCurrRoom() == map[0][0]) {
            return "You are in room 1.";
        } else if (getCurrRoom() == map[0][1]) {
            return "You are in room 2.";
        } else if (getCurrRoom() == map[0][2]) {
            return "You are in room 3.";
        } else if (getCurrRoom() == map[0][3]) {
            return "You are in room 4.";
        } else if (getCurrRoom() == map[0][4]) {
            return "You are in room 5.";
        } else if (getCurrRoom() == map[1][0]) {
            return "You are in room 6.";
        } else if (getCurrRoom() == map[1][1]) {
            return "You are in room 7.";
        } else if (getCurrRoom() == map[1][2]) {
            return "You are in room 8.";
        } else if (getCurrRoom() == map[1][3]) {
            return "You are in room 9.";
        } else if (getCurrRoom() == map[1][4]) {
            return "You are in room 10.";
        } else if (getCurrRoom() == map[2][0]) {
            return "You are in room 11.";
        } else if (getCurrRoom() == map[2][1]) {
            return "You are in room 12.";
        } else if (getCurrRoom() == map[2][2]) {
            return "You are in room 13.";
        } else if (getCurrRoom() == map[2][3]) {
            return "You are in room 14.";
        } else if (getCurrRoom() == map[2][4]) {
            return "You are in room 15.";
        } else if (getCurrRoom() == map[3][0]) {
            return "You are in room 16.";
        } else if (getCurrRoom() == map[3][1]) {
            return "You are in room 17.";
        } else if (getCurrRoom() == map[3][2]) {
            return "You are in room 18.";
        } else if (getCurrRoom() == map[3][3]) {
            return "You are in room 19.";
        } else if (getCurrRoom() == map[3][4]) {
            return "You are in room 20.";
        } else {
            return "You are in an unknown room.";
        }
    }
    
    Descriptions descriptions = new Descriptions(); // create a new instance of the Descriptions class to access its methods

    System.out.println(descriptions.descriptionOne); // print the description of the first room


}