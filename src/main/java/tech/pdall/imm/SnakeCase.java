package tech.pdall.imm;

public class SnakeCase {

	public static void main(String[] args) {
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		String camelCase = "CamelCaseToSomethingElse : Value";
		String underscore = camelCase.replaceAll(regex, replacement).toLowerCase();
		System.out.println(underscore);
	}

}
