import java.util.Scanner;

public class Game{
        // get user input so it feels more interactive with their gameplay
    private String start(){
        Scanner data = new Scanner(system.in);
        System.out.println("What would you like to be called?");
        String name = data.nextLine();

        String response = "Great choice, " + name + "!";
        System.out.println(response);

        Scanner start = new Scanner(system.in);
        System.out.println("Would you like to start the game? (y/n)");
        String blank = start.nextLine();

        if (blank.equals("y")){
            Room().start();
        } else {
            break;
        }

    }
}




   