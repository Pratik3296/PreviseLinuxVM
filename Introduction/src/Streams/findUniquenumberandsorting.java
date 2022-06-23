package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findUniquenumberandsorting {

	public static void main(String[] args) {
	List<Integer> val = Arrays.asList(3,2,4,4,5,6,4,2,8,9);
		
		//val.stream().distinct().forEach(s->System.out.println(s));
		val.stream().distinct().sorted().collect(Collectors.toList()).forEach(s->System.out.print(s));
		List<Integer> li = val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println();
		System.out.println(li.get(2));
	}

}
