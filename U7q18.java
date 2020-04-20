/**
 * Write a description of class U7q18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class U7q18
{
    
    public static void main(String[] args) {
    int[] arr = {30, 40, 10, 50, 20};

    selectionSort(arr);
    System.out.println("The statement in line 19 executes each time a value is swapped into the correct position in the array and that is 3 times.");
    }

    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void selectionSort(int[] elements)

    {

        
    for (int j = 0; j < elements.length - 1; j++)

    {

        int minIndex = j;

        for (int k = j + 1; k < elements.length; k++)

        {

            if (elements[k] < elements[minIndex])

            {

                minIndex = k;

            }

        }

        if (j != minIndex)

        {

            int temp = elements[j];

            elements[j] = elements[minIndex];
            
            elements[minIndex] = temp;   // line 19
            System.out.println(Arrays.toString(elements));

        }

}

}
}