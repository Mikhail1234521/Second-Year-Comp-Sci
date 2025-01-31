import java.util.ArrayList;

public class InsertionSort {

	String[] listOfItems2 = new String[100];
	ArrayList<String> CopyFileFI = new ArrayList<>();
	public InsertionSort(ArrayList<String> A)
	{
		for(int i=0; i < A.size() ; i++)
		{
		CopyFileFI.add(A.get(i));
		}
	}
	
	public String[] sort()
	{
		   int initialPosition;
		   String valueToInsert;
			
		   for(int i=0; i < listOfItems2.length ; i++)
		   {
		      /* select value to be inserted */
		      valueToInsert = listOfItems2[i];
		      int holePosition = i;
		      
		      /*locate hole position for the element to be inserted */
				
		      while ((holePosition > 0) && (listOfItems2[holePosition-1].compareTo(valueToInsert)) == 0)
		      {
		         listOfItems2[holePosition] = listOfItems2[holePosition-1];
		         holePosition = holePosition -1;
		      }
		      listOfItems2[holePosition-1]
		      /* insert the number at hole position */
		      A[holePosition] = valueToInsert;
		     
		   }
	}
}
