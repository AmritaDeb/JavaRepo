package ibmPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class ResultArmstrongNumber {

    /*
     * Complete the 'returnResult' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER intNumber as parameter.
     */

    public static String returnResult(int intNumber) {
        int actualNum = intNumber;
        int remainder = 0;
        int result = 0;
        
        String actualNumStr = String.valueOf(intNumber);
        System.out.println(actualNumStr.length()); 
        
        while(actualNum != 0){
            remainder = actualNum % 10;
            result += Math.pow(remainder, actualNumStr.length());
            actualNum /= 10;
        }
        System.out.println(result);
        
        if(result == intNumber){
           return "It is an Armstrong Number"; 
        } else {
            return "It is not an Armstrong Number";
        }
        
    }

}

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int intNumber = Integer.parseInt(bufferedReader.readLine().trim());

    	int intNumber = 153;
        System.out.println(ResultArmstrongNumber.returnResult(intNumber));

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
