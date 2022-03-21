package javascripts;

public class CheckPalindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 354;
		
		int rev = 0;
		int temp = 354;
		
		while (num>0) {
			
			int d = num%10;
			rev = rev*10+d;
			num = num/10;
		}
		if (temp==rev)
		{
			System.out.println(temp + "is a palindrome");
		}
		else
		{
			System.out.println(temp + "is not  a palindrome");
		}
	}

}
