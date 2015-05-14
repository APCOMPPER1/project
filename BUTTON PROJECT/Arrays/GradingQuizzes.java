
/**
 * Write a description of class GradingQuizzes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class GradingQuizzes
{
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String [] args){
        String cont = "y";
        int nbr;
        int answers;
        int correct = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("How many questions are on the quiz? ");
        nbr = s.nextInt();
        int [] grades = new int[nbr];
        System.out.println();
        System.out.println("Now make an answer Key: ");
        for(int i=0; i<grades.length; i++){
            grades[i] = s.nextInt();

        }
        while(cont.equalsIgnoreCase("Y")){
            System.out.println("Enter the answers to the Quiz: " );
            for(int x=0; x<grades.length; x++){
                if(s.nextInt() == grades[x]){
                    correct++;
                }
            }
            System.out.println("Number of correct Answers " +correct + " and percent right: " + ((double)(correct) / nbr) * 100 + "%");
            System.out.println("Want to grade another quiz? (y/n)");
            cont = s.next();
        }
    }
}

