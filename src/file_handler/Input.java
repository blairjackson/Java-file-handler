package file_handler;

import java.util.Scanner;

/**
 *
 * @author blairjackson
 */
public class Input {

    
    //get user input and pass to check if valid
    int get_choice() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select an option: ");
        int choice = sc.nextInt();

        if (valid_choice(choice)) {
            return choice;
        } else {
            System.out.println("Invalid choice, try again");
            get_choice();
        }
        return 0;
    }

    //check input is within range
    boolean valid_choice(int choice) {
        if (choice < 1 || choice > 4) {
            return false;
        } else {
            return true;
        }
    }
    
    //write a function to handle input that is not an integer
}
