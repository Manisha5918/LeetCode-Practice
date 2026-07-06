public class Solution {
    public int HammingDistance(int x, int y) {

        int xor=x^y;

        int count=0;

        while(xor>0){

            if(xor%2==1){
                count++;
            }
            xor/=2;
            
        }
        return count;
        
    }
}