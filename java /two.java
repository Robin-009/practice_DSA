
//Given a binary array nums, you should delete one element from it.

//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 
public class two {
    public int longestSubarray(int[] nums) {
        int ans  = 0;

        int i =0;
        int j=-1;
        int count =0;
        while(i<nums.length){
            //acquire
            if(nums[i]==1){
                i++;
            }
            else{
                i++;
                count++;
            }

            //release
            while(count > 1 && j<i){
                j++;
                if(nums[j]==0){
                    count--;
                }
            }

            //consider
            ans = Math.max(ans,i-j-1);

        }

        return ans - 1;
    }
}

