package exercises.controlFlowAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
            //System.out.println(num);
            int sumOfEven= 0;
            int sumOfOdd =0;
        ArrayList even= new ArrayList<Integer>();
        ArrayList odds = new ArrayList<Integer>();


        for(int i = 0; i < num.length; i++)
        {
            if ((num[i]%2) == 0)

            {
                even.add(num[i]);
                sumOfEven = sumOfEven + num[i];
            }

            else
            {
                odds.add(num[i]);
                sumOfOdd += num[i];
            }

        }
        System.out.println(sumOfEven);

    //Static method to print each word in a list 5letters


    }
}

