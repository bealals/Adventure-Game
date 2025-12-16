import java.util.Scanner;

public class Room {

    private static Scanner scanner = new Scanner(System.in);
    public int currRoom = 1;

    public void start(){
        while (currRoom > 0 && currRoom <= 20){
            switch (currRoom) {
                case 1: roomOne(); break;
                case 2: roomeTwo(); break;
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
                default: System.out.println("Invalid room number."); break;
                
            }
        }
    }

    private void roomOne(){
        System.out.println("You see a door, old and wooden, standing before you."); 
        System.out.println("Before you can decide to turn back, *creak* the door opens, granting you entrance into the mysterious chamber.");

        Scanner choiceOne = new Scanner(system.in);
        System.out.println("Would you like to continue? (y/n)");
        String decisionOne = choiceOne.nextLine();

        if (!decisionOne.equals("y")){
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

        } if (decisionTwo.equals("b")) {
            System.out.println("You feel the panic set in as you realize you are trapped. \nEager to free yourself, you helplessly search throughout this unfamiliar hell you've trapped yourself into.");
            System.out.println("When you travel across the chamber, you begin to see a bundle of bright colors in the corner of the area.");
            System.out.println("As you move closer, you are able to recognize them for being 3 main wires.");
            System.out.println("You glance back up at the closed door that mocks you in your misery, and decide that that only hope of freedom you have is through these 3 wires.");

            System.out.println("Which wire will you choose to cut? (1/2/3)");
            int decisionThree = scanner.nextLine();

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
                obtainemItem("crowbar");
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
        private String roomThree(){
            System.out.println("As the door opens in front of you, you feel a weird sensation. It feels rather warm, almost like being back in your bed.");
            System.out.println("You step out of the elevator, feeling the soft carpet beneath your feet. As you glance around, you see a cozy room with a fireplace, a comfy chair, and a vintage bookshelf.");
            System.out.println("You look down at the crowbar in your hand, wondering if it will be useful here.");
            System.out.println("Would you like to... \n(a) Inspect the fireplace \n(b) Check out the bookshelf ");

            String decisionFive = scanner.nextLine().toLowerCase();

            if (decisionFive.equals("a")){
                System.out.println("You approach the fireplace, noticing the warm glow of the flames. As you get closer, you see something shiny in the ashes...");
                System.out.println("You tap at it with your crowbar, feeling the hot metal against your palms.");
                takeDamage(5);
                System.out.println("You notice that it's a cabinet! You stick your crowbar into the small gap and attempt to pry it open.");
                System.out.println("Unfortunately, the cabinet is stuck tight. You decide to leave it alone for now, choosing to further explore this room...");
            } else if (decisionFive.equals("b")){
                System.out.println("You walk over to the bookshelf, running your fingers along the spines of the books. One of them catches your eye...");
                System.out.println("It's a book about the history of this building. As you scroll through the pages, a small note falls out.");
                obtainItem("codeNote");
                System.out.println("Pocketing the note, you choose to further your exploration of this calming room...");
                System.out.println("You feel good about the stuff you've found so far. You head back to the elevator, awaiting for where it will take you next...");
                currRoom = 4;
                break;
            }

            System.out.println("You begin to feel drowsy, the warmth of the room lulling you into a sense of comfort. You decide to sit in the comfy chair for a moment, closing your eyes.");
            System.out.println("As you doze off, you feel the room begin to spin. You try to stand up, but the world around you fades to black...");
            System.out.println("*ding*");

            currRoom = 5;
        }
        private String roomFour(){
            System.out.println("You step out of the elevator, feeling a cool breeze brush past your face. The room before you is vast, with high ceilings and ornate decorations.");
            System.out.println("As you look around, you notice a grand staircase leading up to a balcony. There are also several doors lining the walls.");
            System.out.println("Would you like to... \n(a) Explore the balcony \n(b) Check out the doors ");

            String decisionSix = scanner.nextLine().toLowerCase();

            if (decisionSix.equals("a")){
                System.out.println("You ascend the grand staircase, feeling the plush carpet beneath your feet. As you reach the balcony, you see a stunning view of the entire room below.");
                System.out.println("You notice a small table with a vase of flowers and a note beside it.");
                obtainItem("potion");
                System.out.println("You pick up the note, which reads: 'For those in need of healing, take this potion.' You pocket the potion, feeling grateful for the unexpected gift.");
                System.out.println("After taking in the view, you decide to head back down and explore the rest of the room...");
            } else if (decisionSix.equals("b")){
                System.out.println("You approach one of the doors lining the walls, feeling curious about what lies beyond. You try the handle, and to your surprise, it opens easily.");
                System.out.println("Inside, you find a small study filled with books and papers. On the desk, there's a flashlight resting beside a stack of documents.");
                obtainItem("flashlight");
                System.out.println("You pick up the flashlight, knowing it will be useful in dark places. After exploring the study, you decide to head back to the elevator...");
            }

            System.out.println("Feeling satisfied with your exploration, you make your way back to the elevator, wondering where it will take you next...");
            currRoom = 6;
        }
        private String roomFive(){
            System.out.println("You awaken to find yourself in a dimly lit room, the walls adorned with strange symbols that seem to glow faintly.");
            System.out.println("You glance down and realize that you're still on the same comfy couch from before, but the room feels different now.");
            
            EscapeRoom.start(playRandomRoom());

            if (isAlive()){
                System.out.println("You manage to survive the dangers of the room, feeling a sense of relief wash over you.");
                System.out.println("As you catch your breath, you notice a small key lying on the floor beside you.");
                obtainItem("key");
                System.out.println("You pick up the key, wondering what it might unlock in this mysterious place.");
                System.out.println("Feeling determined, you make your way back to the elevator, eager to continue your journey...");
                currRoom = 7;
            } else {
                System.out.println("Your vision fades to black as you succumb to the dangers of the room. You feel a coldness enveloping you as everything goes silent.");
                currRoom = 0;
            }
        }
        private String roomSix(){
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
            } else if (decisionSeven.equals("old")){
                System.out.println("You decide to return to the previous elevator, as you're far more familiar with it.");
            }
            System.out.println("You step back into the old elevator, feeling a sense of relief as the doors close behind you.");
            currRoom = 14;
            return decisionSeven;
        }
        private String roomSeven(){
                
        }
        private String roomEight(){
                
        }
        private String roomNine(){
                
        }
        private String roomTen(){
                
        }
        private String roomEleven(){
                
        }
        private String roomTwelve(){
            System.out.println("You slowly stand up, still feeling the shock of being tosses in a mysterious elevator.");
            System.out.println("The elevator doors open, showing a room full of books...a library?");
            System.out.println("You walk around the strange library, glancing up at the elevator... 12th floor...");
            System.out.println("Wondering what lies in this library, you choose to explore the different isles.");
            System.out.println("You pull out a book...it says *@&$^*#&$* on the front...interesting title...");
            System.out.println("As you turn the corner to the next isle, you look closer at the shelf you are passing. The books don't look the same...");

            System.out.println("Before you can stop yourself, you try to pull out one of the books, only for it to seems stuck in place.");
            System.out.println("The lighting turns a shade of green, making your stomach nauseous.");

            WaitPuzzle wait = new WaitPuzzle();
            wait.getDescription();
            System.out.println("Will you wait for your safety or get away before anything else can go wrong?");
            String decisionTwelve = scanner.nextLine().toLowerCase();
            wait.attemptWait();

            if (!wait.equals("true")) {
                System.out.println("You watch as the walls look slanted, realizing that the room is tilting. You hold onto the shelf, but the aged wood cracks, sending you flying back into the elevator.");
                System.out.println("As the pain flows through your body, you feel a strong tenseness wash over your body.");
                System.out.println("You feel the elevator creek up, knowing that the next floor lies before you... *ding*");
            } else {
                System.out.println("You glance down at the key in your hand, feeling the worn metal oxidizing more every second.");
                System.out.println("You pocket it, knowing that this weird hellhole isn't going to give you something you won't need...right?");

                currRoom = 14;
            }
        }
        private String roomThirteen(){      // Death room hehe 13th floor i'm so cool
            System.out.println("Lying against the corner of the elevator, you stare at the floor that stands before you.");
            System.out.println("The lights are flickering, making your heart race. You feel a cold sweat before the light shut off completely.");
            System.out.println("In the darkness, you hear a faint buzzing sound growing louder and louder.");
            System.out.println("Suddenly, a bright light blinds you, as you feel a sharp pain shoot through your head.");
            System.out.println("You fall to the ground, clutching your head as the pain intesnifies.");
            System.out.println("Before you can react...");

            currRoom = 0;
            return "You dead :p";
                
        }
        private String roomFourteen(){
                
        }
        private String roomFifteen(){
                
        }
        private String roomSixteen(){
                
        }
        private String roomSeventeen(){
                
        }
        private String roomEighteen(){
                
        }
        private String roomNineteen(){
                
        }
        private String roomTwenty(){
                
        }
    }


