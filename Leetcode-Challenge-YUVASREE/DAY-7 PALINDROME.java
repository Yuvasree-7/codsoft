class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
            int rev=0,rem;
            int a=x;
            while(x>0){
                rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
            if(a==rev)
            return true;
            else
            return false;
        }
        
    }
}