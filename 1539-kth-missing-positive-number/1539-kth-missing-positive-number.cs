using System.Collections.Generic;
public class Solution
{
    public int FindKthPositive(int[] arr, int k){
        HashSet<int> set = new HashSet<int>(arr);
        int count = 0;
        int num = 1;
        while (true)
        { if (!set.Contains(num))
            {
                count++;
            }
            if (count == k)
            {
                return num;
            }
            num++;   
        }
    }
}