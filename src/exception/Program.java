package exception;

public class Program {
    public static void foo() {
      try {
        int num1 = 5/0;
      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }

    public static void main( String args[] ) {
      foo();
    }
}
