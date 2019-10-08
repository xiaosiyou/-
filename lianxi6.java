package hahhaa;
import java.util.Scanner;
public class lianxi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x=0;
		int[] a=new int[5];
		int[] b=new int[5];
		int s;
		int r;
		int c = 0;
		while(c!=4){
			s=(int)(Math.random()*4)+1;
			r=(int)( Math.random()*13)+1;
			for(int i=1;i<=4;i++){
				if(a[i]==s){
					x=1;
				}
				
			}
			if(x!=1){
				c++;
				a[c]=s;
				b[c]=r;
			}
			x=0;
			
		}
		for(int i=1;i<=4;i++){
			System.out.println(b[i]+" of "+a[i]);
		}
	}

}
