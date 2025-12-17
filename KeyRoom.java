public class KeyRoom {
// This class is fairly simple, since it only is meant to be able to unlock a door, which also happens to be the most that some of the rooms are meant to do
// The main purpose of this class is mainly to create a break area where all the player is needed to do is simply insert and turn a key
    // sets as default
    private boolean inserted = false;

    public boolean attempt(String input){
        input = input.toLowerCase().trim();
        if (input.equals("insert key")){
            inserted = true;
            System.out.println("Key inserted.");
            return false;
        }
        if (input.equals("turn key") && inserted){
            System.out.println("Door unlocked."); // this is what you want
            return true;
        }
        System.out.println("Nothing happens."); // this is what you don't want
        return false;
    }
}

    

