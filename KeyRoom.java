public class KeyRoom {

    private boolean inserted = false;

    public boolean attempt(String input){
        input = input.toLowerCase().trim();
        if (input.equals("insert key")){
            inserted = true;
            System.out.println("Key inserted.");
            return false;
        }
        if (input.equals("turn key") && inserted){
            System.out.println("Door unlocked.");
            return true;
        }
        System.out.println("Nothing happens.");
        return false;
    }
}

    
