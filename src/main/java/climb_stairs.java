import org.junit.Test;

/**
 * @author xy
 * @date 2017/12/14 22:53
 *
 * leetcode-70
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 *
 * Example 1:
 *
 * Input: 2
 * Output:  2
 * Explanation:  There are two ways to climb to the top.
 *
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output:  3
 * Explanation:  There are three ways to climb to the top.
 *
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 */
public class climb_stairs {
    public static void main(String[] args) {
        int stairs = 44;
        System.out.println(climbStairs(stairs));
    }

    public static int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public static int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }

    /**
     * 解法二(解法一的时间复杂度为O(2n),数字过大会超时)
     *
     * 该算法利用了斐波那契函数，简单明了
     * @param n
     * @return
     */
    public static int climbStairs_2(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    @Test
    public void test(){

    }
}
