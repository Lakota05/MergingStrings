import java.util.Arrays;
import java.util.stream.Stream;

public class Merge2Strings {

	public static void main(String[] args) {
		
		String[] array1 = {"Bill", "Tom", "Harry"};
		String[] array2 = {"Mary", "Sue", "Laura"};
		
		Stream<String> sa1 = Arrays.stream(array1);
		Stream<String> sa2 = Arrays.stream(array2);
		
		String mergeArray[] = Stream.concat(sa1, sa2).toArray(size -> new String[size]);
		
		for(String s : mergeArray) {
		System.out.println(s);
		}
	}

}
