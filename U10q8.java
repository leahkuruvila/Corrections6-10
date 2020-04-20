
/**
 * Write a description of class U10q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U10q8
{
    public static void main(String[] args) {
       int[] arr = {2, 3, 12, 34, 54};

       int result = binarySearch(arr, 0, arr.length - 1, 5);
       System.out.println("Since target is greater than arr[0], the third call to binarySearch is executed with low = 1 and high = 1");
    }

    public static int binarySearch(int[] arr, int low, int high, int target)

{
System.out.println(high);
System.out.println(low);
if (low > high)

    {

        return -1;

    }

int middle = (low + high) / 2;

    if (target == arr[middle])

{

    return middle;

}

    else if (target < arr[middle])

{

    return binarySearch(arr, low, middle - 1, target);

}

    else

{

    return binarySearch(arr, middle + 1, high, target);

}

    }
}
