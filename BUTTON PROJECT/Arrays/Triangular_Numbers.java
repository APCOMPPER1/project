
/**
 * Write a description of class Triangular_Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Triangular_Numbers
{

    private int [] tri;

    public Triangular_Numbers(int n){
       
        tri = new int [n];
        tri[0] =1;
        for(int i =1; i<tri.length; i++){
            
            tri[i] = tri[i-1] +(i+1);
        }
        
    }
}