class Solution { 
    public boolean isMonotonic(int[] nums) { 
        boolean isi = true; 
        boolean isd = true; 
        int n = nums.length; 
        
        for (int i = 1; i < n; i++) { 
            if (nums[i-1] < nums[i])      isd = false; 
            else if (nums[i-1] > nums[i]) isi = false; 
        } 
        
        if (isi == false && isd == false) return false; 
        return true; 
    } 
}
