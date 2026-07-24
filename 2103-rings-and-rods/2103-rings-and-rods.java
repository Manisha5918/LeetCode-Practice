import java.util.*;

class Solution {
    public int countPoints(String rings) {
        HashSet<Character>[] arr = new HashSet[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = new HashSet<>();
        }

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            arr[rod].add(color);
        }

        int ans = 0;

        for (HashSet<Character> set : arr) {
            if (set.size() == 3) {
                ans++;
            }
        }

        return ans;
    }
}