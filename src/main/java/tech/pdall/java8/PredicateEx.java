package tech.pdall.java8;

import java.util.function.Predicate;

public class PredicateEx {
	
	Predicate<Integer> predicate = t -> {return t%2 == 0;};

}
