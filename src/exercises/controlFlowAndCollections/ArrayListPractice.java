package exercises.controlFlowAndCollections;

//import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       for (int i=0; i<10; i++){
           numbers.add(i);
           System.out.println(numbers);
           int sum = sumOfEvenNumbers(numbers);
           System.out.println("sum of even numbers: ".concat(String.valueOf(sum)));
       }

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String stringOfWords[] = paragraph.split("\\.");

       ArrayList<String> words = new ArrayList<>();
        for(String string : stringOfWords) {
            words.add(string);
        }
        printWords(words);

        }
        public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
            int sum = 0;
            for (int number : numbers) {
                System.out.println(number);
                if (number % 2 == 0) {
                    sum += number;
                    System.out.println("sumofEven" + sum);
                }
            }
            return sum;
        }
        public static void printWords(ArrayList<String> words){
            for(String word : words){
                System.out.println(word);
        }
    }
}

