public class Solution {
public ArrayList<ArrayList<String>> partition(String s) {
    if(s == null || s.length() == 0)
        return new ArrayList<ArrayList<String>>();
    boolean[][] isPa = new boolean[s.length()][s.length()];
    for(int i = 0; i < s.length(); i++){
        isPa[i][i] = true;
    }
    for(int i = s.length() - 2; i >= 0; i --){
        isPa[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
        for(int j = i + 2; j < s.length(); j++) 
            isPa[i][j] = (s.charAt(i) == s.charAt(j)) && isPa[i + 1][j - 1];
    }
    return partitionHelper(s, 0, isPa);
}

public ArrayList<ArrayList<String>> partitionHelper(String s, int start, boolean[][] isPa){
    ArrayList<ArrayList<String>> pa = new ArrayList<ArrayList<String>>();
    if(start == s.length()){
        pa.add(new ArrayList<String>());
        return pa;
    }
    for(int i = start; i < s.length(); i++){
        if(isPa[start][i])
            for(ArrayList<String> subPa: partitionHelper(s, i + 1, isPa)){
                subPa.add(0, s.substring(start, i + 1));
                pa.add(subPa);
            }
    }
    return pa;
}
}
