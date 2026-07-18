public class Solution {
    public bool IsSubsequence(string s, string t) {
        int i=0;

        foreach(char j in t){
            if(i<s.Length && s[i]==j){
                i++;
            }
        }
        return i==s.Length;
    }
}