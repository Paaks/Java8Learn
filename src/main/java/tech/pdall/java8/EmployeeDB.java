/**
 * 
 */
package tech.pdall.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author prads
 *
 */
public class EmployeeDB {
	
	private static List<Employ> employList = new ArrayList<>(Arrays.asList(
			new Employ(101, "Prabs", 37, new Date(), "IND"),
			new Employ(104, "Arrun", 34, new Date(), "CA"),
			new Employ(106, "James", 41, new Date(), "US"),
			new Employ(123, "Vivek", 30, new Date(), "SG"),
			new Employ(116, "Naren", 40, new Date(), "MY")));
			 
	
	private static Map<Employ,Integer> employMap = new HashMap<>() {{
		put(new Employ(101, "Prabs", 37, new Date(), "IND"),32);
		put(new Employ(104, "Arrun", 34, new Date(), "IND"),43);
		put(new Employ(106, "James", 41, new Date(), "IND"),54);
		put(new Employ(123, "Vivek", 30, new Date(), "IND"),55);
		put(new Employ(116, "Naren", 40, new Date(), "IND"),76);
	}};
			

	public static List<Employ> getEmpList() {
		return employList;
		
	}
	public static HashMap<Employ, Integer> getEmpMap() {
		return (HashMap<Employ, Integer>) employMap;
		
	}
}
