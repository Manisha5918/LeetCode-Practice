class Solution {
    public String removeStars(String s) {

        StringBuilder s1=new StringBuilder();

        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);

           if(c!='*'){
            s1.append(c);
           } 
           else{
            s1.deleteCharAt(s1.length()-1);
           }
        }
        return s1.toString();
    }
}