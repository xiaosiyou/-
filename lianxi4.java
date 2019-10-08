package hahhaa;
import java.util.Scanner;
public class lianxi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int c=0;
		int[] a=new int[100];
		System.out.print("Enter the size of the list: ");
		int n=input.nextInt();
		System.out.print("Enter the contents of the list: ");
		for(int i=1;i<=n;i++){
			a[i]=input.nextInt();
		}
		for(int i=1;i<n;i++){
			if(a[i]>a[i+1]) c=1;
		}
		System.out.print("The list has "+n+" integers ");
		for(int i=1;i<=n;i++) 	System.out.print(a[i]+" ");
		System.out.println();
		if(c==1){
			System.out.println("The list is not sorted");
		}
		else 	System.out.println("The list is already sorted");
	}

}
