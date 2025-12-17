import java.util.Scanner;
// This is my big boy class - it incorportates every class that isn't the Game.java class, since the Game.java class relies soley on this one
// All the rooms are decided into their own specific methods, using switch-case as a means for moving smoothly in between classes, 
// also allowing for the person to jump between rooms without a certain order being necessary
// Most of the rooms feature a good amount of dialogue, since I want this to be an interactive experience where the player feels like they're too intruiged to not cotinue playing
public class Room {

    private Player player;
    private static Scanner scanner = new Scanner(System.in);
    public int currRoom = 1;

    // this ensures that none of the escape rooms repeat
    private boolean escapeRoomOneUsed;
    private boolean escapeRoomTwoUsed;
    private boolean escapeRoomThreeUsed;

    private EscapeRoom playRandomRoom() {
        if (escapeRoomOneUsed && escapeRoomTwoUsed && escapeRoomThreeUsed) {
            escapeRoomOneUsed = false;
            escapeRoomTwoUsed = false;
            escapeRoomThreeUsed = false;
        }
        int choice;
        while (true) {
            choice = (int)(Math.random() * 3);

            if (choice == 0 && !escapeRoomOneUsed) {
                    escapeRoomOneUsed = true;
                return new EscapeRoom(player);
            }
            if (choice == 1 && !escapeRoomTwoUsed) {
                escapeRoomTwoUsed = true;
                return new EscapeRoom(player);
            }
            if (choice == 2 && !escapeRoomThreeUsed) {
                escapeRoomThreeUsed = true;
                return new EscapeRoom(player);
            }
        }
    }

    public Room(Player player) {
        this.player = player;
    }

    // This allows for people to properly switch between rooms
    public void start(){
        while (currRoom > 0){
            switch (currRoom) {
                case 1: roomOne(); break;
                case 2: roomTwo(); break;
                case 3: roomThree(); break;
                case 4: roomFour(); break;
                case 5: roomFive(); break;
                case 6: roomSix(); break;
                case 7: roomSeven(); break;
                case 8: roomEight(); break;
                case 9: roomNine(); break;
                case 10: roomTen(); break;
                case 11: roomEleven(); break;
                case 12: roomTwelve(); break;
                case 13: roomThirteen(); break;
                case 14: roomFourteen(); break;
                case 15: roomFifteen(); break;
                case 16: roomSixteen(); break;
                case 17: roomSeventeen(); break;
                case 18: roomEighteen(); break;
                case 19: roomNineteen(); break;
                case 20: roomTwenty(); break;
                default: System.out.println("You dead :p"); break;
                
            }
        }
    }

    private void roomOne(){
        System.out.println("You see a door, old and wooden, standing before you."); 
        System.out.println("Before you can decide to turn back, *creak* the door opens, granting you entrance into the mysterious chamber.");

        System.out.println("Would you like to continue? (y/n)");
        String decisionOne = scanner.nextLine();

        if (!decisionOne.equalsIgnoreCase("y")){
            currRoom = 0;
            return;
        }

        System.out.println("You choose to enter the chamber... As you welcome yourself in, a cold breeze caresses your skin, bringing a familiar numbness to your initially relaxed state of mind.");
        System.out.println("The lights flicker on, before *slam*, the door closes behind you. You try to reopen it, but it's locked.");

        System.out.println("Would you like to... \n(a) Continue exploring \n(b) Try to find some way out ");
        String decisionTwo = scanner.nextLine().toLowerCase();

        if (decisionTwo.equals("a")){
            System.out.println("You decide that since the door is locked, it must be a sign for you to continue exploring this chamber.");
            System.out.println("You move throughout the space, and as the cold air brushes past your face, you begin to feel a discomfort.");
            System.out.println("The lights begin to flicker rapidly.\nThe floor beneathe you begins to shake.\nChains that were once held to the ceiling are falling before you, as you are forced to move away from them.");
            System.out.println("You fall to the floor as you feel your body being pushed to the ground. Curling into a fetal position to protect yourself,\nshaking,\nit stops.\nYou scurry back onto your feet, staring at the mess that lies before you. *ding*");

            currRoom = 2;

        } else if (decisionTwo.equals("b")) {
            System.out.println("You feel the panic set in as you realize you are trapped. \nEager to free yourself, you helplessly search throughout this unfamiliar hell you've trapped yourself into.");
            System.out.println("When you travel across the chamber, you begin to see a bundle of bright colors in the corner of the area.");
            System.out.println("As you move closer, you are able to recognize them for being 3 main wires.");
            System.out.println("You glance back up at the closed door that mocks you in your misery, and decide that that only hope of freedom you have is through these 3 wires.");

            System.out.println("Which wire will you choose to cut? (1/2/3)");
            int decisionThree = Integer.parseInt(scanner.nextLine());

            if (decisionThree == 1){
                System.out.println("*ding*");
                currRoom = 13;
            } else if (decisionThree == 2){
                System.out.println("You fall to the floor as you feel your body being pushed to the ground. Curling into a fetal position to protect yourself,\nshaking,\nit stops.\n*ding*");
                currRoom = 2;
            } else if (decisionThree == 3){
                System.out.println("You hear a faint whirr in the distance. Did you do it? Are you free?\n");
                currRoom = 0;
                return;
            }
        }
    }

        private void roomTwo(){
            System.out.println("You open your eyes, feeling a sharp pain slide up your spine. Glancing down at the surface that brought you here, lights flash on.");
            System.out.println("As you glance around, you see a room outside the elevator door. Shaking, you choose to step out and explore this secondary area.");
            System.out.println("The room is small - you can almost see the entirety of it from standing still. There is a table with a candelabra resting on top. A lighter lay peacefully beside it.");
            System.out.println("Your hands shake as you carefully pick up the lighter.");
            System.out.println("Would you like to... \n(a) Light the candelabra \n(b) Ignore it...for safety ");
            String decisionFour = scanner.nextLine().toLowerCase();

            if (decisionFour.equals("a")){
                System.out.println("You light the candelabra from left to right...");
                System.out.println("The room begins to shake, and the wall before opens to display a compartment.");
                player.obtain("crowbar");
                System.out.println("You see the crowbar and decide to take it, just in case...");
                System.out.println("As you move back to the elevator, crowbar in your hand, you begin to wonder what lies before you now...");
                System.out.println("*ding*");

                currRoom = 3;
            } else if (decisionFour.equals("b")){
                System.out.println("You decide it's not worth the risk. You turn away and begin walking back to your starting point. Before you reach the elevator doors, you look back and wonder what may have happened if the stakes were lower.");
                System.out.println("You feel a sense of calm wash over you before the elevator doors slam shut, unlike the way they have been before. You swiftly change your focus to them, before you feel a slight drop in the position."); 
                System.out.println("Before you can react, you get pushed to the ground as you feel a strong force moving upwards...");

                currRoom = 12;
            }
        }
        private void roomThree(){
            System.out.println("As the door opens in front of you, you feel a weird sensation. It feels rather warm, almost like being back in your bed.");
            System.out.println("You step out of the elevator, feeling the soft carpet beneath your feet. As you glance around, you see a cozy room with a fireplace, a comfy chair, and a vintage bookshelf.");
            System.out.println("You look down at the crowbar in your hand, wondering if it will be useful here.");
            System.out.println("Would you like to... \n(a) Inspect the fireplace \n(b) Check out the bookshelf ");

            String decisionFive = scanner.nextLine().toLowerCase();

            if (decisionFive.equals("a")){
                System.out.println("You approach the fireplace, noticing the warm glow of the flames. As you get closer, you see something shiny in the ashes...");
                System.out.println("You tap at it with your crowbar, feeling the hot metal against your palms.");
                player.takeDamage(10);
                System.out.println("You notice that it's a cabinet! You stick your crowbar into the small gap and attempt to pry it open.");
                System.out.println("Unfortunately, the cabinet is stuck tight. You decide to leave it alone for now, choosing to further explore this room...");
            } else if (decisionFive.equals("b")){
                System.out.println("You walk over to the bookshelf, running your fingers along the spines of the books. One of them catches your eye...");
                System.out.println("It's a book about the history of this building. As you scroll through the pages, a small note falls out.");
                if (!player.has("codenote")) {
                    player.obtain("codenote");
                }
                System.out.println("Pocketing the note, you choose to further your exploration of this calming room...");
                System.out.println("You feel good about the stuff you've found so far. You head back to the elevator, awaiting for where it will take you next...");
                currRoom = 4;
            }

            System.out.println("You begin to feel drowsy, the warmth of the room lulling you into a sense of comfort. You decide to sit in the comfy chair for a moment, closing your eyes.");
            player.takeDamage(15);
            System.out.println("As you doze off, you feel the room begin to spin. You try to stand up, but the world around you fades to black...");
            System.out.println("*ding*");

            currRoom = 5;
        }
        private void roomFour(){
            System.out.println("You step out of the elevator, feeling a cool breeze brush past your face. The room before you is vast, with high ceilings and ornate decorations.");
            System.out.println("As you look around, you notice a grand staircase leading up to a balcony. There are also several doors lining the walls.");
            System.out.println("Would you like to... \n(a) Explore the balcony \n(b) Check out the doors ");

            String decisionSix = scanner.nextLine().toLowerCase();

            if (decisionSix.equals("a")){
                System.out.println("You ascend the grand staircase, feeling the plush carpet beneath your feet. As you reach the balcony, you see a stunning view of the entire room below.");
                System.out.println("You notice a small table with a vase of flowers and a note beside it.");
                player.obtain("potion");
                System.out.println("You pick up the note, which reads: 'For those in need of healing, take this potion.' You pocket the potion, feeling grateful for the unexpected gift.");
                System.out.println("After taking in the view, you decide to head back down...");
            } else if (decisionSix.equals("b")){
                System.out.println("You approach one of the doors lining the walls, feeling curious about what lies beyond. You try the handle, and to your surprise, it opens easily.");
                System.out.println("Inside, you find a small study filled with books and papers. On the desk, there's a flashlight resting beside a stack of documents.");
                player.obtain("flashlight");
                System.out.println("You pick up the flashlight, knowing it will be useful in dark places. After exploring the study, you decide to head back to the elevator...");
            }

            System.out.println("Feeling satisfied with your exploration, you make your way back to the elevator, wondering where it will take you next...");
            currRoom = 6;
            return;
        }
        private void roomFive(){
            System.out.println("You awaken to find yourself in a dimly lit room, the walls adorned with strange symbols that seem to glow faintly.");
            System.out.println("You glance down and realize that you're still on the same comfy couch from before, but the room feels different now.");
            
            EscapeRoom escape = new EscapeRoom(player);
            escape.start();

            if (player.isAlive()){
                System.out.println("You manage to survive the dangers of the room, feeling a sense of relief wash over you.");
                System.out.println("As you catch your breath, you notice a small key lying on the floor beside you.");
                player.obtain("rusty key");
                System.out.println("You pick up the key, wondering what it might unlock in this mysterious place.");
                System.out.println("Feeling determined, you make your way back to the elevator, eager to continue your journey...");
                currRoom = 7;
                return;
            } else {
                System.out.println("Your vision fades to black as you succumb to the dangers of the room. You feel a coldness enveloping you as everything goes silent.");
                currRoom = 0;
                return;
            }
        }
        private void roomSix(){
            System.out.println("You walk out of the elevator, looking at a bright utopia that stands before you.");
            System.out.println("The sky is a perfect shade of blue, with fluffy white clouds drifting lazily across it.");
            System.out.println("Birds chirp happily in the trees, and a waterfall cascades down a rocky cliff in the distance.");
            System.out.println("You take a deep breath, feeling the fresh air fill your lungs.");
            System.out.println("As you explore this beautiful place, you notice a small cottage nestled among the trees.");
            System.out.println("Curious, you decide to approach it...");
            System.out.println("By the time you reach it, you try to open the door. The door isn't a door at all");
            System.out.println("*ding*");
            System.out.println("You look back the elevator you came from, then back at this new one.");
            System.out.println("Do you want to enter the new elevator or go back to the previous one? (new/old)");
            
            String decisionSeven = scanner.nextLine().toLowerCase();

            if (decisionSeven.equals("new")){
                System.out.println("You step into the new elevator, feeling a sense of anticipation.");
                System.out.println("As the doors close, you feel a strange sensation, as if the elevator is moving sideways rather than up or down.");
                System.out.println("You brace yourself for whatever lies ahead...");
                currRoom = 14;
                return;
            } else if (decisionSeven.equals("old")){
                System.out.println("You decide to return to the previous elevator, as you're far more familiar with it.");
            
                System.out.println("You step back into the old elevator, feeling a sense of relief as the doors close behind you.");
                currRoom = 8;
                return;
            }
        }
        private void roomSeven(){
            System.out.println("You hold the rusty key tightly in your hand as the elevator doors slide open.");
            System.out.println("Stepping out, you find yourself in a dimly lit room with a massive door dominating one wall.");
            System.out.println("The door has a keyhole that seems to match the key you possess.");
            System.out.println("Would you like to... \n(a) Insert the key into the keyhole \n(b) Inspect the room further ");
            
            String decisionEight = scanner.nextLine().toLowerCase();

            if (!player.has("rusty key")) {
                System.out.println("You fumble for a key you do not have.");
                currRoom = 8;
                return;
            }
            KeyRoom keyRoom = new KeyRoom();

            if (decisionEight.equals("a")) {
                boolean doorUnlocked = false;
                while (!doorUnlocked) {
                    System.out.println("What would you like to do? (insert key/turn key/other)");
                    String action = scanner.nextLine().toLowerCase().trim();
                    doorUnlocked = keyRoom.attempt(action);
                }
                System.out.println("With the door now unlocked, you step through, eager to see what lies beyond...");
                currRoom = 14;
                return;
            } else if (decisionEight.equals("b")){
                System.out.println("You take a moment to inspect the room further, noticing intricate carvings on the walls and a faint glow emanating from the corners.");
                System.out.println("You decide to peer around the room, searching for something of use. Before you start to give up, you notice a dusted vent cover against one of the walls.");
                if (player.has("crowbar")){
                    System.out.println("Glancing down at the crowbar you've held onto, you decide to see if you can put it to use.");
                    System.out.println("Using the crowbar, the aged vent cover pops off, showing a narrow passageway.");
                    System.out.println("Since you've already come this far, you decide you don't have much to lose...");
                    System.out.println("You crawl through the vent, feeling the cool air brush past your skin as you navigate the tight space.");
                    System.out.println("After what feels like an eternity...");
                    currRoom = 20;
                    return;
                } else {
                    System.out.println("You try to pry open the vent with your bare hands, but it's firmly stuck in place.");
                    System.out.println("Realizing you need a tool to open it, you decide to leave it alone for now.");
                    System.out.println("You turn your attention back to the massive door with the keyhole, deciding that unlocking it is your best option.");
                }
                boolean doorUnlocked = false;
                while (!doorUnlocked) {
                    System.out.println("What would you like to do? (insert key/turn key/other)");
                    String action = scanner.nextLine().toLowerCase().trim();
                    doorUnlocked = keyRoom.attempt(action);
                }
                System.out.println("With the door now unlocked, you step through, eager to see what lies beyond...");
                currRoom = 9;
                return;
            }
        }
        private void roomEight(){
            System.out.println("*ding*");
            System.out.println("You feel the elevator come to a gentle stop. Taking a deep breath, you prepare yourself to step out once more.");
            System.out.println("You hold onto your hope for survival as the elevator doors open to reveal a dark, foreboding chamber.");
            System.out.println("There is an eery silence that fills the chamber, broken only by the sound of a chain falling to the floor.");
            if (player.has("flashlight")){
                System.out.println("You pull out the flashlight you found earlier, flicking it on to illuminate the room.");
                System.out.println("The beam of light cuts through the darkness, revealing a series of obstacles and dangers that lie ahead.");
                System.out.println("Steeling yourself, you step forward into the unknown...");
                EscapeRoom escape = playRandomRoom();
                escape.start();

                if (player.isAlive()){
                    System.out.println("You manage to survive the dangers of the room, feeling a sense of relief wash over you.");
                    System.out.println("As you catch your breath, you notice a small key lying on the floor beside you.");
                    if (!player.has("rusty key")){
                        player.obtain("rusty key");
                    }
                    System.out.println("You pick up the key, wondering what it might unlock in this mysterious place.");
                    System.out.println("Feeling determined, you make your way back to the elevator, eager to continue your journey...");
                    currRoom = 9;
                    return;
                } else {
                    System.out.println("Your vision fades to black as you succumb to the dangers of the room. You feel a coldness enveloping you as everything goes silent.");
                    currRoom = 0;
                    return;
                }
            } else {
                System.out.println("Without a source of light, you stumble blindly through the darkness, unable to see the dangers that lie ahead.");
                System.out.println("Suddenly, you feel a sharp pain as you're struck by an unseen obstacle.");
                if (player.has("potion")){
                    System.out.println("Quickly, you reach into your pocket and grab the healing potion you found earlier.");
                    player.heal(30);
                    System.out.println("Feeling rejuvenated, you cautiously make your way back to the elevator, grateful to have survived the ordeal.");
                    currRoom = 9;
                    return;
                } else {
                    System.out.println("Your vision fades to black as you succumb to the dangers of the room. You feel a coldness enveloping you as everything goes silent.");
                    currRoom = 0;
                    return;
                }
            }
        }
        private void roomNine(){
            System.out.println("The elevator doors chime open, revealing a sleek, modern room bathed in soft blue light.");
            System.out.println("The walls are lined with high-tech panels and screens, displaying a variety of data and information.");
            System.out.println("In the center of the room stands a large console, humming with energy.");
            System.out.println("As you step forward, you notice a small device resting on the console.");
            System.out.println("Would you like to... \n(a) Inspect the device \n(b) Explore the room further ");
            String decisionNine = scanner.nextLine().toLowerCase();
            if (decisionNine.equals("a")){
                System.out.println("You approach the console, feeling a sense of curiosity about the device.");
                System.out.println("As you pick it up, you notice a series of buttons and switches on its surface.");
                System.out.println("You begin to experiment with the device, pressing buttons and flipping switches at random.");
                System.out.println("Suddenly, the room begins to shake, and a small piece of paper slides out from a vent on the side of the device.");
                System.out.println("On the paper, you see a series of numbers and symbols that seem to form a code.");
                if (!player.has("codenote")) {
                    player.obtain("codenote");
                }
                System.out.println("Feeling satisfied with your discovery, you decide to head back to the elevator...");
            } else if (decisionNine.equals("b")){
                System.out.println("You decide to explore the room further, feeling that there may be more to discover.");
                System.out.println("As you move around the room, you notice a series of high-tech panels and screens lining the walls.");
                System.out.println("You begin to examine them closely, trying to decipher their purpose.");
                System.out.println("After a few moments, the ominous machine begins to whirr.");
                System.out.println("A tray is extended out to you, offering a bowl with a blue liquid inside.");
                System.out.println("You cautiously pick up the bowl, feeling a sense of intrigue about its contents.");
                System.out.println("Do you drink the liquid? (y/n)");
                String drinkDecision = scanner.nextLine().toLowerCase();
                if (drinkDecision.equals("y")){
                    System.out.println("You take a sip of the blue liquid, feeling a strange sensation wash over you.");
                    player.heal(50);
                    System.out.println("Feeling refreshed, you turn away from whatever may have been left in this high-tech room...");
                } else {
                    System.out.println("You decide against drinking the liquid, feeling that it may be too risky.");
                    System.out.println("Feeling satisfied with your discovery, you decide to head back to the elevator...");
                }
            }
            currRoom = 10;  
            return;    
        }
        private void roomTen(){
            System.out.println("The doors open, revealing a dimly lit room...with a single chair in the center. A smell of antiseptic fills the air.");
            System.out.println("Before you can attempt to investigate, the elevator doors slam shut in front of you. The lights begin to flicker, and the control panel that never showed light begins to flicker with colors across the rainbow.");
            System.out.println("You feel a sudden jolt as the elevator begins to move, the sensation of falling making your stomach churn.\nEven weirder...it feels like you're moving sideways...against gravity...");
            System.out.println("*ding*");
            System.out.println("*ding*");
            System.out.println("The doors begin to open and close rapidly, before finally settling. You step out, feeling a strange sensation wash over you.");

            System.out.println("The elevator comes to a sudden stop, taking a deep breath as you feel your neck cramp against the odd angle.");
            System.out.println("*ding*");
            currRoom = 11;
            return;
        }
        private void roomEleven(){
            System.out.println("You step out of the elevator, feeling dizzy - suddenly, you begin to feel yourself floating up...defying gravity...?");  
            System.out.println("You look around, seeing a room filled with floating furniture and objects, all suspended in mid-air.");
            System.out.println("You notice a small platform in the center of the room, with a lever sticking out of it.");
            System.out.println("Would you like to... \n(a) Pull the lever \n(b) Explore the room further ");
            String decisionEleven = scanner.nextLine().toLowerCase();
            if (decisionEleven.equals("a")){
                System.out.println("You make a swimming motion towards the lever, feeling the strange sensation of floating as you move through the air.");
                System.out.println("As you reach the lever, you grasp it firmly and pull it down. *crash*");
                player.takeDamage(25);
                System.out.println("Everything around you has fallen to the floor surrounding you. You feel a sharp pain as you hit the ground, but you manage to stay conscious.");
                System.out.println("You stare at the elevator door to your right...then back at a sofa in the corner...");
                System.out.println("Do you want to enter the elevator or explore the sofa? (elevator/sofa)");
                String exploreDecision = scanner.nextLine().toLowerCase();
                if (exploreDecision.equals("sofa")){
                    System.out.println("You approach the sofa, a scent of laavendar filling your senses. A sense of drowsiness overcomes you as you sit down.");
                    System.out.println("Maybe a small nap won't hurt...");
                    currRoom = 13;
                    return;
                } else {
                    System.out.println("You decide to head back to the elevator, feeling that it's the safest option.");
                    System.out.println("Before you can fully step in, you feel a push towards the elevator wall, the doors slamming shut while the elevator begins to spin rapidly...");
                    System.out.println("*ding*");
                    currRoom = 12;
                    return;
                }
            } else {
                System.out.println("Frozen in hesitation, the room shifts...");
                currRoom = 12;
                return;
            }      
        }
        private void roomTwelve(){
            System.out.println("You slowly stand up, still feeling the shock of being tossed in a mysterious elevator.");
            System.out.println("The elevator doors open, showing a room full of books...a library?");
            System.out.println("You walk around the strange library, glancing up at the elevator... 12th floor...");
            System.out.println("Wondering what lies in this library, you choose to explore the different aisles.");
            System.out.println("You pull out a book...it says *@&$^*#&$* on the front...interesting title...");
            System.out.println("As you turn the corner to the next aisle, you look closer at the shelf you are passing. The books don't look the same...");

            System.out.println("Before you can stop yourself, you try to pull out one of the books, only for it to seems stuck in place.");
            System.out.println("The lighting turns a shade of green, making your stomach nauseous.");

            WaitPuzzle wait = new WaitPuzzle();
            System.out.println(wait.getDescription());
            System.out.println("Type 'wait' to wait. Type anything else to leave.");

            while (true) {
                String decisionTwelve = scanner.nextLine().toLowerCase().trim();

                if (!decisionTwelve.equals("wait")) {
                    System.out.println("You watch as the walls look slanted, realizing that the room is tilting. You hold onto the shelf, but the aged wood cracks, sending you flying back into the elevator.");
                    System.out.println("As the pain flows through your body, you feel a strong tenseness wash over your body.");
                    System.out.println("You feel the elevator creek up, knowing that the next floor lies before you... *ding*");
                    currRoom = 14;
                    return;
                }

                if (wait.attemptWait()) {
                    player.obtain("rusty key");
                    System.out.println("You glance down at the key in your hand, feeling the worn metal oxidizing more every second.");
                    System.out.println("You pocket it, knowing that this weird hellhole isn't going to give you something you won't need...right?");

                    currRoom = 13;
                    return;
                }
            }
        }
        private void roomThirteen(){      // Death room hehe 13th floor i'm so cool
            System.out.println("Lying against the corner of the elevator, you stare at the floor that stands before you.");
            System.out.println("The lights are flickering, making your heart race. You feel a cold sweat before the light shut off completely.");
            System.out.println("In the darkness, you hear a faint buzzing sound growing louder and louder.");
            System.out.println("Suddenly, a bright light blinds you, as you feel a sharp pain shoot through your head.");
            System.out.println("You fall to the ground, clutching your head as the pain intensifies.");
            System.out.println("Before you can react...");

            System.out.println("You dead :p");
            currRoom = 0;
            return;
        }
        private void roomFourteen(){
            System.out.println("You step out of the elevator, feeling a strange sensation wash over you.");
            System.out.println("The room before you is dark and eerie, with shadows dancing on the walls.");
            System.out.println("As you look around, you notice a faint glow coming from a corner of the room.");
            System.out.println("You cautiously approach the glow, feeling a sense of unease as you get closer.");
            System.out.println("As you reach the corner, you see a small box emitting a soft light.");
            System.out.println("Would you like to... \n(a) Open the box \n(b) Leave it alone ");
            String decisionTwelve = scanner.nextLine().toLowerCase();
            if (decisionTwelve.equals("a")){
                System.out.println("You open the box, feeling a surge of energy as you do so.");
                System.out.println("Inside, you find a strange device that seems to be pulsing with power.");
                System.out.println("As you hold it in your hands, you feel a sudden jolt as the room begins to shake.");
                player.takeDamage(20);
                System.out.println("You manage to hold onto the device as the shaking subsides, feeling a sense of relief wash over you.");
                System.out.println("Feeling determined, you decide to head back to the elevator...");
            } else if (decisionTwelve.equals("b")){
                System.out.println("You decide against opening the box, feeling that it may be too risky.");
                System.out.println("As you turn away, you feel a sudden jolt as the room begins to shake.");
                player.takeDamage(10);
                System.out.println("You manage to steady yourself as the shaking subsides, feeling a sense of relief wash over you.");
                System.out.println("Feeling determined, you decide to head back to the elevator...");
            }
            currRoom = 15; 
            return;       
        }
        private void roomFifteen(){
            System.out.println("Before you can steady your breathing, you smell a familiar stench...the smell of the chair...the same one from before.");
            System.out.println("You look around, seeing the same dimly lit room with the single chair in the center.");
            System.out.println("You look carefully at your surroundings, and before the elevator can close, you charge outide the elevator, needing to understand what this is.");
            System.out.println("The lights flicker on, revealing dozens of manniquins standing around the room, their blank faces staring at you.");
            System.out.println("You feel a cold sweat run down your spine... you struggle to keep your composure as you try to make sense of the eerie scene before you.");
            System.out.println("As you peer around the room, you notice a small keypad resting at the foot of one of the manniquins.");
            System.out.println("You approach the keypad, feeling a sense of urgency to unlock whatever secrets it may hold.");
            System.out.println("On the keypad, you see a series of numbers and symbols that seem to form a code.");
            System.out.println("Do you want to try to enter the code? (y/n)");
            String decisionThirteen = scanner.nextLine().toLowerCase();
            
            if (player.has("codenote") && decisionThirteen.equals("y")){
                System.out.println("You pull out the note you found earlier, feeling a sense of hope as you approach the keypad.");
                System.out.println("You glance down at the note... it says TREBBE on it...interesting...");
    
            } else if (!player.has("codenote") && decisionThirteen.equals("y")){
                System.out.println("You feel a sense of frustration as you realize you don't have the code to enter.");
                System.out.println("Still determined, you decide that you will still try the code, hoping for the best...");
    
            } else {
                System.out.println("You decide against entering the code, feeling that it may be too risky.");
                System.out.println("Feeling uneasy, you choose to head back to the elevator...");
                currRoom = 16;
                return;
            }
            System.out.println("Enter code here: ");
            String codeInput = scanner.nextLine().toLowerCase().trim();
            if (codeInput.equals("trebbe")){
                System.out.println("You enter the code, feeling a sense of anticipation wash over you.");
                System.out.println("As you press the final button, you hear a faint click - the mannequins fall around you, one hitting you on the head.");
                player.takeDamage(10);
                System.out.println("Dazed but determined, you make your way back to the elevator...");
                currRoom = 16;
                return;
            } else {
                System.out.println("You finish typing the code, but nothing happens. You begin to look around, until a mannequin grabs onto your ankle and begins dragging you away.");
                System.out.println("You struggle to break free, but the mannequins are too strong. You feel a sharp pain as one of them strikes you on the head.");
                player.takeDamage(30);
                if (player.has("crowbar")){
                    System.out.println("You hold onto your pride as you take the crowbar and begin to swing it wildly at the mannequins.");
                    System.out.println("After a few moments of struggle, you manage to break free from their grasp, feeling a sense of relief wash over you.");
                    System.out.println("You sprint back to the elevator, grateful to have escaped from the terrifying room...");
                    currRoom = 16;
                    return;
                } else {
                    System.out.println("You feel your strength fading as the mannequins continue to strike you. Your vision begins to blur, and you feel yourself slipping into unconsciousness...");
                    currRoom = 0;
                    return;
                }
            }
        }
        private void roomSixteen(){
            System.out.println("You peer out the elevator doors, a wave of smoke billowing into your face.");
            System.out.println("Coughing, you step out into a room filled with thick, musty air.");
            System.out.println("You feel around your pockets for a flashlight...");
            if (player.has("flashlight")){
                System.out.println("You pull out the flashlight you found earlier, flicking it on to illuminate the room.");
                System.out.println("The beam of light cuts through the smoke, revealing a series of obstacles and dangers that lie ahead.");
                System.out.println("Steeling yourself, you step forward into the unknown...");
                EscapeRoom escape = playRandomRoom();
                escape.start();

                if (player.isAlive()){
                    System.out.println("You manage to survive the dangers of the room, feeling a sense of relief wash over you.");
                    System.out.println("As you catch your breath, you notice the elevator doors ahead of you.");
                    System.out.println("Feeling determined, you make your way back to the elevator, wishing for this all to be over...");
                    currRoom = 20;
                    return;
                } else {
                    System.out.println("Your vision fades to black as you succumb to the dangers of the room. You feel a coldness enveloping you as everything goes silent.");
                    currRoom = 0;
                    return;
                }
            } else {
                System.out.println("You waft away the smoke, coughing violently as you struggle to see.");
                System.out.println("Before you are able to fully get a sense of where you are, you trip on a surface, falling backwards.");
                player.takeDamage(7);
                System.out.println("*ding*");
                currRoom = 17;
                return;
            }
        }        

        private void roomSeventeen(){
            System.out.println("You slowly stand up, coughing from the smoke that lingers in the elevator.");
            System.out.println("The elevator door opens, revealing a dark room with a green gas coating the floor.");
            System.out.println("You glance to your right, noticing a witch standing by a cauldron, stirring a bubbling potion.");
            System.out.println("The witch looks up, noticing your presence. She cackles, 'Ah, a visitor! Care to join me for a brew?'");
            System.out.println("Would you like to... \n(a) Accept the witch's offer \n(b) Politely decline and explore the room ");
            String decisionSeventeen = scanner.nextLine().toLowerCase();
            
            if (decisionSeventeen.equals("a")){
                System.out.println("You approach the witch, feeling a sense of curiosity about her potion.");
                System.out.println("As you take a sip, you feel a strange sensation wash over you.");
                player.heal(player.getMaxHealth() - player.getHealth());
                System.out.println("Feeling thankful, you turn away from the witch, thanking her for the brew.");
                System.out.println("You make your way back to the elevator, before glancing back to see the witch gone and a key lying where she stood.");
                player.obtain("golden key");
                currRoom = 19;
                return;
            } else if (decisionSeventeen.equals("b")){
                System.out.println("You politely decline the witch's offer, feeling that it may be too risky.");
                System.out.println("As you turn away, you feel a sharp pain as the gas begins to affect you.");
                System.out.println("Struggling to breathe, you hear the witch cackle, 'Foolish mortal! You should have accepted my offer!'");
                player.takeDamage(75);
                if (player.isAlive()){
                    System.out.println("The pain overwhelms you, but you manage to hold on as you waddle back to the elevator... terrified but alive.");
                    currRoom = 18;
                    return;
                } else {
                    System.out.println("Your vision fades to black as the gas overwhelms you. You feel a coldness enveloping you as everything goes silent.");
                    currRoom = 0;
                    return;
                }
            }

        }
        private void roomEighteen(){
            System.out.println("You step out of the elevator, feeling a sense of dread wash over you.");
            System.out.println("The room is pitch black, only maintaining a faint glow from the elevator.");
            System.out.println("You hear your stomach churn, as sickness overcomes you.");
            System.out.println("Suddenly, you hear a low hum, growing louder and louder.");
            System.out.println("You look up, but there is nothing but darkness.");
            if (player.has("potion")){
                System.out.println("Quickly, you reach into your pocket and grab the healing potion you found earlier.");
                player.heal(30);
                if (!player.has("golden key")){
                    System.out.println("The pain lessens, allowing you to focus on the room around you.");
                    System.out.println("As you take a step forward, the lights flicker on, revealing an empty table.");
                    System.out.println("Knowing you have nothing more to lose, you begin to head towards the table...");
                    System.out.println("A piece of paper lies on what you thought was an empty table. You pick it up, to show a golden key beneath it.");
                    player.obtain("golden key");
                    System.out.println("You pocket the key, feeling grateful for the unexpected gift.");
                    System.out.println("Feeling determined, you make your way back to the elevator, hoping this nightmare is finally over...");
                    System.out.println("*ding*");
                    currRoom = 19;
                    return;
                } else {
                    System.out.println("The pain lessens substantially, allowing you to finally regain some motivation.");
                    System.out.println("Feeling determined, you make your way back to the elevator, hoping this nightmare is finally over...");
                    System.out.println("*ding*");
                    currRoom = 19;
                    return;
                }
            } else {
                System.out.println("The pain overwhelms you, making it difficult to focus on anything else.");
                System.out.println("As you stumble forward, the low hum grows louder and louder, until it feels like it's inside your head.");
                System.out.println("Unable to take it anymore, you collapse to the ground, clutching your head as the pain intensifies.");
                currRoom = 0;
                return;
            }
                
        }
        private void roomNineteen(){
            System.out.println("As the elevator doors slide open, you find yourself face to face with a wall.");
            System.out.println("Confused, you tap on the wall, only to hear a hollow sound.");
            if (player.has("golden key")){
                System.out.println("You pull out the golden key you found earlier, feeling a sense of hope as you approach the wall.");
                System.out.println("You insert the key into a small keyhole that you hadn't noticed before.");
                System.out.println("As you turn the key, the wall begins to shimmer and fade away, revealing a hidden passageway.");
                System.out.println("Feeling a sense of triumph, you step through the passageway, eager to see what lies beyond...");
                currRoom = 20;
                return;
            } else {
                System.out.println("You are faced with two options... \n(a) Wait \n(b) Push against the wall ");
                String decisionNineteen = scanner.nextLine().toLowerCase();

                    if (decisionNineteen.equals("a")){
                        WaitPuzzle wait = new WaitPuzzle();
                        System.out.println(wait.getDescription());
                        System.out.println("Type 'wait' to wait. Type anything else to leave.");

                        while (true) {
                            String input = scanner.nextLine().toLowerCase().trim();

                            if (!input.equals("wait")) {
                                System.out.println("uh oh...");
                                currRoom = 0;
                                return;
                            }

                            if (wait.attemptWait()) {
                                player.obtain("golden key");
                                System.out.println("You pick up the new key, wondering what it might unlock in this mysterious place.");
                                System.out.println("Feeling determined, you insert it into the wall...");
                                currRoom = 20;
                                return;
                            }
                        }
                    } else if (decisionNineteen.equals("b")){
                    System.out.println("You push against the wall, feeling a sense of frustration as it doesn't budge.");
                    System.out.println("Determined to find a way out, you continue to push harder and harder.");
                    System.out.println("Suddenly, the wall falls forward, causing you to stumble down with it.");
                    System.out.println("You watch at the surface of the elevator becomes further and further away...\n*crack*");
                    currRoom = 0;
                    return;
                }
            }
        }
        private void roomTwenty(){ // this is the end room, allowing for the person to finally escape
            System.out.println("You feel the warm, familiar embrace of the sun glide against your skin.\nThe gentle rustling of leaves and the melodious chirping of birds create a serene symphony around you.");
            System.out.println("As you take a deep breath, the fresh air fills your lungs, invigorating your senses.");
            System.out.println("You realize you've made it out of the elevator's grasp, stepping into a beautiful outdoor setting.");
            System.out.println("Congratulations! You've successfully escaped the elevator and found your way to freedom.");

            player.escape();
            player.showStats();
            currRoom = 0;
            return;
        }
    }
