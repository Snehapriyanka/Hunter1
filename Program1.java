import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int ssArray[]=new int[n];
		for(int k=0;k<n;k++) {
		ssArray[k]=c.nextInt();	
		}
		for(int i=0;i<ssArray.length-1;i++) {
			for(int j=i+1;j<ssArray.length;j++) 
			{
				if(ssArray[i]==ssArray[j] && i!=j) {
					System.out.println(ssArray[j]);
				}
			}
		}
	}
}

