import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class StringCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(In);
		
		int ret=0;
		
		for(;;)
		{
		System.out.print("Enter string : ");
		String s=Br.readLine();
		ret=CheckPalindrome(s);
		
		if(ret==1)
			break;
		}
	}
	
	public static int CheckPalindrome(String s) {
	
	int n=s.length(),palindrome=0;
	
	if(s.equals("GSCRnsit"))
	{
		System.out.println("PROGRAM TERMINATED");
		return(1);
	}
	
    else {
		
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)==s.charAt(n-i-1))
			 palindrome=0;
			else
			{
				palindrome=1;
				break;
			}
		}
		if(palindrome==0)
			System.out.println("Given String is a Palindrome");
		else
			System.out.println("Given String is not a Palindrome");
		
		return(0);
		}
	
		
	}

}
