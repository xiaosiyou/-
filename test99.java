
public class test99 {

	 public static void main(String[] args) {
	        RegularPolygon a=new RegularPolygon();
	        RegularPolygon b=new RegularPolygon(6,4);
	        RegularPolygon c=new RegularPolygon(10,4,5.6,7.8);
	        System.out.println(a.getPerimeter()+" "+a.getArea());
	        System.out.println(b.getPerimeter()+" "+b.getArea());
	        System.out.println(c.getPerimeter()+" "+c.getArea());
	    }

}
