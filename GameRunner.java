import java.util.Scanner;
public class GameRunner{
    public static void main(String[] args){
        Game womp = new Game();  // creates a Magpie2 object named maggie		
        String greeting = womp.getGreeting();  // calls the getGreeting method 
                                               //     on the maggie object
        System.out.println(greeting);

        Scanner in = new Scanner (System.in);   // creates a Scanner object
                                                //   to read from the keyboard
        
        String statement = in.nextLine();       // reads a line of text 
                                                //   from the keyboard
            
        while (!statement.equals("Bye"))       // loop stopping condition
        {                  // calls the getResponse method on the maggie object
            String response = womp.getResponse(statement);                    
            System.out.println(response);         
            statement = in.nextLine();        
        }
        System.out.println("Have a nice day, I guess.");
        in.close();
    }
}