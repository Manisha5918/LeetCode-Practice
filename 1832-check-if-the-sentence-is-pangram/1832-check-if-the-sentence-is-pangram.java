import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();

        char[] arr=sentence.toCharArray();

        for(char c : arr){
            if(!set.contains(c)){
                set.add(c);
            }
        }

        return set.size()==26;



    }
}