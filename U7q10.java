import java.util.ArrayList;
/**
 * Write a description of class U7q10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class U7q10
{
    
  
   public static void main(String[] args) {
    ArrayList<Integer> firstList = new ArrayList<>(); 
    firstList.add(1);
    firstList.add(3);
    firstList.add(5);
    firstList.add(7);
    
    ArrayList<Integer> secondList = new ArrayList<>(); 
    secondList.add(5);
    secondList.add(5);
    secondList.add(3);
    secondList.add(1);
    System.out.println("To correct the error, the loop should iterate over the entire firstList rather than just over the first half");
    
    }
    
    public static boolean isReversed(ArrayList<Integer> firstList,ArrayList<Integer> secondList)

{

    for (int j = 0; j < firstList.size() / 2; j++)

{

    if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))

        {

            return false;

        }

}

    return true;

}

    
    

    
    
}