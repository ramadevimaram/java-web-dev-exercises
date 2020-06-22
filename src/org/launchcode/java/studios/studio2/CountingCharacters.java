package org.launchcode.java.studios.studio2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountingCharacters {
    public static void main(String[] args) {
        //Initalize a hash MAp
        HashMap<Character, Integer> charCount = new HashMap<>();
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //get user input
        System.out.println("Enter Chracters to count: ");
        //store input in a string
        String stringOfCharacters = input.nextLine();
        //Non Alphabetic characters & convert the lowercase Chaning two mathods
        stringOfCharacters = stringOfCharacters.replaceAll("[^a-zA-Z]", "").toLowerCase();
        //convert to a character array
        char[] charsInString = stringOfCharacters.toCharArray();
        //loop through character arrays
        for (char character : charsInString) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> eachChar : charCount.entrySet()) {
            System.out.println(eachChar.getKey() + " : " + eachChar.getValue());
        }
    }
}
        /*
        //Read the String in from file

        String filePath = "C://java_SW//Lc101-JAVA/demo.txt";
        System.out.println( readLineByLineJava8( filePath ) );
    }


    //Read file content into string with - Files.lines(Path path, Charset cs)

    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
*/