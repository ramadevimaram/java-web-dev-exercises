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
package class2studio;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Studio {
    public static void main (String[] args){

        try {

            File file = new File( "src/class2studio/input.txt");

            Scanner input = new Scanner(file);
            String output = input.nextLine();

            HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

            for(char c : output.toLowerCase().toCharArray()){

                if(Character.isLetter(c)){

                    if(!charMap.containsKey(c)){
                        charMap.put(c, 1);
                    } else {
                        int value = charMap.get(c);

                        charMap.put(c, value + 1);

                    }
                }
            }

            System.out.println(charMap);
        } catch (Exception error) {

            System.err.println("No file to read.");
        }
    }
}

 */
