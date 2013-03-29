class Solution {
public:
    vector<vector<int> > threeSum(vector<int> &num) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
          vector<vector< int > > result; 
          if(num.size()<3) return result; 
          sort(num.begin(), num.end());
          for(int i=0; i<=num.size()-3; i++)
          {
              int first=num[i];
              if(i!=0 && num[i]==num[i-1]) continue; 
              int j=i+1, k=num.size()-1; 
              while(j<k)
              {               
                  int temp=num[j]+num[k];
                  if(temp==-first)
                  {
                      vector<int> tempResult; 
                      tempResult.push_back(first);
                      tempResult.push_back(num[j]);
                      tempResult.push_back(num[k]);
                      result.push_back(tempResult); 
                      j++; 
                      k--; 
                  }else if(temp<-first)
                  {
                      j++; 
                  }else 
                  {
                      k--;
                  }
                    while(j-1!=i && num[j]==num[j-1])
                      {
                          j++; 
                      }
                    while(k+1!=num.size() && num[k]==num[k+1])
                      {
                          k--; 
                      }
              }
          }
          return result; 
    }
};
