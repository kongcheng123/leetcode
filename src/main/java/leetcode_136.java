/**
 * @author xy
 * @date 2018/01/03 23:03
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class leetcode_136 {
    public static void main(String[] args) {
        int a[]={2,1,2};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++) {
            ans ^= nums[i];
        }
        return ans;

    }
}
