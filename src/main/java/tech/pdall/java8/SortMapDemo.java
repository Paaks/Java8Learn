 package tech.pdall.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

 public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		 map.put("six", 6);
		map.put("nine", 9);
		map.put("two", 2);
		map.put("five", 5);
		map.put("aa", 10);
		
		/*List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry);
		}*/
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//map.keySet().stream().sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).forEach(System.out::println);
		//EmployeeDB.getEmpMap().entrySet().parallelStream().map( m -> m.getKey()).filter(e->e.getName().equalsIgnoreCase("prabs")).forEach(System.out::println);

		//EmployeeDB.getEmpList().stream().sorted(Comparator.comparing(Employ::getName)).forEach(System.out::println);
		Comparator<Employ> coutrySort = (o1, o2) -> o2.getCountry().compareToIgnoreCase(o1.getCountry()) ;
		Comparator<Employ> ageSort = (o1, o2) -> o1.getAge() - o2.getAge();

		EmployeeDB.getEmpList().stream().sorted().forEach(System.out::println);
		System.out.println("*************");
		EmployeeDB.getEmpList().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("*************");
		EmployeeDB.getEmpList().stream().sorted(coutrySort).forEach(System.out::println);
		System.out.println("*********");
		EmployeeDB.getEmpList().stream().sorted(ageSort).forEach(System.out::println);
	}

}
