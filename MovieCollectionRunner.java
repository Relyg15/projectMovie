import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class MovieCollectionRunner
{
    public static void main(String args[])
    {
/*
        String filename = "src/movies_data.csv";
        File  file = new File(filename);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String data = sc.next();
                String[] values = data.split(",");
                if (data.indexOf(searchTerm != -1){
                results.add(data);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        MovieCollection myCollection;
        myCollection = new MovieCollection("src/movies_data.csv");
        myCollection.menu();
    }
}
