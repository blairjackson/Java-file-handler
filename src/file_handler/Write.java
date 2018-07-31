package file_handler;

import java.util.*;
import java.io.*;

/**
 *
 * @author blairjackson
 */
public class Write {

    public void write_to_file(String filename) {
        String line;
        line = line_to_write();
        
        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            OutputStreamWriter outputStreamWriter = 
                    new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = 
                    new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    String line_to_write(){
        
        //get the user input that they want to write to the file
        Scanner sc = new Scanner(System.in);
        String new_line;
        

        System.out.println("Write to file: ");
        new_line = sc.nextLine();
        
        return new_line;
    }

}
