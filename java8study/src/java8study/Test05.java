package java8study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 复杂的结合Predicate 使用
 * 
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++",
				"Haskell", "Lisp");
		 Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		 Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		 languages.stream().filter(startsWithJ.and(fourLetterLong)).forEach((n)->{
			 System.out.println("\nName, which starts with 'J' and four letter long is : " + n);
		 });
	}
}
