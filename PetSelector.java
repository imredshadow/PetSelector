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
        do {
            System.out.println("Enter your favorite color (Either red, blue or green):");
            String color = scanner.nextLine();
        } while ("red".indexOf(color.substring(0, color.length() + 1).toLowerCase()) <= -1 | "blue".indexOf(color.substring(0, color.length() + 1).toLowerCase() <= -1 | "green".indexOf(color.substring(0, color.length() + 1).toLowerCase() <= -1)));
        

    }

}