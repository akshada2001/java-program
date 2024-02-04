import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruitexample {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store anagrams
        Map<String, List<String>> map = new HashMap();
        
        // Iterate through each word in the array
        for (String word : strs) {
            // Convert word to char array, sort it, and convert back to string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            // If the sorted word exists in the map, add the original word to its list
            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(word);
            } else {
                // If not, create a new list with the word and put it in the map
                List<String> newList = new ArrayList();
                newList.add(word);
                map.put(sortedWord, newList);
            }
        }
        
        // Convert map values to a list and return
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(inputArray);
        System.out.println(result);
    }
}


	


