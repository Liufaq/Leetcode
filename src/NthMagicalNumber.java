/*一个正整数如果能被 a 或 b 整除，那么它是神奇的。

        给定三个整数 n ,a , b ,返回第 n 个神奇的数字。因为答案可能很大，所以返回答案对10^9+ 7 取模后的值。

         

        示例 1：

        输入：n = 1, a = 2, b = 3
        输出：2
        示例 2：

        输入：n = 4, a = 2, b = 3
        输出：6

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/nth-magical-number
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class NthMagicalNumber {
    static final int MOD = 1000000007;
    public int Res(int n,int a,int b){
        long l = Math.min(a, b);//左边界
        long r = (long) n * Math.min(a, b); // 右边界
        int c = lcm(a, b); //最小公倍数
        while (l <= r) {//二分查找
            long mid = (l + r) / 2;
            long cnt = mid / a + mid / b - mid / c;
            if (cnt >= n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) ((r + 1) % MOD);
    }




    //最大公约数
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //最小公倍数
    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


}
