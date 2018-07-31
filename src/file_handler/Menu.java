package file_handler;

/**
 *
 * @author blairjackson
 */
public class Menu {
    
    void show_menu(){
          
        //iterate through list to show menu on screen
        
        String[] menu = {
            "WELCOME TO THE FILE HANDLER", 
            "---------------------------",
            "1) Read from file",
            "2) Write to file",
            "3) Search word in file",
            "4) Exit"
        };
        
        for(int i = 0; i < menu.length; ++i){
            System.out.println(menu[i]);
        }   
    }   
}
