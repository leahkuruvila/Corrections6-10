import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class U8q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U8q1
{
    public static void main(String[] args) {
        int myArray[][] = new int[3][3];
        myArray[0][2] = 3;
        myArray[2][0] = 7;
        
        int myArray1[][] = {{0, 0, 3}, {0, 0, 0}, {7, 0, 0}};
        
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray1));
        System.out.println("Code segment I creates a new array with three rows and three columns. Code segment II also creates a new array with three rows and three columns, but it assigns the value 7 to the location where 3 should be assigned and vice-versa.");
    }
}
