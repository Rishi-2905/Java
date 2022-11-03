
public class MaxInThreeElement {

	public static void main(String[] args) {
	int[] arr= {21,6,4,76,34,87,93};
	for(int i=0;i<arr.length-2;i++) {
		if(arr[i]>arr[i+1] && arr[i]>arr[i+2])
		{
			System.out.println(arr[i]);
		}
		else if(arr[i+1]>arr[i+2]) {
			System.out.println(arr[i+1]);
		}
		else {
			System.out.println(arr[i+2]);
		}
	}
	}

}