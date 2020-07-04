package exercises.controlFlowAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String > students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String student;
        System.out.println("Enter your students (or Enter to finish):");
        //get student Names and grades
        do{
            System.out.println("Student: ");
            student = input.nextLine();
            if(!student.equals("")){
                System.out.println("Id: ");
                Integer id = input.nextInt();
                students.put(id,student);
                //Reas in the newline before looping back
                input.nextLine();
                for(Map.Entry<Integer,String> newStudent : students.entrySet()){
                    System.out.println(newStudent.getKey() + "("+ newStudent.getValue() + ")");
                }
            }
        }while (!student.equals(""));
        // Print class roster
        System.out.println("\nClass roster:");

    }
}
