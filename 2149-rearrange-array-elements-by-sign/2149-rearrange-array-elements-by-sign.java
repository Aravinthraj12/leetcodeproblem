class Solution {
    public int[] rearrangeArray(int[] nums) {
    List<Integer> v1=new ArrayList<>();
    List<Integer> v2=new ArrayList<>();
    List<Integer> a=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
    if(nums[i]>0){
        v1.add(nums[i]);
    }
    else{
        v2.add(nums[i]);
    }
    }
    int i1=0;
    int i2=0;
    while(i1<nums.length/2){
        a.add(v1.get(i1));
        i1++;
        a.add(v2.get(i2));
        i2++;
    }
    return a.stream().mapToInt(Integer::intValue).toArray();
    }

}