
/**
 * Write a description of class U10q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U10q9
{
   public static void main(String[] args) {
    int target = 10;

    int[] arrWithDups = {2, 3, 7, 8, 10, 10, 10, 20};

    int arrIndex = bSearch(arrWithDups, 0, arrWithDups.length - 1, target);
    System.out.println(arrIndex);
    System.out.println("The second time bSearch is executed, left has the value 4, right has the value 7, and the value 5 is returned since arr[mid], or arr[5], is equal to 10.");
    }
    

    
    public static int bSearch(int[] arr, int left, int right, int x)

{

if (right >= left)

{

int mid = (left + right) / 2;

if (arr[mid] == x)

{

return mid;

}

else if (arr[mid] > x)

{

return bSearch(arr, left, mid - 1, x);

}

else

{

return bSearch(arr, mid + 1, right, x);

}

}

return -1;

}
}
