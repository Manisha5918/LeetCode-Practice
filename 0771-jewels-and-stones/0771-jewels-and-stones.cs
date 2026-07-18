public class Solution {
    public int NumJewelsInStones(string jewels, string stones) {
        int count=0;

        foreach(char i in stones){
            foreach(char j in jewels){
                if(i==j){
                    count++;
                    
                }
            }
        }
        return count;
    }
  
}