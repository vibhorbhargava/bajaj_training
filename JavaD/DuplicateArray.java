package javaquestions;

public class DuplicateArray {

	public static void main(String[] args)
	{
        int arr[] = {10,20,30,30,50,60,60,80,80,90};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
