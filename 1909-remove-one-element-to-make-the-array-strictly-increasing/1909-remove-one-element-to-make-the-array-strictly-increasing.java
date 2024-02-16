class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int last=-1;
            boolean flag=true;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]<=last){
                    flag=false;
                    break;
                }
                last=nums[j];
            }
            if(flag)
            return true;
        }
        return false;
    }
}