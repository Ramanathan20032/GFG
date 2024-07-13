package Easy;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String input1 = "hello";
        System.out.println(firstNonRepeatingCharacter(input1)); // Output: 'h'
        String input2 = "aabb";
        System.out.println(firstNonRepeatingCharacter(input2)); // Output: '$'
    }
    static char firstNonRepeatingCharacter(String str){
        // map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // count the frequency of the character.
        for (char c : str.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // find the first character with frequency 1.
        for (char c : str.toCharArray()){
            if(frequencyMap.get(c) == 1){
                return c;
            }
        }
        // If no non-repeating character is found, return '$'
        return '$';
    }
}
