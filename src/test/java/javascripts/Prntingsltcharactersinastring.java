package javascripts;

public class Prntingsltcharactersinastring {
	
	public static void main(String[] args) {
		
		String str = "Welcome";
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(i%2==0)
			{
				System.out.println(ch);
			}
		}			
	}

}
