package hahhaa;
import java.util.Scanner;
public class lianxi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] s=new String[20];
		int[] a=new int[20];
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			s[i]=input.next();
			a[i]=input.nextInt();
		}
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				if(a[i]<a[j]){
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					String c;
					c=s[i];
					s[i]=s[j];
					s[j]=c;
				}
			}
		}
		for(int i=1;i<=n;i++){
			System.out.println(s[i]+" "+a[i]);
		}
	}

}
