import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c= arr[i];

            if(!map.containsKey(c)){ 
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);    
            }
        }

        for(int i=0;i<s.length();i++){
           if( map.get(arr[i])==1){
                return i;
            }
        }
     return -1;   
    }
}