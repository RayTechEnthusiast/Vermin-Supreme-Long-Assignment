import java.util.Scanner;

public class PerfectPetSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pet = "Pet Rock"; 
        boolean hasSpecificPet = false;

        // --- COLOR INPUT ---
        String color = "sillymonkeybanananullvalue";
        while (true) {
            System.out.println("Enter your favorite color (red, blue, or green):");
            color = scanner.nextLine().trim().toLowerCase();
            if (color.equals("red") || color.equals("blue") || color.equals("green")) {
                System.out.println("Good boy!");
                break;
            } else {
                System.out.println("Invalid color. Please enter red, blue, or green.");
            }
        }

        // --- SEASON INPUT ---
        String season;
        while (true) {
            System.out.println("Enter your favorite season (winter, spring, summer, or fall):");
            season = scanner.nextLine().trim().toLowerCase();
            if (season.equals("winter") || season.equals("spring") || 
                season.equals("summer") || season.equals("fall")) {
                System.out.println("Nice!");
                break;
            } else {
                System.out.println("Invalid season. Please enter winter, spring, summer, or fall.");
            }
        }

        // --- NAME INPUT ---
        String name;
        while (true) {
            System.out.println("Enter your name:");
            name = scanner.nextLine().trim();
            if (name.length() > 0 && Character.isLetter(name.charAt(0))) {
                System.out.println("Thanks!");
                break;
            } else {
                System.out.println("Invalid name. Please make sure it starts with a letter.");
            }
        }

        // --- Vowel/Consonant logic ---
        String lowerName = name.toLowerCase();
        char firstLetter = lowerName.charAt(0);
        boolean startsWithVowel = "aeiou".indexOf(firstLetter) != -1;

        if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
            hasSpecificPet = true;
        } else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
            hasSpecificPet = true;
        }

        else if (color.equals("green") && !startsWithVowel && season.equals("winter")) {
            pet = "Giraffe";
            hasSpecificPet = true;
        }
        else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
            hasSpecificPet = true;
        }

        else if (color.equals("red")) {
            if (startsWithVowel) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
            hasSpecificPet = true;
        }

        else if (season.equals("summer")) {
            if (!pet.equals("Dog") && !pet.equals("Panda") && !pet.equals("Porcupine")) {
                pet = "Pony";
                hasSpecificPet = true;
            }
        }

        else if (!startsWithVowel && color.equals("blue") &&
                 !season.equals("summer") && !season.equals("fall")) {
            if (!pet.equals("Ostrich")) {
                pet = "Axoltl";
                hasSpecificPet = true;
            }
        }

        
        if (!hasSpecificPet) {
            pet = "pet rock";
        }

        System.out.println("Perfect pet is: " + pet);

    }
}
