package programs;


public class ReverseStringUsingToCharArray {

	public static void main(String args[]) {
	      String input = "Competition";
	      char[] inputChar = input.toCharArray();
	      String result = "";
	      
	      for(int i=input.length()-1; i>=0; i--) {
	    	  result = result + inputChar[i];
	      }
	      System.out.println(result);
	    }
}
