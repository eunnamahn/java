import java.util.Scanner;

public class maxSum {

	public static void main(String[] args) {
		
		int data[] = new int[] {-2, 3, 5, -14, 12, 3, -9, 8, -1, 13, 2, -5, 4};
		int size = data.length;
		
		int max = 0;
		
		for (int i = 0; i < size; i++)
		{
			for (int j = i; j < size; j++)
			{
				int sum = 0;
				
				for (int k = i; k <= j; k++)
				{
					sum += data[k];
					
					if (sum > max)
					{
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
		
	}

}
