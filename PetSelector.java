//Name: Jian Acol
//PD: 7
//Description: Will return with a pet that is based on your inputs

import java.util.*;
public class PetSelector{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (idiot proof!)
        //make a decision
        //tell the user what they get!
        Scanner scanner = new Scanner(System.in);
        String color;
        String season;
        String name;
        String pet = null;

        do {
            System.out.println("Enter your favorite color (Either red, blue or green):");
            color = scanner.nextLine().toLowerCase();
        } while (!(color.equals("red")) && !(color.equals("blue")) && !(color.equals("green")));
        
        do {
            System.out.println("Enter your favorite season (winter, spring, summer, fall):");
            season = scanner.nextLine().toLowerCase();
        } while (!(season.equals("winter")) && !(season.equals("spring")) && !(season.equals("summer")) && !(season.equals("fall")));

        do {
            System.out.println("Enter your name:");
            name = scanner.nextLine();
        } while (!("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0,1).toLowerCase()) >= 0));
        
        boolean isVowel = (("aeiou".indexOf(name.charAt(0))) == 0);
        if (color == "blue" && (isVowel == false)) {

            if (season == "fall") {
                pet = "alligator";
            } else if (season == "spring") {
                pet = "ostrich";
            } else if (season == "summer") {
                pet = "axolotl";
            }
        } else if (color == "red") {
            if (name.substring(0,1) == "a" || (name.substring(0,1) == "e") || name.substring(0,1) == "i" || name.substring(0,1) == "o" || name.substring(0,1) == "u") {
                pet = "porcupine";
            } else {
                pet = "panda";
            }
        } else if (color == "green") {
            if (season == "winter" && color == "blue" && !((name.substring(0,1) == "a" || name.substring(0,1) == "e") || name.substring(0,1) == "i" || name.substring(0,1) == "o" || name.substring(0,1) == "u")) {
                pet = "giraffe";
            } else if (season != "fall") {
                pet = "dog";
            }
        } else {
            pet = "rock";
            if (pet == "rock" && season == "summer") {
                pet = "pony";
            }
        }
        
        System.out.println("Your perfect pet is: " + pet);
        

    }

}