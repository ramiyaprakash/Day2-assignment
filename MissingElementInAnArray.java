package week1.day2.arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	


		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=1;i<=arr.length; i++)
		{
			if(arr[i-1] != i)
			{
				System.out.println("First missing Element is " + i + " " + arr[i-1]);
				break;
			}
		}
		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration




	}

}