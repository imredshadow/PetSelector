// Name: Jian Acol
// PD: 7
// Description: Will return with a pet that is based on your inputs

import java.util.*;

public class PetSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color;
        String season;
        String name;
        String pet = "";

        // Ask for color
        do {
            System.out.println("Enter your favorite color (Either red, blue, or green):");
            color = scanner.nextLine().trim().toLowerCase();
        } while (!(color.equals("red") || color.equals("blue") || color.equals("green")));

        // Ask for season
        do {
            System.out.println("Enter your favorite season (winter, spring, summer, fall):");
            season = scanner.nextLine().trim().toLowerCase();
        } while (!(season.equals("winter") || season.equals("spring") ||
                   season.equals("summer") || season.equals("fall")));

        // Ask for name
        do {
            System.out.println("Enter your name:");
            name = scanner.nextLine().trim();
        } while (name.length() == 0);

        char first = Character.toLowerCase(name.charAt(0));
        boolean isVowel = "aeiou".indexOf(first) != -1;
        boolean isConsonant = !isVowel;

        // Decision logic
        if (color.equals("blue") && season.equals("fall")) {
            pet = "alligator";
        } else if (color.equals("blue") && season.equals("spring")) {
            pet = "ostrich";
        } else if (color.equals("green") && isConsonant && season.equals("winter")) {
            pet = "giraffe";
        } else if (color.equals("green") && !season.equals("fall")) {
            pet = "dog";
        } else if (color.equals("red")) {
            if (isVowel) {
                pet = "porcupine";
            } else {
                pet = "panda";
            }
        } else if (season.equals("summer")) {
            if (!(pet.equals("dog") || pet.equals("panda") || pet.equals("porcupine"))) {
                pet = "pony";
            }
        } else if (isConsonant && color.equals("blue") &&
                   !(season.equals("summer") || season.equals("fall"))) {
            pet = "axolotl";
        }

        // Default
        if (pet.equals("")) {
            pet = "rock";
        }

        System.out.println("Your perfect pet is: " + pet);
        scanner.close();
    }
}
