// 给定一个整数数组 nums 和一个目标值 target，
// 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
// 示例:
// 给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// Related Topics 数组 哈希表 
// 👍 9508 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int nums[] = {10, 20, 30, 5};
        int target = 15;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                Integer index=map.get(target-nums[i]);
                System.out.println(index);
                if(index==null){
                    map.put(nums[i],i);
                }else{
                    return new int[]{i,index};
                }
            }
            return new int[]{0,0};}
    }
    //leetcode submit region end(Prohibit modification and deletion)

}