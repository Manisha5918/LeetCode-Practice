public class Solution {
    public char FindTheDifference(string s, string t) {

        char[] a = s.ToCharArray();
        char[] b = t.ToCharArray();

        Array.Sort(a);
        Array.Sort(b);

        for (int i = 0; i < a.Length; i++)
        {
            if (a[i] != b[i])
                return b[i];
        }

        return b[b.Length - 1];
    }
}