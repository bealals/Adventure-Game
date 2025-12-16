public class WaitPuzzle{

    private int waits = 0;
    private boolean attemptWait = false;

    public boolean attemptWait(String action) {
        if (action.equalsIgnoreCase("wait")) {
            waits++;
            if (waits < 10) {
                System.out.println("You wait patiently. Nothing happens.");
                return false;
            } else if (waits == 10) {
                System.out.println("A hidden compartment opens, revealing a key!");
                return true;
            } else {
                System.out.println("You have already found the key. There's nothing more to do here.");
                return true;
            }
        } else {
            return false;
        }
    }
    
    @ Override
    
    public String getDescription() {
        return "A strange device stands before you. Acting too fast might be dangerous.";
    }

}
