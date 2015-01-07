import java.util.Scanner;
import java.io.IOException;


public class NumInAlpha{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num;
		
		for(;;)
		{
		System.out.print("Enter a 3 digit number : ");
		num= sc.nextInt();
		if(num%1000!=num)
			System.out.println("Number entered is greater than 3 digits. Please try again.");
		else
		{
			Convert2Alpha(num);
			break;
		}
		}

	}
	
	public static void Convert2Alpha(int num){
		String s1,s2,s3;
		int n1,n2,n3;
		
		n1=num%10;
		n2=(num%100-n1)/10;
		n3=(num%1000-n2*10-n1)/100;
		
		switch(n1){
		
		case 1: s1=new String("One");
				break;
		case 2: s1=new String("Two");
				break;
		case 3: s1=new String("Three");
				break;
		case 4: s1=new String("Four");
				break;
		case 5: s1=new String("Five");
				break;
		case 6: s1=new String("Six");
				break;
		case 7: s1=new String("Seven");
				break;
		case 8: s1=new String("Eight");
				break;
		case 9: s1=new String("Nine");
				break;
		default: s1=new String("");
				break;
		}
		
		switch(n2){
		
		case 1: switch(n1){
		
				case 1: s2=new String("Eleven");
						break;
				case 2: s2=new String("Twelve");
						break;
				case 3: s2=new String("Thirteen");
						break;
				case 4: s2=new String("Fourteen");
						break;
				case 5: s2=new String("Fifteen");
						break;
				case 6: s2=new String("Sixteen");
						break;
				case 7: s2=new String("Seventeen");
						break;
				case 8: s2=new String("Eighteen");
						break;
				case 9: s2=new String("Nineteen");
						break;
				default: s2=new String("Ten");
						break;
				}
				s1=new String("");
				break;
		case 2: s2=new String("Twenty");
				break;
		case 3: s2=new String("Thirty");
				break;
		case 4: s2=new String("Fourty");
				break;
		case 5: s2=new String("Fifty");
				break;
		case 6: s2=new String("Sixty");
				break;
		case 7: s2=new String("Seventy");
				break;
		case 8: s2=new String("Eighty");
				break;
		case 9: s2=new String("Ninety");
				break;
		default: s2=new String("");
				break;
		}
		
		switch(n3){
		
		case 1: s3=new String("One Hundred and");
				break;
		case 2: s3=new String("Two Hundred and");
				break;
		case 3: s3=new String("Three Hundred and");
				break;
		case 4: s3=new String("Four Hundred and");
				break;
		case 5: s3=new String("Five Hundred and");
				break;
		case 6: s3=new String("Six Hundred and");
				break;
		case 7: s3=new String("Seven Hundred and");
				break;
		case 8: s3=new String("Eight Hundred and");
				break;
		case 9: s3=new String("Nine Hundred and");
				break;
		default: s3=new String("");
				break;
		}
		
		
	System.out.println(s3+" "+s2+" "+s1);
	}

}
