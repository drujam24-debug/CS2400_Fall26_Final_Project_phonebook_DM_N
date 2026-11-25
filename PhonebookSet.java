import java.util.Scanner;

public class PhonebookSet {
    // CLI MENU FOR GRADER
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        boolean running = true;

        //the some of the min requirements that are to be tested
        //MIGHT BE ALL NOT SURE
        while (running){
            System.out.println("\n1. Add a contact with a unique ID, name, at least one phone number, and optional email.");
            System.out.println("2. View one contact.");
            System.out.println("3. List all contacts.");
            System.out.println("4. Edit a contact by ID.");
            System.out.println("5. Delete a contact by ID.");
            System.out.println("6. Edit a contact by ID.");
        }
    }
}