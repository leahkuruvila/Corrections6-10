
/**
 * Write a description of class U10q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U10q11
{
    public static void main(String[] args) {
       System.out.println("Right is printed 3 times");
       String[] words = {"arc", "bat", "cat", "dog",

           "egg", "fit", "gap", "hat"};

           int index = bSearch(words, 0, words.length - 1, "hat");
        
    }
    public static int bSearch(String[] arr, int left, int right, String str)

{

    System.out.println(right);
   
    
if (right >= left)

{

int mid = (left + right) / 2;

if (arr[mid].equals(str))

{

return mid;

}

else if (arr[mid].compareTo(str) > 0)

{

return bSearch(arr, left, mid - 1, str);

}

else

{

System.out.println("right");

return bSearch(arr, mid + 1, right, str);

}

}

return -1;

}
}
