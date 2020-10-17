package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.naming.spi.DirStateFactory.Result;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class TaumAndBday {
	

	    public static long taumBday(int b, int w, int bc, int wc, int z) {
	    // Write your code here
	    //convert all int values to long
	    long finalPrice=0;
	    long blackPrice=bc;
	    long whitePrice=wc;  
	    long blackNumber=b;
	    long whiteNumber=w;
	    long changePrice=z;
	    //if cost of black and white gifts is same,simply add no of gifts and multiple with
	    // any price
	    if(blackPrice==whitePrice)
	    {
	        finalPrice=(blackNumber+w)*blackPrice;
	    }
	    //if cost of black is higher than cost of white and conversion cost, buy white gifts
	    //and convert to black 
	    else if(blackPrice>whitePrice+changePrice)
	    {
	        finalPrice=(whiteNumber*whitePrice)+(blackNumber*(whitePrice+changePrice));
	    }
	    //if cost of white is higher than cost of black and conversion cost, buy black gifts
	    //and convert to white
	    else if(whitePrice>blackPrice+changePrice)
	    {
	         finalPrice=(blackNumber*blackPrice)+(whiteNumber*(blackPrice+changePrice));
	    }
	    //otherwise, buy desired no of black and white gifts
	    else
	    {
	        finalPrice=(whiteNumber*whitePrice)+(blackNumber*blackPrice);
	    }
	    return finalPrice;
	      
	}
	

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium,Drivers and Cucumber\\test.txt"));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int b = Integer.parseInt(firstMultipleInput[0]);

	                int w = Integer.parseInt(firstMultipleInput[1]);

	                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int bc = Integer.parseInt(secondMultipleInput[0]);

	                int wc = Integer.parseInt(secondMultipleInput[1]);

	                int z = Integer.parseInt(secondMultipleInput[2]);

	                long result = taumBday(b, w, bc, wc, z);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}



