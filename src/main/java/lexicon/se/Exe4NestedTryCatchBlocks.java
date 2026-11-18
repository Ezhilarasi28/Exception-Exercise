package lexicon.se;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class Exe4NestedTryCatchBlocks {

    public static void main(String[] args) {

        try{
                //outer read the file
            List<String> lines = Files.readAllLines(Path.of("numbers.txt"));

                    //
                    for(String line : lines){
                        try{
                            //Inner try convert text to integer
                            int number = Integer.parseInt(line);
                            System.out.println("The number is: " + number);
                        } catch(NumberFormatException e){
                            System.out.println("The number is invalid:"+line);
                        }
            }
        } catch(NoSuchFileException e){
            System.out.println("Error:File not found.");

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
