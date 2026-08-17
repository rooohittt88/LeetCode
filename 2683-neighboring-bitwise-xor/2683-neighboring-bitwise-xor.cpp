class Solution {
public:
    bool doesValidArrayExist(vector<int>& derived) {
        int sum=0;
        for(int i=0;i<size(derived);i++){
            sum^=derived[i];
        }
        if(sum==0) return true;
        return false;
    }
};