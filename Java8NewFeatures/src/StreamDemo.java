import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print integer from 1  to 10
		/* IntStream.range(1, 10).forEach(System.out::println); */
		
		//Integer stream with skip
		/* IntStream.range(1,10).skip(5).forEach(System.out::println); */
		
		//Integer stream sum from 1 to 9
		/*
		 * int sum = IntStream.range(1,10).sum(); System.out.println(sum);
		 */
		
		//sorted and finndfirst
		List<String> list = new ArrayList<>();
		list.add("rinki");
		list.add("kashvi");
		list.add("saurabh");
		list.add("krishav");
		Optional<String> optional = list.stream().sorted().findFirst();
		optional.ifPresent(System.out::println);
		//Stream from list, sort, filter, print
		System.out.println("/************Stream from list, sort, filter, print********************/");
		list.stream().sorted().filter(s->s.toLowerCase().startsWith("k")).forEach(System.out::println);
		
		System.out.println("/************Stream from Arrays, sort, filter, print********************/");
		String[] strArray = {"rinki","kashvi","saurabh","krishav"};
		Arrays.stream(strArray).sorted().filter(s->s.startsWith("k")).forEach(System.out::println);
		System.out.println("/************Average of squares of an int array********************/");
		int[] intArray = {2,4,6,8,10};
		Arrays.stream(intArray).map(n->n*n).average().ifPresent(System.out::println);
		
		
		
	}

}
