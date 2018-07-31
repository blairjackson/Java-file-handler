package file_handler;

import java.util.*;
import java.io.*;

/**
 *
 * @author blairjackson
 */
public class Search {

    Scanner sc;
    ArrayList<String> words = new ArrayList<>();
    String line = null, search_word;
    int count = 0;

    public void search_file(String filename) {

        split_strings(filename);
        search_word = get_search_word();
        int len = words.size();
        
        
        for(int i = 0; i < len; ++i){
            //System.out.println(words.get(i));
            if(search_word.equals(words.get(i))){
                count++;
            }
        }
        System.out.println("The word: " + "'" +search_word + "'" + " was found " + count + " time(s)");
    }

    void split_strings(String filename) {

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null) {

                //print each line of the file
                //System.out.println(line);

                //add the split words into the word arrayList
                for (String retval : line.split(" ")) {             
                    words.add(retval);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    String get_search_word(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a word to search for: ");

        String new_search_word = scanner.nextLine();
        return new_search_word;
    }

}
