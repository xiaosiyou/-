package hahhaa;
import java.util.Scanner;
public class lianxi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] a=new int[15];
		System.out.print("Enter 10 numbers: ");
		int b;
		int c=0;
		int n=0;
		for(int i=1;i<=10;i++){
			b=input.nextInt();
			for(int j=1;j<=n;j++){
				if(b==a[j]) c++;
			}
			if(c==0){
				n++;
				a[n]=b;
			}
			c=0;
		}
		System.out.println("The number of distinct numbers is "+n);
		System.out.print("The distinct numbers are: ");
		for(int i=1;i<=n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
