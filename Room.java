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

            if (decisonFour.equals("a"){
                System.out.println("You light the candelabra from left to right...");
                System.out.println("The room begins to shake, and the wall before opens to display a compartment.");
                hasCrowbar = true;
                System.out.println("You see the crowbar and decide to take it, just in case...");
                System.out.println("As you move back to the elevator, crowbar in your hand, you begin to wonder what lies before you now...");

                currRoom = 3;
            } else if (decisionFour.equals("b"){
                System.out.println("You decide it's not worth the risk. You turn away and begin walking back to your starting point. Before you reach the elevator doors, you look back and wonder what may have happened if the stakes were lower.");
                System.out.println("You feel a sense of calm wash over you before the elevator doors slam shut, unlike the way they have been before. You swiftly change your focus to them, before you feel a slight drop in the position."); 
                System.out.println("Before you can react, you get pushed to the ground as you feel a strong force moving upwards...");

                currRoom = 12;
            }
        }
        private String roomThree(){

        }
        private String roomFour(){

        }
        private String roomFive(){

        }
        private String roomSix(){
                
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



