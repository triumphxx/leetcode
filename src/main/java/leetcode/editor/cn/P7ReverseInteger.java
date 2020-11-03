//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2303 👎 0


package leetcode.editor.cn;

/**
 * 整数反转
 */
public class P7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new P7ReverseInteger().new Solution();
        int reverse = solution.reverse(-12345);
        System.out.println(reverse);
        System.out.println(12 % 10);
        System.out.println(12 / 10);
    }

    class Solution {
        public int reverse(int x) {
            long result = 0;
            while (x != 0) {
                result = result * 10 + x % 10;
                x = x /10;
            }
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                result = 0;
            }
            return (int)result;
        }
    }

}