class Solution {
public:

    /** vector<int> result;
	for(auto it1=nums.begin(); it1 != nums.end(); ++it1){
			auto it2 = find(it1+1,nums.end(), target- *it1);
			if(it2 !=nums.end()){
					result.push_back(it1 - nums.begin());
					result.push_back(it2 - nums.begin());
					break;

			}
	}
	return result; */

    vector<int> twoSum(vector<int>& nums, int target) {
       unordered_map<int,int> map;
        for(int i=0;i<nums.size();i++){
            int n=nums[i];
            int m= target-n;
            auto it=map.find(m);
            if(it != map.end()){
                return {it->second,i};
            }
            map[n]=i;
        }
        return {};
    }
};
