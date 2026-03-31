class susets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> l=new ArrayList<Integer>();
        helper(result,l,0,nums);
        return result;
        
    }

    public void helper(List<List<Integer>> result,List<Integer> l,int index,int[] nums)
    {
        if(index>=nums.length)
        {
            result.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[index]);

        if(index+1<nums.length)
        {
          helper(result,l,index+1,nums);
        }
        l.remove(Integer.valueOf(nums[index]));
        if(index+1<nums.length)
        {
            helper(result,l,index+1,nums);
        }
    }
}
