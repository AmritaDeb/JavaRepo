package array;

public class arrayObjectCreation {

	// array is a continuous block of memory which is used to store homogeneous values
	// in java, array is an object of type array ( type[] )
	// 2 ways to create array object
	// specifying the size of the array during the array declaration is mandatory

	public static void main(String[] args) {

		// way 1 : using new keyword
		int[] a = new int[4];
		System.out.println(a.length);

		// way 2 : by initializing the reference variable using {}
		int[] b = {1,5,10,15,20};
		System.out.println(b.length);
		
		// default value 0 will be initialized to elements of array during object creation
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
