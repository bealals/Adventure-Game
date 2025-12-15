public class KeyRoom {

    private boolean keyInserted = false;

    public boolean attempt(String input){
        input = input.toLowerCase().trim();
        if (input.equals("insert key")){
            keyInserted = true;
            System.out.println("The key fits...");
            return false;
        }
        if (input.equals("turn key")){
            if (keyInserted){
                System.out.println("You hear a click as the door unlocks.");
                return true;
            } else {
                System.out.println("You need to insert the key first.");
                return false;
            }
        }

        System.out.println("The heavy door does not budge.");
        return false;
    }

    @Override

    public String getDescription() {

        return "A heavy door blocks your way out. It has a keyhole.";
    
    }
}

    