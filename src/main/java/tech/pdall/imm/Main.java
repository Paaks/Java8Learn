package tech.pdall.imm;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		// Immutable testing
		int id = 10;
		String name = "Prads";
		HashMap<String, Integer> mapData = new HashMap<>();
		mapData.put("key1", 1);
		mapData.put("key2", 2);
		ImmutablePds immutablePds = new ImmutablePds(id, name, mapData);
		System.out.println("Current Map -" + immutablePds);
		immutablePds.getMapData().put("key3", 3);
		System.out.println("Current Map -" + immutablePds);
	}

}