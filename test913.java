import java.util.Scanner;
public class test913 {

	 public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 double[][] a=new double[100][100];
	     System.out.print("Enter the number of rows and columns in the array: ");
	     int i=input.nextInt();
	     int j=input.nextInt();
	     System.out.println("Enter the array: ");
	     for(int x=0;x<i;x++){
	    	 for(int y=0;y<j;y++){
	    		 a[x][y]=input.nextDouble();
	    	 }
	     }
	     Location b=locateLargest(a);
	     System.out.println("The location of the largest element is "+b.maxValue+" at ("+b.row+","+b.column+")");
	    }
	 public static Location locateLargest(double[][] a){
		 Location b=new Location();
		 b.maxValue=a[0][0];
		 b.row=0;
		 b.column=0;
		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a[i].length;j++){
				 if(a[j][i]>b.maxValue){
					 b.maxValue=a[j][i];
					 b.row=j;
					 b.column=i;
				 }
			 }
		 }
		 return b;
	 }

}
