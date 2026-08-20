class Solution {
    public long minimumSteps(String s) {
        int left=0;
        int right=1;
        long answer=0;
        char[] s1=s.toCharArray();
        while(right<s.length()){
            if (s1[left]=='0'){
                left++;
                if(right<=left){
                    right=left+1;
                }
            }
            else if(s1[right]=='1'){
                right++;
            }
            else{
                answer+=(right-left);
                s1[left]=0;
                s1[right]=1;

                left++;
                right++;
            }
        }
        return answer;
    }
}