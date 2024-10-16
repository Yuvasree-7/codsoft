class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int start =1, end=x,result=0;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                start=mid+1;
                result=mid;
            }
            else{
                end=mid-1;
            }
        }
        return result;
        
        
    }
}