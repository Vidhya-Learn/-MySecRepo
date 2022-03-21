package javascripts;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
		String rev="";

		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev= ch+rev;
		}
		System.out.println(rev);
	}

}
