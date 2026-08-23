class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        // Frequency of characters in p
        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            window[s.charAt(right) - 'a']++;

            // Keep window size equal to p.length()
            if (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            // Check if current window is an anagram
            if (Arrays.equals(need, window)) {
                result.add(left);
            }
        }

        return result;
    }
}