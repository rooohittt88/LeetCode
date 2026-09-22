class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int c1=0;
        int c2=0;
        for(int i=0;i<size(nums);i++){
            if(nums[i]==1){
                c1++;
            }
            else c1=0;
            c2=max(c1,c2);
        }
        return c2;
    }
};