class Solution {
    public void powerSet(int index,int n,int[] nums,List<Integer>current,List<List<Integer>>ans){
        if(index==n){
            ans.add(new ArrayList<>(current));
            return ;
        }
        powerSet(index+1,n,nums,current,ans);
        current.add(nums[index]);
        powerSet(index+1,n,nums,current,ans);
        current.remove(current.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer>current= new ArrayList<>(); 
        List<List<Integer>>ans= new ArrayList<>();
        powerSet(0,nums.length,nums,current,ans);
        return ans;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     