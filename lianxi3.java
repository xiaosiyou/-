package hahhaa;
import java.util.Scanner;
public class lianxi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] d=new double[15];
		for(int i=1;i<=10;i++) d[i]=input.nextDouble();
		for(int i=1;i<=10;i++){
			for(int j=i;j<=10;j++){
				if(d[i]>d[j]){
					double s;
					s=d[i];
					d[i]=d[j];
					d[j]=s;
				}
			}
		}
		for(int i=1;i<=10;i++) System.out.println(d[i]);
	}

}
