
import java.util.*;

public class DuplicateUsingHashSet {

	public static void main(String[] args) {
		 int arr[]= {2,2,3,4,5,3,4,5,3,7,6,5,6};
			HashSet<Integer> hs=new HashSet<Integer>();
			for (int i=0;i<arr.length;i++)
			{
				hs.add(arr[i]);
			}
			System.out.println(hs);

	}

}
