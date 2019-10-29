import java.util.Scanner;
public class test912 {

	 public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	     System.out.print("Pleases enter 8 numbers: ");
	     double x1=input.nextDouble();
	     double y1=input.nextDouble();
	     double x2=input.nextDouble();
	     double y2=input.nextDouble();
	     double x3=input.nextDouble();
	     double y3=input.nextDouble();
	     double x4=input.nextDouble();
	     double y4=input.nextDouble();
	     LinearEquation n=new LinearEquation((y1-y2),-(x1-x2),(y3-y4),-(x3-x4),(y1-y2)*x1-(x1-x2)*y1,(y3-y4)*x3-(x3-x4)*y3);
	     System.out.println(n.getX()+" "+n.getY());
	    }

}
