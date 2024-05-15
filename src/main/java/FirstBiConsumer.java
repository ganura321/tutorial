import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FirstBiConsumer {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer , Integer> biConsumer =
				(a,b) -> System.out.println(a+b);
				
				biConsumer.accept(5,6);
				//consumer takes and not return.. call accept()
				
				firstinterface d = Test :: staticref;
				d.printme();
		Predicate<String> predicate = s -> s.length()>=5;
		//predicate takes input and give boolean with test()
		Predicate<String> predicate1 = s -> s.length()%2 == 0;
		System.out.println(predicate1.or(predicate).test("anurag"));
		Function<Integer,Integer> functionMe = i -> i*i;
		System.out.println(functionMe.apply(7));
		//Function take multiple inputs and give output calling apply()
		Supplier<String> supplier = () -> "anurag";
		//Supplier return value with get()
		System.out.println(supplier.get());
		Integer[] myArray = new Integer[]{10, 20, 33};
		List<Integer> myList = Arrays.asList(myArray);
		List<Integer> newList;
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);mySet.add(2);mySet.add(3);mySet.add(4);mySet.add(5);
		mySet.stream().filter(x -> x%2==0).forEach(x-> System.out.println("set"+ x));
		
		newList = myList.stream().filter(x-> x%2 ==0).collect(Collectors.toList());
		System.out.println(newList);
		myList.stream().filter(x-> x%2 ==0).forEach(x-> System.out.println(x));
		myList.stream().map(x-> x*x).forEach(x-> System.out.println(x));
		Integer[] myArray1 = new Integer[]{10, 20, 33, 10, 20, 34};
		Set<Integer> s = new HashSet<>();
		Arrays.asList(myArray1).stream().filter(x-> s.add(x)).map(x-> x*x).forEach(x-> System.out.println(x));
		//Arrays.asList(myArray1).stream().map(x-> x+10).forEach(x-> System.out.println(x));
		Arrays.asList(myArray1).stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x-> System.out.println(x));
		System.out.println(Arrays.asList(myArray1).stream().max((i1,i2)->i1.compareTo(i2)).get());
		Arrays.asList(myArray1).forEach(System.out::println);
		
		Predicate<Integer> PredicatePrime = i -> (i%2 !=0 && i%3 !=0 && i%5 != 0 && i%7 != 0 );
		System.out.println(PredicatePrime.test(101));
	}
	*/

}

class Test{
	
	public static void staticref() {
		System.out.println("anurag");
	}
}
