public class Solution {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer sb=new StringBuffer(); 
        //'M', 1000; 'D', 500; 'C', 100 ; 'L', 50; 'X',10; 'V', 5; 'I', 1 
        //I、X、C
        int Mn=num/1000;
        while(Mn!=0)
        {
            sb.append("M"); Mn--; 
        }
        num=num%1000; 
        sb.append(intToRoman("M", "D", "C", num/100));
        num=num%100; 
        sb.append(intToRoman("C", "L", "X", num/10));
        num=num%10; 
        sb.append(intToRoman("X", "V", "I", num));
        return sb.toString(); 
    }
    
    String intToRoman(String ten, String five, String one, int num)
    {
        StringBuffer result=new StringBuffer(); 
        num=num%10; 
        switch(num)
        {
            case 9:
                result.append(one+ten); break; 
            case 5: case 6: case 7: case 8: 
                result.append(five);
                num-=5; 
                while(num!=0)
                {
                    result.append(one); num--; 
                }
                break; 
            case 4: 
                result.append(one+five); break; 
            case 3: case 2: case 1:
                while(num!=0)
                {
                    result.append(one); num--; 
                }
                break; 
        }
        return result.toString(); 
    }
}
