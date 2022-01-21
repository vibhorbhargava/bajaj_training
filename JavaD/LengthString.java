package javaquestions;

public class LengthString {

	public static void main(String[] args) 
	{
		String s = "My name is Vibhor Bhargava";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println("The number of characters in string are "+count);
	}

}
