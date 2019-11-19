package hahah;

class GraduateStudentd {
	static void main(String[] args) {
		m(new CastingDemo());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	public static void m(Object x){
		System.out.println(x.toString());
	}
}
	public class CastingDemo extends Student{
	
	}
	class Student extends Person{
		public String toString(){
			return "Student";
		}
	}
	
	class Person extends Object{
		public String toString(){
			return "Person";
		}
	}
