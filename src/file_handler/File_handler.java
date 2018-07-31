package file_handler;

/**
 *
 * @author blairjackson
 */
public class File_handler {

    public static void main(String[] args) {

        String filename = "/Users/blairjackson/Desktop/lorem.rtf";
        Menu menu = new Menu();
        Input handler = new Input();
        Read reader = new Read();
        Write writer = new Write();
        Search searcher = new Search();
        boolean exit = false;

        //loops until exit is chosen by the user
        do {
            //Print out menu of options to screen
            menu.show_menu();

            //get user input, check for validity
            int choice = handler.get_choice();

            //Send to requested function
            switch (choice) {
                case 1:
                    reader.read_file(filename);
                    break;
                case 2:
                    writer.write_to_file(filename);
                    break;
                case 3:
                    searcher.search_file(filename);
                    break;
                case 4:
                    //
                    exit = true;

                    break;
                default:
                    System.out.println("invalid option, try again");
                    break;
            }
        } while (!exit);
    }
}
