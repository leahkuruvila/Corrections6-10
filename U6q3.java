
public class U6q3
{
  
    /**
     * Constructor for objects of class U6q3
     */
    public static void main(String[] args)
    {
        String[] str = {"cat", "dog"};
        System.out.println(checkString(new String[0]));
        System.out.println(checkString(str));
        System.out.println("Statement I does not compile because the array size is missing");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int checkString(String[] arr)

   {

    int count = 0;

   for (int k = 0; k < arr.length; k++)

        {

      if (arr[k].length() >= 3)

        {

            count++;

        }

        }

return count;

}
}
