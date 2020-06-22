package exercises.controlFlowAndCollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] a1 = {1, 1, 2, 3, 5, 8};
        int i;
        int result;
        //iterating over an array
        for(i=1; i < a1.length; i+=2){
            result = a1[i];
            System.out.println(result + " ");
        }
        String string ="I would not, could not, in a box." +
                " I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse";
        String [] words = string.split("\\.");
        /*
        String [] words = string.split(" ");for (var word: words) {
           // System.out.println("Words : "+word);
            // another way to print
        }*/
        System.out.println(Arrays.toString(words));
    }
}
