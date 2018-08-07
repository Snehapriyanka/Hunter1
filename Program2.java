import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		String str=Arrays.toString(a);
		String str1=str.substring(1, str.length()-1);
		
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		System.out.println(sb);
	}

	}



