public class Player{
    // This class is meant to act as an inventory almost, but also the overall standard for the player. As they move throughout the rooms/floors,
    // they are faced with different items that they can obtain, and for some of it, it's required for them to have said item in order to complete certain tasks.
    // Along with that, there is their typical health status which shows how well off the player is doing in regards to their progress.
    // Finally, at the bottom, there is a method to show the player's statistics, in which case they can pull up whenever they so please and will automatically show up at the end of the gameplay.
    NewRoom room = new NewRoom(this); // create a new room instance for the player to interact with

    private String name;
    private int health;
    private int maxHealth;

    private boolean hasRustyKey;
    private boolean hasFlashlight;
    private boolean hasCodeNote;
    private boolean hasCrowbar;
    private boolean hasPotion;
    private boolean hasGoldenKey;
    private boolean escaped;
    private int playerX; // player's current X position on the map
    private int playerY; // player's current Y position on the map
    private int currRoom(playerX, playerY); // player's current room number

    // sets everything to default
    public Player(String name){
        this.name = name;
        maxHealth = 100;
        health = maxHealth;

        hasRustyKey = false;
        hasGoldenKey = false;
        hasFlashlight = false;
        hasCodeNote = false;
        hasCrowbar = false;
        hasPotion = false;

        escaped = false;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            health = 0;
        }
        System.out.println(name + " took " + damage + " damage. Current health: " + health);
    }

    public void heal(int amount){
        health += amount;
        if(health > maxHealth){
            health = maxHealth;
        }
        System.out.println(name + " healed " + amount + " health. Current health: " + health);
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth(){
        return health;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public void obtain(String item){
        switch(item.toLowerCase()){
            case "rusty key": hasRustyKey = true; break;
            case "flashlight": hasFlashlight = true; break;
            case "codenote": hasCodeNote = true; break;
            case "crowbar": hasCrowbar = true; break;
            case "potion": hasPotion = true; break;
            case "golden key": hasGoldenKey = true; break;
        }
        System.out.println("Obtained: " + item);
    }

    public boolean has(String item){
        switch(item.toLowerCase()){
            case "rusty key": return hasRustyKey;
            case "flashlight": return hasFlashlight;
            case "codenote": return hasCodeNote;
            case "crowbar": return hasCrowbar;
            case "potion": return hasPotion;
            case "golden key": return hasGoldenKey;
        }
        return false;
    }

    public void escape(){
        escaped = true;
    }

    public boolean hasEscaped(){
        return escaped;
    }

    public void showStats(){
        System.out.println("\n--- PLAYER STATS ---");
        System.out.println("Name: " + name);
        System.out.println("Current Room: " + room.describeCurrentRoom());
        System.out.println("Golden Key: " + hasGoldenKey);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Escaped: " + escaped);
        System.out.println("-------------------");
    }
}
