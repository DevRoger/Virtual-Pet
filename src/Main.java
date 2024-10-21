/*****************************************************************************************************

M03_REP_01: Virtual Pet
Description: The application you have to create is about keeping a virtual pet alive, clean and happy.
Autor: Roger Alonso

******************************************************************************************************/

public class Main {
    public static void main(String[] args) {

        // Initialising variables
        int energy = (int) (Math.random() * 21) + 40;
        int fatigue = (int) (Math.random() * 21) + 40;
        int sleep = (int) (Math.random() * 21) + 40;
        int hygiene = (int) (Math.random() * 21) + 40;
        int weight = (int) (Math.random() * 21) + 40;
        int menu;
        char animal;
        String name;


        // Choose between a cat or dog
        System.out.println("Cat or dog (C / D)? ");
        animal = Teclat.llegirChar();
        while (animal != 'c' && animal != 'C' && animal != 'd' && animal != 'D') {
            System.out.println("Cat or dog (C / D)? ");
            animal = Teclat.llegirChar();
        }


        // Name of the animal
        System.out.println("What is his name? ");
        name = Teclat.llegirString();


        // Starting the menu
        do {
            System.out.println("\n\n    ====================");
            System.out.println("    ||----- Menu -----||");
            System.out.println("    ====================");
            System.out.println("What do you want to do with " + name + "? ");
            System.out.println("        1.- Sleep");
            System.out.println("        2.- Play");
            System.out.println("        3.- Eat");
            if (animal == 'D' || animal == 'd') {
                System.out.println("        4.- Shower");
            } else {
                System.out.println("        4.- Self-Cleaning");
            }
            System.out.println("        0.- Exit application");

            menu = Teclat.llegirInt();


            switch (menu) {
                case 0:

                    // Exit application
                    break;

                case 1:

                    //Sleep
                    System.out.println("\n(--- Old Values ---)");
                    System.out.println("Energy: " + energy);
                    System.out.println("Fatigue: " + fatigue);
                    System.out.println("Sleep: " + sleep);
                    System.out.println("Hygiene: " + hygiene);
                    System.out.println("Weight: " + weight);

                    //New values
                    if (animal == 'd' || animal == 'D'){
                        sleep = sleep - 25;
                    } else {
                        sleep = sleep - 20;
                    }
                    fatigue = fatigue - 15;
                    energy = energy + 15;
                    break;

                case 2:

                    //Play
                    System.out.println("\n(--- Old Values ---)");
                    System.out.println("Energy: " + energy);
                    System.out.println("Fatigue: " + fatigue);
                    System.out.println("Sleep: " + sleep);
                    System.out.println("Hygiene: " + hygiene);
                    System.out.println("Weight: " + weight);

                    //New values
                    if (animal == 'd' || animal == 'D'){
                        sleep = sleep - 10;
                    } else {
                        sleep = sleep + 15;
                    }
                    fatigue = fatigue + 10;
                    energy = energy - 10;
                    hygiene = hygiene - 15;
                    weight = weight - 10;
                    break;

                case 3:

                    //Eat
                    System.out.println("\n(--- Old Values ---)");
                    System.out.println("Energy: " + energy);
                    System.out.println("Fatigue: " + fatigue);
                    System.out.println("Sleep: " + sleep);
                    System.out.println("Hygiene: " + hygiene);
                    System.out.println("Weight: " + weight);

                    //New values
                    if (animal == 'd' || animal == 'D'){
                        sleep = sleep + 15;
                    } else {
                        sleep = sleep + 10;
                    }
                    energy = energy + 10;
                    hygiene = hygiene - 10;
                    weight = weight + 10;
                    break;

                case 4:

                    //Shower
                    System.out.println("\n(--- Old Values ---)");
                    System.out.println("Energy: " + energy);
                    System.out.println("Fatigue: " + fatigue);
                    System.out.println("Sleep: " + sleep);
                    System.out.println("Hygiene: " + hygiene);
                    System.out.println("Weight: " + weight);

                    //New values
                    if (animal == 'd' || animal == 'D') {
                        sleep = sleep - 15;
                        hygiene = hygiene + 25;
                    } else {
                        sleep = sleep + 10;
                        hygiene = hygiene + 20;
                    }
                    break;

                default:
                    System.out.println("Incorrect number.");
            }

            // Values
            System.out.println("\n(--- Values ---)");
            System.out.println("Energy: " + energy);
            System.out.println("Fatigue: " + fatigue);
            System.out.println("Sleep: " + sleep);
            System.out.println("Hygiene: " + hygiene);
            System.out.println("Weight: " + weight);

            //Check if it is dead
            if (energy <= 0 || energy >= 100 || fatigue <= 0 || fatigue >= 100 || sleep <= 0 || sleep >= 100 || hygiene <= 0 || hygiene >= 100 || weight <= 0 || weight >= 100) {
                System.out.println("\n(--- " + name + " died ---)");
                break;
            }
        }
        while (menu != 0);
    }
}
