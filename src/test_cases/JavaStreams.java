package test_cases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void regular() {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Paola");
		names.add("Ram");
		names.add("Maga");
		
		int count = 0;
		for(String name: names) {
			if(name.startsWith("A")) count++;
		}
		
		System.out.println(count+" names start with letter A");
		
	}
	
	@Test
	public void streamFilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Paola");
		names.add("Ram");
		names.add("Maga");
		names.add("Amelia");
		
		//There is no life for intermediate operation if there is no terminal operation
		//Terminal operation will execute only if intermediate operation returns true
		long count = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count+" names start with letter A with Streams");
		
		
		long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Paola","Ram","Maga","Amelia").filter(s->
		{
			s.startsWith("A");
		// 	s.endsWith("A");
			return true;
		}).count();
		
		System.out.println(d+" names start with letter A and End with letter A with Streams");
		
		//Print names bigger than 4 letters
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("");
		
	}
	
	@Test
	public void streamMap() {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		//print names with last letter in A to Uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Paola","Ram","Maga","Amelia").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("");
		
		//print names which have firts letter as A with Uppercase and sorted
		List<String> names = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Paola","Ram","Maga","Amelia");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("");
		 
		//Concat to list into 1
		Stream<String> newStream = Stream.concat(memberNames.stream(), names.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//Find a name into stream list
		boolean flagName = newStream.anyMatch(s->s.equalsIgnoreCase("Aman"));
		Assert.assertTrue(flagName);
		
	}
	
	@Test
	public void streamCollect() {
		
		List<String> list1 = Stream.of("Abhijeet","Don","Alekhya","Adam","Paola","Ram","Maga","Amelia").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list1.get(0));
		
		//print unique number from array
		List<Integer> numbers = Arrays.asList(3,5,2,2,4,2,4,3,5,1,9,15,7,7,6);
		numbers.stream().sorted().distinct().forEach(s->System.out.println(s));
		System.out.println("");
		
		//print number in position 2 from array
		List<Integer> numbers2 = Arrays.asList(3,5,2,2,4,2,4,3,5,1,9,15,7,7,6);
		List<Integer> orderedNumbers = numbers2.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Number in position 2 is: "+ orderedNumbers.get(2));
		
	}
	
	

}
