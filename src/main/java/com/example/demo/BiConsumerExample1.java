package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class BiConsumerExample1 {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Instructor> instructors = Instructors.getAll();
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		List<String> name1 = Arrays.asList("anurag","jacob","Anusha","Aahana","Leena");
		System.out.println(numbers.stream().map(x->x*x).collect(Collectors.toList()));
		System.out.println(name1.stream().filter(x->x.startsWith("L")).collect(Collectors.toList()));
		System.out.println(name1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		// Terminal operation
		//Collect
		System.out.println(numbers.stream().map(x->x*x).collect(Collectors.toList()));
		//forEach
		name1.stream().sorted().forEach(s->System.out.println(s));
		//reduce
		
		Set<String> courses1 = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).collect(Collectors.toSet());
		System.out.println("*****"+courses1);
		BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println(
                "name is " + name + " courses: " + courses);
		
		BiConsumer<String,String> biConsumer = (name,gender) ->{
			System.out.println("Name is :" + name + " and Gender is :"+ gender);	
			};
		
		instructors.forEach(s->{biConsumer1.accept(s.getName(),s.getCourses());});
		instructors.forEach(s->{biConsumer.accept(s.getName(),s.getGender());});
		
		BiConsumer<String,List<String>> biConsumer2 = (name,courses) ->{
				System.out.println(
		                "name is " + name + " courses: " + 
				courses.stream().filter(str -> str.contains("Java")).collect(Collectors.toList()));
				
			};
			List<Instructor> instructor1 = instructors.stream()
				      .filter(ins -> ins.courses.contains("Java Programming"))
				      .collect(Collectors.toList());	
			instructor1.forEach(s->{biConsumer2.accept(s.getName(),s.getCourses());});	
	}*/
}
