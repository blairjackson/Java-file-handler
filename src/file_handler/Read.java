package file_handler;

import java.util.*;
import java.io.*;

/**
 *
 * @author blairjackson
 */
public class Read {

    private Scanner sc;

    // read the file the user has selected
    void read_file(String filename) {
        String line = null;

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null) {

                //print each line of the file
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
