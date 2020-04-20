import java.util.Arrays;
/**
 * Write a description of class U6q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U6q2
{
    
   public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,71,80,90,91};   
    System.out.println(Arrays.toString(arr));
    }
    
    public int[] transform(int[] a)

    {

        a[0]++;

        a[2]++;

        return a;

   }

    
    public void  sampleMethod(int y)
    {
        int[] arr = {0, 0, 0, 0};
        arr = transform(arr);
        
    }
}
