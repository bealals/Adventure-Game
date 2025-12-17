public class WaitPuzzle {

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

        long secondsWaited = (currentTime - startTime) / 1000;

        if (secondsWaited >= 10) {
            System.out.println("After waiting patiently, a hidden compartment opens!");
            solved = true;
            return true;
        }

        System.out.println("You have waited " + secondsWaited + " seconds...");
        return false;
    }

    public String getDescription() {
        return "A strange device hums quietly. Waiting may be the key.";
    }
}
