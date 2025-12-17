public class WaitPuzzle {
// This class uses a specific method where I am able to allow the player to need to wait for 10 seconds before they can continue
// I found this idea interesting, so I decided to use it twice, one at the very 2nd to last room to allow for the player to test their ability to wait
// And, if they aren't able to, then they may face a consequence
    // sets as default
    private long startTime = -1;
    private boolean solved = false;

    public boolean attemptWait() {
        long currentTime = System.currentTimeMillis();

        if (solved) {
            System.out.println("The compartment is already open.");
            return true;
        }

        if (startTime == -1) {
            startTime = currentTime;
            System.out.println("You decide to wait...");
            return false;
        }
        // this incorporates an actual amount of seconds rather than just counting loops
        long secondsWaited = (currentTime - startTime) / 1000;

        if (secondsWaited >= 10) {
            System.out.println("After waiting patiently, a hidden compartment opens!");
            solved = true;
            return true;
        }

        System.out.println("You have waited " + secondsWaited + " seconds...");
        return false;
    }

    // This is just so that when the player starts the class they are painted a picture
    public String getDescription() {
        return "A strange device hums quietly. Waiting may be the key.";
    }
}

