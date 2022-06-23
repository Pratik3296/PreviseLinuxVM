package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streamsexample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList();
		names.add("Pratik");
		names.add("Priti");
		names.add("Komal");
		names.add("Prerna");
		names.add("Payal");
		
		String[] nam1 = {"Pzratik","Pariti","Komal","Pberna","Payal"};
		String[] nam2 = {"Diksha","Prathibha","Santy","Paktosh","Poakra"};

		List<String> names1 = Arrays.asList(nam1);
		List<String> names2 = Arrays.asList(nam2);

		//Long c= names.stream().filter(s->s.startsWith("P")).count();
	
		//System.out.println(c);
		//Long c = Stream.of("Pratik","Priti","Komal","Prerna","Payal").filter(s->s.startsWith("P")).count();
		//System.out.println(c);
		
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.endsWith("l")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
		// Printing all arrays containing P letter
		//names.stream().filter(s->s.contains("P")).forEach(s->System.out.println(s));
		
		// Printing the array where length is greater than 0 and making it to upper case	
		//names.stream().filter(s->s.length()>0).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// Sorting and making to Upper case
		//names1.stream().filter(s->s.startsWith("P")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// Merging 2 diff list of Arrays
		//Stream<String> newstream = Stream.concat(names1.stream(), names2.stream());
		//newstream.forEach(s->System.out.println(s));
		
		
		
		// Returns true or fales
		//boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Diksha"));
		//System.out.println(flag);
		//Assert.assertTrue(flag);
		
		
		// For-loop for printing the first string from an array
//		for(int i=0;i<names.size();i++)
//		{
//			System.out.println(names.get(0));
//			break;
//		}
		
	}

}