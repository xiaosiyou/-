package class3;

public class LinearSearch {

	public static void main(String[] args) {
		java.util.Scanner input=new java.util.Scanner(System.in);
		int[] list={1,2,3,4,5,6,7,8,9};
		int a=input.nextInt();
		int tim=linearSearch(list,a);
		System.out.println(tim);
	}
	public static int linearSearch(int[] list,int key) {
		for(int i=0;i<list.length;i++){
			if(key==list[i])
				return i;
		}
		return -1;
	}

}

