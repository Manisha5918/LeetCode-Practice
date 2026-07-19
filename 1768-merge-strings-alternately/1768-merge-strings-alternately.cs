using System.Collections.Generic;
public class Solution {
    public string MergeAlternately(string word1, string word2) {

        Char[] arr1=word1.ToCharArray();
        Char[] arr2=word2.ToCharArray();
        
        List<char> output = new List<char>();

        int max=Math.Max(word1.Length,word2.Length);

        for(int i =0;i<max;i++){
            if(i<word1.Length){
                output.Add(arr1[i]);
            }
            if(i<word2.Length){
                output.Add(arr2[i]);
            }
        }
        return new String(output.ToArray());
    }
}