public class Solution {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer sb=new StringBuffer(); 
        int m=num/1000; 
        while(m!=0)
        {
            sb.append("M"); m--; 
        }
        num=num%1000; 
        sb.append(stringHelper(num/100, "C", "D", "M"));
        num=num%100; 
        sb.append(stringHelper(num/10, "X", "L", "C"));
        num=num%10;
        sb.append(stringHelper(num, "I", "V", "X"));
        return sb.toString(); 
    }
    String stringHelper(int num, String one, String five, String ten)
    {
        String result=""; 
        switch(num)
        {
            case 1: case 2: case 3:
                while(num!=0)
                {
                    result+=one; num--; 
                }
                break; 
            case 4: 
                result+=one+five; 
                break; 
            case 5: 
                result+=five; 
                break; 
            case 6: case 7: case 8:
                result+=five;
                num-=5;
                while(num!=0)
                {
                    result+=one; num--; 
                }
                break; 
            case 9: 
                result+=one+ten;
                break; 
            case 10: 
                result+=ten;
                break; 
        }
        return result; 
    }
}
