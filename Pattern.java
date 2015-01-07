
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader In = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(In);
		
		System.out.println("Enter number of lines of Pattern : ");
		int num=Integer.parseInt(Br.readLine());
		GeneratePattern(num);
	}
	
	public static void GeneratePattern(int n) {
		
		for(int i=n;i>0;i--)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			
			for(int k=i;k>0;k--)
				System.out.print("* ");
			
			System.out.println();
		}
	}

}
