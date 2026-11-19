package lexicon.se.Exe7CustomExceptions;

import java.util.ArrayList;
import java.util.List;

public class CustomExceptions {

    static List<String> names = new ArrayList<>();

    // Add a name
    public static void addName(String name)
            throws DuplicateNameException {

        if (names.contains(name)) {
            throw new DuplicateNameException(
                    name + " already exists in the list!");
        }

        names.add(name);
        System.out.println(name + " added successfully.");
    }

    // Find a name
    public static void findName(String name)
            throws NameNotFoundException {

        if (!names.contains(name)) {
            throw new NameNotFoundException(
                    name + " not found in the list!");
        }

        System.out.println(name + " found in the list.");
    }

    public static void main(String[] args) {

        try {
            addName("Anu");
            addName("Mandir");
            addName("Murthy");

            findName("Mandir");
            findName("David");

        } catch (DuplicateNameException |
                 NameNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {
            addName("Anu");
        } catch (DuplicateNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}