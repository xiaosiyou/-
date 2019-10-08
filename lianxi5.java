package hahhaa;
import java.util.Scanner;
public class lianxi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] a=new int[110];
		for(int i=1;i<=100;i++){
			for(int j=i;j<=100;j+=i){
				if(a[j]==0) a[j]=1;
				else a[j]=0;
			}
		}
		for(int i=1;i<=100;i++){
			if(a[i]==1) System.out.print(i+" ");
		}
	}

}
