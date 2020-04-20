
/**
 * Write a description of class U6q14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U6q14
{
    public static void main(String[] args) {
        System.out.println("By initializing maximum to values[0], the first element in the array will be the maximum integer found so far.");
   int[] values = {10,20,30,40,50,60,71,80,90,91};
    

    
    int maximum = values[0];

        for (int k = 1; k < values.length; k++)
        {

            if (values[k] > maximum)

          {

           maximum = values[k];

          }

    }

    System.out.println(maximum);
}
}
