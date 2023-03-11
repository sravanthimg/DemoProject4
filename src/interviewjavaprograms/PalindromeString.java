package interviewjavaprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str="MADAM";
		String org_str=str;
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome String");
		}else
		{
			System.out.println("Not a palindrome String");
		}
		

	}

}
