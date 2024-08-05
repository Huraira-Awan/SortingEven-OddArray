

public class Main {
	
	public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
	

	public static void main(String[] args) {
		
		int n = 9;
		
		int[] arr = {2,7,5,12,13,14,15,9,10};
		
		int evenSize = 0;
		int oddSize = 0;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]%2 == 0)
			{
				evenSize++;
			}
			else
			{
				oddSize++;
			}
			
		}
		
		int [] even = new int[evenSize];
		int[] odd = new int[oddSize];
		
		int j = 0 , k=0;
		
		for(int i= 0; i<n; i++)
		{
			if(arr[i]%2 == 0)
			{
				even[j++] = arr[i];
			}
			else
			{
				odd[k++] = arr[i];
			}
		}
	System.out.print("Even Numbers:");
	printArray(even);
	
	System.out.println();
	
	System.out.print("Odd Numbers:");
	printArray(odd);
	System.out.println();
	
	
	
	int[] result = new int[n];
    int pos = 0;
    for (int element : even) {
        result[pos] = element;
        pos++;
    }

    for (int element : odd) {
        result[pos] = element;
        pos++;
    }

//    printArray(result);
    
    for(int m = 0; m<result.length; m++ )
    	
    {
    	
    	for(int w = m+1; w<result.length; w++)
    	{
    		int temp = 0 ;
    		if(result[m] > result[w])
    		{
    			temp = result[m];
    			result[m] = result[w];
    			result[w] = temp;
    		}
    		
    	}
    	
    }
    
    System.out.print("Sorted element of array :");
    
    printArray(result);
	
	
}


}

