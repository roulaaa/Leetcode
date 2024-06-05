class Solution {
    public static List<String> commonChars(String[] words) {
        List<String> commonCharacters = new ArrayList<>();
        if (words == null || words.length == 0) {
            return commonCharacters; 
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            charMap.put(c, Integer.MAX_VALUE);
        }

        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            HashMap<Character, Integer> charFreqMap = new HashMap<>();
            for (int j = 0; j < wordChars.length; j++) {
                char c = wordChars[j];
                charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
            }
            
            Iterator<Map.Entry<Character, Integer>> iter = charMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<Character, Integer> entry = iter.next();
                char c = entry.getKey();
                entry.setValue(Math.min(entry.getValue(), charFreqMap.getOrDefault(c, 0)));
            }
        }

        Iterator<Map.Entry<Character, Integer>> iter = charMap.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            char c = entry.getKey();
            int freq = entry.getValue();
            while (freq > 0 && freq != Integer.MAX_VALUE) {
                commonCharacters.add(String.valueOf(c));
                freq--;
            }
        }

        return commonCharacters;
    }
}