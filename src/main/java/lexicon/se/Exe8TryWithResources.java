package lexicon.se;

import java.io.FileWriter;
import java.io.IOException;
public class Exe8TryWithResources {
    public static void main(String[]args){
       try(FileWriter writer = new FileWriter("sample.txt")) {
           writer.write("Hello,I am learning Java");
           writer.write("\nThis is Exercise 8.");
           System.out.println("File written successfully!");

       } catch (IOException e) {

           System.out.println("Error: " + e.getMessage());
       }
    }
}
