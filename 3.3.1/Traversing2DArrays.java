/*
 * Activity 3.3.1
 */
public class Traversing2DArrays
{
  public static void main(String[] args)
  {
   String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"} }; 
                       
    for (String[] row : board){
      for (String col : row)
        {
          col = "TEST"; //Modifying col does not change the array
        }
    }
    for (String[] row : board){
      for (String col : row)
        {
          System.out.print(col + "\t");
          
        }
        System.out.println();
    }
  
  }
}
