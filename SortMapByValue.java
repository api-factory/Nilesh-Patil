import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final Map<String, Integer> wordCounts = new HashMap<>();
	        wordCounts.put("D", 100);
	        wordCounts.put("V", 200);
	        wordCounts.put("S", 50);
	        wordCounts.put("H", 70);
	        wordCounts.put("X", 200);
	        final Map<String, Integer> sortedByCount = sortByValue(wordCounts);
	        System.out.println(sortedByCount);

	}
	
	public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}
