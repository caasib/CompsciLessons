package inputOutput;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FileInputOutput {
    public static void main(String[] args) {
        //Try blocks attempt to execute code as normal. If everything works, great!
        try {
            FileInputStream myFile = new FileInputStream("C:\\Users\\studentgvsc\\eclipse-workspace\\BetterEclipse\\src\\inputOutput\\words.txt");
            //Putting all of the five letter words into an arraylist
            //We need to use the scanner object to read from the file --> pass the file as a parameter to a Scanner
            Scanner reader = new Scanner(myFile); //Reads from the text file instead of the keyboard (System.in)
            //We want to read from the text file as long as the text file has lines to read
//            ArrayList<String> words = new ArrayList<String>();
//            while (reader.hasNextLine()) {
//                String temp = reader.nextLine();
//                if (temp.length() == 5) {
//                    words.add(temp);
//                }
//            }
//            System.out.println(words);

            //We can also print the words to their own text file (persistent data)
            //To write to a file, we need a new file object and a file writer
            File file = new File("C:\\Users\\studentgvsc\\eclipse-workspace\\BetterEclipse\\src\\inputOutput\\newWords.txt");
            FileWriter writer = new FileWriter(file);
            while (reader.hasNextLine()) {
                String temp = reader.nextLine();
                if (temp.length() == 5) {
                    writer.write(temp + "\n"); //.write(String text) "prints" the info to the new text file
                }
            }
            writer.close(); //.close is necessary to see the changes to the new file
        }
        catch (Exception e) {
            System.out.println("file not found :(");
        }
    }
}
