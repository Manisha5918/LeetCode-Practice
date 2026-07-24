class Solution {
    public boolean isPalindrome(int x) {

        int a=x;
        int rev=0;

        while(a>0){
            int b=a%10;
            rev=(rev*10+b);
            a=a/10;

        }     

        return(x==rev);
    }
}