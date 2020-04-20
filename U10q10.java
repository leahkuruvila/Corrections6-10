import java.util.ArrayList;
/**
 * Write a description of class U10q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U10q10
{
   
    public static void main(String[] args) {
        System.out.println("Binary Search is called 4 times");
        ArrayList<Integer> theList = new ArrayList<Integer>();

        for (int k = 10; k < 65; k = k + 5)

        {

            theList.add(k);

         }   

         int result = binarySearch(theList, 0, theList.size() - 1, 45);
    }
    public static int binarySearch(ArrayList<Integer> theList, int low, int high,

int target)

{
    System.out.println("low: " + low);
    System.out.println("high: " + high);
    //System.out.println("middle: " + middle);
if (low > high)

{

return -1;

}

int middle = (low + high) / 2;

if (target == theList.get(middle))

{

return middle;

}

else if (target < theList.get(middle))

{

return binarySearch(theList, low, middle - 1, target);

}

else

{

return binarySearch(theList, middle + 1, high, target);

}

}
}
