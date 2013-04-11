public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
     if(x<0) return -1; 
     if(x==0) return 0; 
     int pre=1, current=1;
     while(!(current<=x/current && (current+1)>x/(current+1)))
     {
         if(current<x/current)
         {
             pre=current;
             current=current<<1; 
         }else
         {
             current=pre+(current-pre)/2;
         }
     }
     return current; 
    }
}
