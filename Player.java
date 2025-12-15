public class Player{
    private String name;
    private int health;
    private int maxHealth;

    private boolean hasKey;
    private boolean hasFlashlight;
    private boolean hasCodeNote;
    private boolean hasCrowbar;
    private boolean hasPotion;

    private int puzzleSolved;
    private boolean escape;

    public Player(String name){
        this.name = name;
        this.maxHealth = 100;
        this.health = this.maxHealth;
        this.hasKey = false;
        this.hasFlashlight = false;
        this.hasCodeNote = false;
        this.hasCrowbar = false;
        this.puzzleSolved = 0;
        this.escape = false;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println(this.name + " took " + damage + " damage. Current health: " + this.health);
    }

    public void heal(int amount){
        this.health += amount;
        if(this.health > this.maxHealth){
            this.health = this.maxHealth;
        }
        System.out.println(this.name + " healed " + amount + " health. Current health: " + this.health);
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public void obtainItem(String item){
        switch(item.toLowerCase()){
            case "key":
                this.hasKey = true;
                System.out.println(this.name + " obtained a key.");
                break;
            case "flashlight":
                this.hasFlashlight = true;
                System.out.println(this.name + " obtained a flashlight.");
                break;
            case "codenote":
                this.hasCodeNote = true;
                System.out.println(this.name + " obtained a code note.");
                break;
            case "crowbar":
                this.hasCrowbar = true;
                System.out.println(this.name + " obtained a crowbar.");
                break;
            case "potion":
                this.hasPotion = true;
                System.out.println(this.name + " obtained a potion.");
                break;
            default:
                System.out.println("Unknown item: " + item);
        }
    }

    public void solvedPuzzle(){
        this.puzzleSolved++;
    }

    public boolean canOpen(){
        return this.hasKey && this.puzzleSolved >= 3;
    }

    public void escape(){
        if(this.canOpen()){
            this.escape = true;
            System.out.println(this.name + " has escaped!");
        } else {
            System.out.println(this.name + " cannot escape yet.");
        }
    }

    public boolean hasEscaped(){
        return this.escape;
    }

    public void showStats(){
        System.out.println("----- *** Player Stats *** -----");
        System.out.println("Player: " + this.name);
        System.out.println("Health: " + this.health + "/" + this.maxHealth);
        System.out.println("Has Key: " + this.hasKey);
        System.out.println("Has Flashlight: " + this.hasFlashlight);
        System.out.println("Has Code Note: " + this.hasCodeNote);
        System.out.println("Has Crowbar: " + this.hasCrowbar);
        System.out.println("Has Potion: " + this.hasPotion);
        System.out.println("Puzzles Solved: " + this.puzzleSolved);
        System.out.println("Has Escaped: " + this.escape);
        System.out.println("--------------------------------");
    }
}