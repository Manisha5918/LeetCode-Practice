public class Solution {
    public bool IsAnagram(string s, string t) {

    if(s.Length!=t.Length)
    {
        return false;
         
    }

    char[] c1=s.ToCharArray();
    char[] c2=t.ToCharArray();

    Array.Sort(c1);
    Array.Sort(c2);

    return new String(c1)== new String(c2);
        
    }
}