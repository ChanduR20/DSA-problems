class Solution {
    public void powerSet(int index,int[] nums,List<Integer>current,List<List<Integer>>ans){
        ans.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
        
        current.add(nums[i]);
        powerSet(i+1,nums,current,ans);
        current.remove(current.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<Integer>current= new ArrayList<>(); 
        List<List<Integer>>ans= new ArrayList<>();
        Arrays.sort(nums);
        powerSet(0,nums,current,ans);
        return ans;
    }
}
