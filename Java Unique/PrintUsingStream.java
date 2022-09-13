import java.util.*;
import java.util.stream.IntStream;

public class PrintUsingStream {

	public static void main(String[] args) {
		IntStream.range(1,101).forEach(e -> System.out.println(e));

	}

}
