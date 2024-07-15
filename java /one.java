//Given two integers s and d. The task is to find the smallest number such that the sum of its digits is s and the number of digits in the number are d. Return a string that is the smallest possible number. If it is not possible then return -1.


    public String smallestNumber(int s, int d) {
        // code here
        String ans="";
        for (int i=1;i<=d;i++) { 
            for (int j=0;j<10;j++) { 
                if (i==1 && j==0) continue;
                if ((s-j)<=(d-i)*9) { 
                    ans+=j;
                    s-=j;
                    break;
                }
            }
        }
        
        if (s!=0) return "-1";
        
        return ans;
    }




