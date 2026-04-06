class allpermutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] freq=new boolean[nums.length+1];
        List<Integer> ds=new ArrayList<>();
        helper(nums,ds,freq,result);
        return result;
        
    }
    void helper(int nums[],List<Integer> ds,boolean[] freq,List<List<Integer>> result){
        if(ds.size()==nums.length)
        {
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                helper(nums,ds,freq,result);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}
