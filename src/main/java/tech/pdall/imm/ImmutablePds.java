package tech.pdall.imm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author prads
 *
 */
public final class ImmutablePds {

	private final int id;
	private String name;
	private final HashMap<String, Integer> mapData;

	public ImmutablePds(int id, String name, HashMap<String, Integer> map) {
		super();
		this.id = id;
		this.name = name;
		//this.mapData = map;

		Map<String,Integer> tempMap = new HashMap<>(map.size()); 
		//map.entrySet().stream().map(e->tempMap.put(e.getKey(), e.getValue()));
		//tempMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		tempMap = map.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),e->e.getValue()));

		/*for(Map.Entry<String, Integer> entry : map.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}*/
		/*Iterator<String> keys = map.keySet().iterator(); 
		while(keys.hasNext()) { 
			String key = keys.next(); 
			tempMap.put(key, map.get(key)); 
		} */
		this.mapData = (HashMap<String, Integer>) tempMap;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, Integer> getMapData() {
		//return this.mapData;
		return (HashMap<String, Integer>) (mapData).clone();
	}

	@Override
	public String toString() {
		return "ImmutablePds [id=" + id + ", name=" + name + ", mapData=" + mapData + "]";
	}

}
