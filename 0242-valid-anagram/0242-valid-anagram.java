import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> anagrams = new HashMap<>();

        // Step 1: Count characters of s
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (anagrams.containsKey(ch)) {

                int count = anagrams.get(ch);
                count++;

                anagrams.put(ch, count);

            } else {

                anagrams.put(ch, 1);
            }
        }

        // Step 2: Subtract characters of t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (anagrams.containsKey(ch)) {

                int count = anagrams.get(ch);
                count--;

                anagrams.put(ch, count);

            } else {

                return false;
            }
        }

        // Step 3: Check all counts
        for (int count : anagrams.values()) {

            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}