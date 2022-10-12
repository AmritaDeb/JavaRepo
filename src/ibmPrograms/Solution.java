package ibmPrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'SwapNumber' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER firstInt
     *  2. INTEGER secondInt
     */

    public static List<Integer> SwapNumber(int firstInt, int secondInt) {
        int temp ;
        
        System.out.println("Before Swap:");
        System.out.println("Value of firstInt :" + firstInt);
        System.out.println("Value of secondInt :" + secondInt);
        temp = firstInt;
        firstInt = secondInt;
        secondInt = temp;
        System.out.println("After Swap:");
        System.out.println("Value of firstInt :" + firstInt);
        System.out.println("Value of secondInt :" + secondInt);
        
        List<Integer> list = new ArrayList<>();
        list.add(firstInt);
        list.add(secondInt);
        return list;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int firstInt = Integer.parseInt(bufferedReader.readLine().trim());

        int secondInt = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.SwapNumber(firstInt, secondInt);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}